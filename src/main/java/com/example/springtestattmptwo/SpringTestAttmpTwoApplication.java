package com.example.springtestattmptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class SpringTestAttmpTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestAttmpTwoApplication.class, args);
	}


	@GetMapping(value = "/")
	@ResponseBody
	public String get()
	{
		return "index get";
	}

	@PostMapping(value = "/")
	@ResponseBody
	public String post()
	{
		return "index post";
	}
}
