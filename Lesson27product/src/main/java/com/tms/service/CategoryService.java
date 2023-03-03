package com.tms.service;

import com.tms.model.Category;
import com.tms.repository.CategoryRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.getCategory(id);
    }
}
