package com.tms.services;

import com.tms.models.Product;
import com.tms.models.Shop;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.ListIterator;

@AllArgsConstructor
public class ServiceShop implements ShopServiceAware {
    private Shop shop;

    @Override
    public List<Product> getProducts() {
        return shop.getProducts();
    }

    @Override
    public boolean addProduct(Product product) {
        if (!shop.getProducts().contains(product)) {
            return shop.getProducts().add(product);
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Product product) {
        ListIterator<Product> productListIterator = shop.getProducts().listIterator();
        while (productListIterator.hasNext()) {
            Product productForDelete = productListIterator.next();
            if (productForDelete.getId() == product.getId()) {
                productListIterator.remove();
                return true;
            }
        }
        return false;
        // return shop.getProducts().removeIf(product1 -> product1.getId() == product.getId());
    }

    @Override
    public void editProduct(Long id, String name, int price) {
        for (Product products : shop.getProducts()) {
            if (products.getId() == id) {
                products.setName(name);
                products.setPrice(price);
                break;
            }
        }
    }
}
