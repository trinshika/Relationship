package com.management.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.app.model.User;

@Repository
public interface UserIRepo extends JpaRepository<User, Long> {

}
