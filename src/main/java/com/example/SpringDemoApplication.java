package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	// = @Controller + @ResponseBody:응답을 해주는 공간
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	
	@GetMapping(value = "/")		// 경로지정
	public String HelloWorid() {
		return "Hello World!";
	}

}
