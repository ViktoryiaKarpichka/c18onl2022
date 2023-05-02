package com.tms.service;

import static com.tms.model.PagesPath.CART_PAGE;

import com.tms.model.Cart;
import com.tms.model.Product;
import com.tms.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Service
public class CartService {

    private final ProductRepository productRepository;

    public ModelAndView addProductToCart(int productId, Cart shopCart) {
        ModelMap modelParams = new ModelMap();
        Product product = productRepository.getProductById(productId);
        shopCart.addProduct(product);
        modelParams.addAttribute("product", product);
        modelParams.addAttribute("cart", shopCart);
        return new ModelAndView(CART_PAGE.getPath(), modelParams);
    }

    public ModelAndView deleteProductFromCart(int productId, Cart shopCart) {
        //ModelMap modelParams = new ModelMap();
        Product product = productRepository.getProductById(productId);
        shopCart.deleteProduct(product);
        return new ModelAndView(CART_PAGE.getPath());
       /* modelParams.addAttribute("product", product);
        modelParams.addAttribute("cart", shopCart);
        return new ModelAndView(CART_PAGE.getPath(), modelParams);*/
    }

}
