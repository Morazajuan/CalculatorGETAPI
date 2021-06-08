package com.example.TestAPIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Calculator.CalculatorTest.App;

@RestController
public class APITest {

	@GetMapping("/helloMessage/{name}")
	public String message(@PathVariable String name) {
		String message = "<h1>Hello World, my name i s </h1>"+ name;
		System.out.println(message + name);
		return message;
	} 
	
	@GetMapping("/getStudent")
	public JavaSDETStudent getStudent() {
		JavaSDETStudent student = new JavaSDETStudent( "Juan", "Moraza", "70811112", 123020000, 3.3, 655555,"j@mail.com");
		return student;
	}
	
	//Sum
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		App test = new App();
		return test.sum(a, b);
	}
	//Difference
	@GetMapping("/difference/{a}/{b}")
	public int difference(@PathVariable int a, @PathVariable int b) {
		App test = new App();
		return test.difference(a, b);
	}
	//Multiplication
	@GetMapping("/multiplication/{a}/{b}")
	public int multiplication(@PathVariable int a, @PathVariable int b) {
		App test = new App();
		return test.multiplication(a, b);
	}
	//division
	@GetMapping("/division/{a}/{b}")
	public int division(@PathVariable int a, @PathVariable int b) {
		App test = new App();
		return test.division(a, b);
	}
}
