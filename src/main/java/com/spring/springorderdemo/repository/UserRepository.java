package com.spring.springorderdemo.repository;

import com.spring.springorderdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
