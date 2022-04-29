package com.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Users;

public interface UsersDAO extends JpaRepository<Users, Integer >{

	@Query("Select u from Users u where u.email= :emailid" )
	Users findByEmail(@Param("emailid") String emailid);
}