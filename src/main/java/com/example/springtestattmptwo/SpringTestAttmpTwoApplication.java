package com.example.springtestattmptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringTestAttmpTwoApplication {

	@RequestMapping("/")
	public String get()
	{
		return "index request";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestAttmpTwoApplication.class, args);
	}



}
