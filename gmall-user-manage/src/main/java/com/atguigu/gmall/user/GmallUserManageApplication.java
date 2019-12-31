package com.atguigu.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@CrossOrigin
@MapperScan(basePackages = "com.atguigu.gmall.user.mapper")
public class GmallUserManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserManageApplication.class, args);
	}

}
