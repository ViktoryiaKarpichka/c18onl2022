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
        return shop.getProducts().add(product);
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

    //немного не понимаю, редактировать на основании чего?
// * редактировать товар(принимает объект товара и редактирует им список товаров)
    @Override
    public void editProduct(int id, String name, int price, Product product) {
        for (Product products : shop.getProducts()) {
            if (products.getName().equals(name)) {
                products.setName(name);
                break;
            }
            if (products.getPrice() == price) {
                product.setPrice(price);
                break;
            }
            if (products.getId() == id) {
                product.setPrice(price);
                break;
            }
        }
    }
}
