package com.haqq.microserviceregister.repository;

import com.haqq.microserviceregister.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByName(String username);
}
