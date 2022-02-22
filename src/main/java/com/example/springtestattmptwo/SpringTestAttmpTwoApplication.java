package com.example.springtestattmptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringTestAttmpTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestAttmpTwoApplication.class, args);
	}


	@RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String index()
	{
		return "index";
	}
}
