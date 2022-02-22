package com.example.springtestattmptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class SpringTestAttmpTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestAttmpTwoApplication.class, args);
	}


	@RequestMapping
	@ResponseBody
	public String get()
	{
		return "index request";
	}

	@GetMapping(value = "/")
	@ResponseBody
	public String post()
	{
		return "index get";
	}
}
