package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] test) {
		System.out.println("시스템 활성화 인입");
		SpringApplication.run(DemoApplication.class, test);
		System.out.println("시스템 활성화 완료");
	}

}
