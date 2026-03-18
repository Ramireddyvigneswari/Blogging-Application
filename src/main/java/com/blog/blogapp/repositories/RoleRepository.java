package com.blog.blogapp.repositories;

import com.blog.blogapp.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
