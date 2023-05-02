package com.tms.model;

public enum PagesPath {
    PROFILE_PAGE("profile"),
    HOME_PAGE("home"),
    CART_PAGE("cart"),
    SIGN_IN_PAGE("signin"),
    PRODUCT_PAGE("product"),
    CATEGORY_PAGE("category");

    private final String path;

    PagesPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
