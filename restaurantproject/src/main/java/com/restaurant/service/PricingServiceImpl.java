package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.PricingDAO;
import com.restaurant.entities.Pricing;



@Service
public class PricingServiceImpl implements PricingService{

	@Autowired
	private PricingDAO pricingDao;
	
	@Override
	public List<Pricing> getPricing() {
	return pricingDao.findAll();
	}
	
}