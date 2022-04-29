package com.restaurant.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.entities.Pricing;
import com.restaurant.service.PricingService;
@RestController

public class PricingController {
	@Autowired
		private PricingService pricingService;
		
		@GetMapping("/pricing")
		public List<Pricing> getPricing(){
			return this.pricingService.getPricing();
		}
		
	}

