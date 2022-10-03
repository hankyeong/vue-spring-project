package com.vue.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@MapperScan("com.vue.spring.mapper")
//@ComponentScan(basePackages = {"com.vue.spring.mapper"})
public class VueSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringApplication.class, args);
	}
}
