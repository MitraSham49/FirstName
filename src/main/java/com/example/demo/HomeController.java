package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;
@Controller
public class HomeController {
    @RequestMapping("/")
    public  @ResponseBody String loadForm() {
//
        Person d = new Person();

        d.setFirstName("Dave");
        d.setLastName("Wolf");
        d.setPhoneNumber("301-300-3000");
        d.setEmail("email@gmail.edu");

        System.out.println("It's great to meet you " + d.getFirstName() + d.getLastName() + " !" + "Can I call you " + d.getFirstName());

        System.out.println("our phone number is  " + d.getPhoneNumber() + " ,  " + "and your e-mail address is " + d.getEmail());

        //1. Create a console application that accepts input for each item, and prints out:

        //It's great to meet you (first name + last name)! Can I call you (firstname)?

        //Your phone number is (phone number), and your e-mail address is (e-mail address).
return "It's great to meet you " + d.getFirstName() + d.getLastName() + " !" + "Can I call you " + d.getFirstName()+"our phone number is  " + d.getPhoneNumber() + " ,  " + "and your e-mail address is " + d.getEmail();


    }

    @RequestMapping("/showPerson")
    public String loadPerson(Model model){
//
        Person d1 = new Person();

        d1.setFirstName("Dave");
        d1.setLastName("Wolf");
        d1.setPhoneNumber("301-300-3000");
        d1.setEmail("email@gmail.edu");

         model.addAttribute("person", d);
        //System.out.println("It's great to meet you " + d.getFirstName() + d.getLastName() + " !" + "Can I call you " + d.getFirstName());

        //System.out.println("our phone number is  " + d.getPhoneNumber() + " ,  " + "and your e-mail address is " + d.getEmail());

        //1. Create a console application that accepts input for each item, and prints out:

        //It's great to meet you (first name + last name)! Can I call you (firstname)?

        //Your phone number is (phone number), and your e-mail address is (e-mail address).
        return "index";


    }


}

