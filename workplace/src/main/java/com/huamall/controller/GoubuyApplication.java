package com.huamall.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@MapperScan("com.huamall.dao")
@ComponentScan("com.huamall")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GoubuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoubuyApplication.class, args);
	}

}
