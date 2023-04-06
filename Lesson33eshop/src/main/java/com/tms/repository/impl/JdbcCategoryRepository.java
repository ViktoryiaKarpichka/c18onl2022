package com.tms.repository.impl;

import com.tms.model.Category;
import com.tms.repository.CategoryRepository;
import com.tms.repository.utils.ConnectionPool;
import com.tms.repository.utils.ConnectionWrapper;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JdbcCategoryRepository implements CategoryRepository {

    private ConnectionPool connectionPool;

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = CONNECTION_POOL.getConnectionWrapper();
                Statement statement = connectionWrapper.getConnection().createStatement()) {
            String sql = "select * from categories";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                categories.add(
                        Category.builder()
                                .id(resultSet.getInt("id"))
                                .name(resultSet.getString("name"))
                                .imageName(resultSet.getString("imageName"))
                                .build());
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        List<Category> categories = getCategories();
        return categories.stream()
                         .filter(product -> product.getId() == id)
                         .findFirst()
                         .orElse(null);
    }
}
