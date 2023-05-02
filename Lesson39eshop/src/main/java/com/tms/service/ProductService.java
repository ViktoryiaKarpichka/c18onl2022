package com.tms.service;

import com.tms.model.Product;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;

public interface ProductService {

    List<Product> getProductsByCategoryId(int categoryId);

    public ModelAndView getProductData(int id);
}
