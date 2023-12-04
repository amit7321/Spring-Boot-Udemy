package org.example;

import beans.Vehicle;
import configuration.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        /*Vehicle vehicle2 = context.getBean("range rover", Vehicle.class);
        Vehicle vehicle3 = context.getBean("bmw", Vehicle.class);*/
        /*String hello = context.getBean(String.class);
        Integer number = context.getBean(Integer.class);*/

        System.out.println(vehicle1.getName());
        /*System.out.println(vehicle2.getName());
        System.out.println(vehicle3.getName());*/


    }
}