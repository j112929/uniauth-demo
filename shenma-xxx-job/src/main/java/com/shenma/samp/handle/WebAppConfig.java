package com.shenma.samp.handle;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

	public static void main1(String[] args) {
		SpringApplication.run(WebAppConfig.class, args);
	}

	/**
	 * 配置拦截器
	 * 
	 * @author lance
	 * @param registry
	 */
	public void addInterceptors(InterceptorRegistry registry) {
		UserSecurityInterceptor userSecurity = new UserSecurityInterceptor();
		InterceptorRegistration interceptorRegistration = registry.addInterceptor(userSecurity);
		interceptorRegistration.addPathPatterns("/*/*");
	}

}
