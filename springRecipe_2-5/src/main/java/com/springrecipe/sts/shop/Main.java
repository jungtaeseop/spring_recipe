package com.springrecipe.sts.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springrecipe.sts.shop.config.ShopConfiguration;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);
		
		Product aaa = context.getBean("aaa",Product.class);
		Product cdrw = context.getBean("cdrw",Product.class);
		Product dvdrw = context.getBean("dvdrw", Product.class);
		
		ShoppingCart cart1 = context.getBean("shoppingCart",ShoppingCart.class);
		cart1.addItem(aaa);
		cart1.addItem(cdrw);
		
		cart1.getItems().forEach(item -> {
				System.out.println("Shopping cart 1 contains "+item.getName() +" "+ item.getPrice());
		});

		ShoppingCart cart2 = context.getBean("shoppingCart",ShoppingCart.class);
		cart2.addItem(dvdrw);
		
		cart2.getItems().forEach(item -> {
				System.out.println("Shopping cart 2 contains "+item.getName() +" "+ item.getPrice());
		});
	}

}
