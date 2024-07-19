package com.spring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
