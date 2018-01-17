package com.shenma;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@MapperScan("com.shenma.xxx.mapper")
@ImportResource(value={"classpath:/config/dubbo.xml","classpath:/config/spring-kafka-producer.xml","classpath:/config/spring-config.xml",})
@SpringBootApplication
public class ShenmaApiApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShenmaApiApplication.class);
	}
	public static void main(String[] args) {
        SpringApplication.run(ShenmaApiApplication.class, args);
    }
	

}