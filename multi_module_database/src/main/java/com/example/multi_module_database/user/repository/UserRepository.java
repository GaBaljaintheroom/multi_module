package com.example.multi_module_database.user.repository;

import com.example.multi_module_database.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
