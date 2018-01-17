package com.shenma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
@ImportResource(value={"classpath:/spring/spring-context.xml"})
//"classpath:/spring/spring-mq.xml","classpath:/spring/dubbo-provider.xml","classpath:/spring/spring-config.xml",
@SpringBootApplication
public class ShenmaWebApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShenmaWebApplication.class);
	}
	
	public static void main(String[] args) {
        SpringApplication.run(ShenmaWebApplication.class, args);
    }
}