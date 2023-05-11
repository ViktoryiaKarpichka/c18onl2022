package com.tms.service;

import com.tms.model.Category;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;

public interface CategoryService {

    List<Category> getCategories();

    ModelAndView getCategoryData(int id);
}
