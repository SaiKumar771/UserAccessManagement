package com.spring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.user.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
