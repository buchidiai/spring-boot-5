package com.springboot5.springboot5;

import com.springboot5.springboot5.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot5Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Springboot5Application.class, args);

		//get bean
		//lower class MyController
		MyController controller = (MyController) ctx.getBean("myController");

		//call bean
		controller.hello();
	}

}
