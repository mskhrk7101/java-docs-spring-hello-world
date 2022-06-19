package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello APEX";
	}

	@RequestMapping("/aaa")
	String sayHello1() {
		return "Hello APEX";
	}

	@RequestMapping("/resthello")
	String hello1(){
		LocalDateTime aaaa = LocalDateTime.now();
		return "Hello.It works!" + aaaa + "現在時刻はです";
	}

	@RequestMapping("/hello")
	Model hello(Model model){
		model.addAttribute("time",LocalDateTime.now());
		return model;
	}
}
