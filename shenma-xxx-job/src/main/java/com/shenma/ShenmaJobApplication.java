package com.shenma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value={"classpath:/spring/spring-config.xml","classpath:/spring/spring-job.xml"})//,"classpath:/spring/spring-mq.xml"
@SpringBootApplication
public class ShenmaJobApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShenmaJobApplication.class);
	}
	public static void main(String[] args) {
        SpringApplication.run(ShenmaJobApplication.class, args);
    }
	

}