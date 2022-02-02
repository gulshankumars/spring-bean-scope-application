package com.sunglowsys;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Student;
import com.sunglowsys.configuration.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

        Student std1 = context.getBean(Student.class);

        System.out.println("ID: " + std1.getId());
        System.out.println("First Name: " + std1.getFirstName());
        System.out.println("Last Name: " + std1.getLastName());
        System.out.println("Email: " + std1.getEmail());
        System.out.println("Mobile: " + std1.getMobile());

        System.out.println();

        Student std2 = context.getBean(Student.class);

        System.out.println("ID: " + std2.getId());
        System.out.println("First Name: " + std2.getFirstName());
        System.out.println("Last Name: " + std2.getLastName());
        System.out.println("Email: " + std2.getEmail());
        System.out.println("Mobile: " + std2.getMobile());

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        System.out.println();

        Address add1 = context.getBean(Address.class);

        System.out.println("ID: " + add1.getId());
        System.out.println("Address Line1: " + add1.getAddressLine1());
        System.out.println("Address Line2: " + add1.getAddressLine2());
        System.out.println("City: " + add1.getCity());
        System.out.println("State: " + add1.getState());
        System.out.println("Country: " + add1.getCountry());
        System.out.println("Zipcode: " + add1.getZipcode());

        System.out.println();

        Address add2 = context.getBean(Address.class);

        System.out.println("ID: " + add2.getId());
        System.out.println("Address Line1: " + add2.getAddressLine1());
        System.out.println("Address Line2: " + add2.getAddressLine2());
        System.out.println("City: " + add2.getCity());
        System.out.println("State: " + add2.getState());
        System.out.println("Country: " + add2.getCountry());
        System.out.println("Zipcode: " + add2.getZipcode());
        System.out.println(add2);

        System.out.println(add1.hashCode());
        System.out.println(add2.hashCode());
    }
}
