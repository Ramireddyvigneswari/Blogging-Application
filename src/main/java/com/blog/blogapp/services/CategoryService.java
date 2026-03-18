package com.blog.blogapp.services;

import com.blog.blogapp.entities.Category;
import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);

    Category updateCategory(Category category, Long categoryId);

    Category getCategoryById(Long categoryId);

    List<Category> getAllCategories();

    void deleteCategory(Long categoryId);
}
