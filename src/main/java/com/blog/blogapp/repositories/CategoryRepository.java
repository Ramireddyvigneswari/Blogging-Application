package com.blog.blogapp.repositories;

import com.blog.blogapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}