package com.example.springtestattmptwo;

import com.example.springtestattmptwo.dao.PersonService;
import com.example.springtestattmptwo.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringTestAttmpTwoApplicationTests {


	@Autowired
	PersonService personService;
	@Test
	void contextLoads() {


		List<Person> people = personService.findAll();
		System.out.println(people.size());

	}

}
