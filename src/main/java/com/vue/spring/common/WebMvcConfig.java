package com.vue.spring.common;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		LoginIntercepter loginIntercepter = new LoginIntercepter();
		registry.addInterceptor(loginIntercepter)
				.addPathPatterns()
				.excludePathPatterns();
	}
}
