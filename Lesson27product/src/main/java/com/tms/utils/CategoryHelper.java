package com.tms.utils;

import com.tms.model.Category;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class CategoryHelper {
    public static final List<Category> categories = Arrays.asList(
            new Category(1, "Mobile phones", "mobile.jpeg"),
            new Category(2, "Laptops", "laptop.jpeg"),
            new Category(3, "GPS Navigators", "jps_nav.jpeg"),
            new Category(4, "Fridges", "fridge.jpeg"),
            new Category(5, "Cars", "car.jpeg"),
            new Category(6, "Cameras", "camera.jpeg")
    );
}
