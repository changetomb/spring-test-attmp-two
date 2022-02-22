package com.example.springtestattmptwo;

import com.example.springtestattmptwo.dao.PersonService;
import com.example.springtestattmptwo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class SpringTestAttmpTwoApplication {

	@Autowired
	private PersonService personDaoService;


	@RequestMapping
	public String index(Model model)
	{
		model.addAttribute("findAll",personDaoService.findAll());
		return "index";
	}

	@RequestMapping("/save")
	public String save(Person person)
	{
		personDaoService.save(person);
		return "redirect:/";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam int id)
	{
		Person person = personDaoService.getPerson(id);
		personDaoService.delete(person);
		return "redirect:/";
	}
	@RequestMapping("/update")
	public String update(@RequestParam int id,Model model)
	{
		model.addAttribute("person",personDaoService.getPerson(id));
		return "update";
	}
	@RequestMapping("/updated")
	public String updated(Person person)
	{



		personDaoService.updatePerson(person);
		return "redirect:/";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestAttmpTwoApplication.class, args);
	}



}
