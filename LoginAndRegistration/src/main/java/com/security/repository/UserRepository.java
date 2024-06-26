package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.security.model.User;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
     public boolean existsByEmail(String email);
     public User findByEmail(String email);
}
