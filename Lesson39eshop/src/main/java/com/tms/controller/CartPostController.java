package com.tms.controller;

import static com.tms.model.PagesPath.CART_PAGE;

import com.tms.model.Cart;
import com.tms.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
@SessionAttributes({"cart"})
@RequestMapping("/cart")
public class CartPostController {

    private final CartService cartService;

    @GetMapping("/add")
    public ModelAndView addProductToCart(@RequestParam("product_id") String id, @ModelAttribute("cart") Cart shopCart) {
        int productId = Integer.parseInt(id);
        return cartService.addProductToCart(productId, shopCart);
    }

    @GetMapping("/delete")
    public ModelAndView deleteProductFromCart(@RequestParam("product_id") String id, @ModelAttribute("cart") Cart shopCart) {
        int productId = Integer.parseInt(id);
        return cartService.deleteProductFromCart(productId, shopCart);
    }

    @GetMapping("/open")
    public ModelAndView openShoppingCart() {
        return new ModelAndView(CART_PAGE.getPath());
    }

    @ModelAttribute("cart")
    public Cart shoppingCart() {
        return new Cart();
    }
}

