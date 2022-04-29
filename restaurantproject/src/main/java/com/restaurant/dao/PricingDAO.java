package com.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.entities.Pricing;

public interface PricingDAO extends JpaRepository<Pricing, Integer >{

}