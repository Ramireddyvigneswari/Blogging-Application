package com.blog.blogapp.controllers;

import com.blog.blogapp.entities.Category;
import com.blog.blogapp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // CREATE CATEGORY
    @PostMapping("/")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category created = categoryService.createCategory(category);
        return ResponseEntity.ok(created);
    }

    // UPDATE CATEGORY
    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category, @PathVariable Long id) {
        Category updated = categoryService.updateCategory(category, id);
        return ResponseEntity.ok(updated);
    }

    // GET CATEGORY BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        Category category = categoryService.getCategoryById(id);
        return ResponseEntity.ok(category);
    }

    // GET ALL CATEGORIES
    @GetMapping("/")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    // DELETE CATEGORY
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.ok("Category deleted successfully");
    }
}
