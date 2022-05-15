package com.company;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Teacher {
    String Username;
    String Password;
    int NoOfStudents;
    String NameOfStudent;
    String RollOfStudent;
    String Attendance;
    String NameOfTeacher,AttendanceOfTeacher;
    Scanner scanner = new Scanner(System.in);
    public Teacher()
    {

    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    void login() throws IOException {
        int i = 0;
        do {


            System.out.println("Enter Username");
            Username = scanner.next();
            System.out.println("Enter Password");
            Password = scanner.next();
            if (getUsername().equals("2") && getPassword().equals("2")) {
                System.out.println("WELCOME TEACHER");
                System.out.println("Enter The Operation You Want To Perform");

                System.out.println("1. Mark Your Attendance");
                System.out.println("2. Mark Attendance Of Students");
                System.out.println("2. Enter Marks");
                int ChoiceTeacher = scanner.nextInt();

                switch(ChoiceTeacher)
                {
                    case 1:
                        File file1 = new File("TeacherAttendance.txt");
                        if(file1.createNewFile())
                        {
                            System.out.println("File Created");
                        }
                        else
                        {
                            System.out.println("No File Was Created");
                        }
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
                        PrintWriter print = new PrintWriter(writer);
                        System.out.println("Enter Your Name");
                        NameOfTeacher = scanner.next();
                        System.out.println("Enter Attendance");
                        AttendanceOfTeacher = scanner.next();
                        print.println(NameOfTeacher);
                        print.println(AttendanceOfTeacher);
                        print.close();
                        break;
                    case 2:
                        File file = new File("Attendance.txt");
                        if(file.createNewFile())
                        {
                            System.out.println("File Created");
                        }
                        else
                        {
                            System.out.println("No File Was Created");
                        }
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                        PrintWriter printWriter = new PrintWriter(bufferedWriter);
                        System.out.println("Enter The Number Of Students In Class");
                        NoOfStudents = scanner.nextInt();


                        for(i = 0 ; i < NoOfStudents; i++ )
                        {
                            System.out.println("ENTER NAME");
                            NameOfStudent = scanner.next();
                            System.out.println("ENTER ROLL NO");
                            RollOfStudent = scanner.next();
                            System.out.println("ENTER ATTENDANCE");
                            Attendance = scanner.next();
                            printWriter.println(NameOfStudent);
                            printWriter.println(RollOfStudent);
                            printWriter.println(Attendance);
                        }
                        printWriter.close();
                        break;
                }


            } else {
                System.out.println("ACCESS DENIED");
            }
            i++;
        }while ( i < 3 );

    }
}
