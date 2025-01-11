package com.example.webappassignment3.repository;

import com.example.webappassignment3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);

    User findByUserName(String userName);
}
