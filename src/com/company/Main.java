package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To School Management System App");
        System.out.println("Enter The Section You Want To Access");
        System.out.println("1. FOR ADMIN");
        System.out.println("2. FOR TEACHER");
        System.out.println("3. FOR STUDENT");

        int Section = scanner.nextInt();

        switch(Section)
        {
            case 1:
                Admin admin = new Admin();
                admin.login();
                break;
            case 2:
                Teacher teacher = new Teacher();
                teacher.login();
                break;
            case 3:
                Student student = new Student();
                break;


        }

    }
}
