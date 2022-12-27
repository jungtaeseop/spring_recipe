package com.springrecipe.sts.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.springrecipe.sts.sequence");
		
		SequenceDao sequenceDao = context.getBean(SequenceDao.class);
		
		System.out.println(sequenceDao.getSequence("IT").toString());
		System.out.println(sequenceDao.getNextValue("IT"));
		System.out.println(sequenceDao.getNextValue("IT"));
	}
}
