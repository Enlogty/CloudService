package com.enlogy.cloud.repository;

import com.enlogy.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
        User findByPhoneNumber(String phone_number);
        User findByUsername(String username);
}
