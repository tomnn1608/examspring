package com.examspring.examspring.repository;

import com.examspring.examspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByNameContaining(String name);
}