package com.springrecipe.sts.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springrecipe.sts.shop.Battery;
import com.springrecipe.sts.shop.Disc;
import com.springrecipe.sts.shop.Product;

@Configuration
@ComponentScan("com.springrecipe.sts.shop")
public class ShopConfiguration {
	
	@Bean
	public Product aaa() {
		Battery p1 = new Battery();
		p1.setName("AAA");
		p1.setPrice(2.5);
		p1.setRechargeable(true);
		return p1;
	}
	
	@Bean
	public Product cdrw() {
		Disc p2 = new Disc("CD-rw",1.5);
		p2.setCapacity(700);
		return p2;
	}
	
	@Bean
	public Product dvdrw() {
		Disc p2 = new Disc("DVD-RW",3.0);
		p2.setCapacity(800);
		return p2;
	}
}
