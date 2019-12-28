package com.qing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qing.mapper")
public class CyclopediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyclopediaApplication.class, args);
	}

}
