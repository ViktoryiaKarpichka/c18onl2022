package com.tms.service.impl;

import static com.tms.model.PagesPath.PRODUCT_PAGE;

import com.tms.model.Product;
import com.tms.repository.ProductRepository;
import com.tms.service.ProductService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepository.getProductsByCategoryId(categoryId);
    }

    @Override
    public ModelAndView getProductData(int id) {
        ModelMap modelMap = new ModelMap();
        Product product = productRepository.getProductById(id);
        if (Optional.ofNullable(product).isPresent()) {
            modelMap.addAttribute("product", product);
        }
        return new ModelAndView(PRODUCT_PAGE.getPath(), modelMap);
    }
}
