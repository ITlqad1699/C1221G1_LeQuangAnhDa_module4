package com.codegym.demo.repository;

import com.codegym.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserRepository extends JpaRepository<User,Integer> {
//    @Query
//    List<User> findAll()
}
