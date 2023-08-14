package com.YEY.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YEY.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
