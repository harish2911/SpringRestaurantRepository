package com.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.entities.Pricing;

@Service
public interface PricingService {
	
	public List<Pricing> getPricing();

}