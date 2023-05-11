package com.tms.service.impl;

import static com.tms.model.PagesPath.CATEGORY_PAGE;

import com.tms.model.Category;
import com.tms.model.Product;
import com.tms.repository.CategoryRepository;
import com.tms.service.CategoryService;
import com.tms.service.ProductService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ProductService productService;

    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    @Override
    public ModelAndView getCategoryData(int id) {
        ModelMap model = new ModelMap();
        Category category = categoryRepository.getCategoryById(id);
        if (Optional.ofNullable(category).isPresent()) {
            List<Product> products = productService.getProductsByCategoryId(category.getId());
            category.setProductList(products);
            model.addAttribute("category", category);
        }
        return new ModelAndView(CATEGORY_PAGE.getPath(), model);
    }
}
