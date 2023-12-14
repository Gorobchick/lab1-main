package com.example.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/car")
    public String car(@RequestParam(value = "name", defaultValue = "Car") String name) {
        return String.format("Car %s!", name);
    }

    @GetMapping("/getCar")
    public String newCar() {
        String name;

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = context.getBean(Car.class);
        name = car.getName();

        context.close();
        return String.format("Car`\s name is ", name);
    }
}
