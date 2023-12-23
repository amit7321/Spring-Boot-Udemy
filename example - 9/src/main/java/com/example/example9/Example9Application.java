package com.example.example9;

import com.example.example9.config.ProjectConfig;
import com.example.example9.pojo.Person;
import com.example.example9.pojo.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Example9Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println(person.getName());
        System.out.println(vehicle.getName());
    }

}
