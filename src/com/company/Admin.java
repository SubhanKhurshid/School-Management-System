package com.company;
import java.io.*;

import java.util.Scanner;

public class Admin implements Serializable{
    String Username;
    String Password;
    String StudentName;
    String StudentClass;
    String StudentAge;
    String StudentRollNo;
    public Admin() throws IOException {

    }

    public Admin(String studentName, String studentClass, String studentAge, String studentRollNo) throws IOException {
        StudentName = studentName;
        StudentClass = studentClass;
        StudentAge = studentAge;
        StudentRollNo = studentRollNo;
    }
    public String toString()
    {
        return StudentName+" "+StudentClass+" "+StudentAge+" "+StudentRollNo;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    void login() throws Exception {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Enter Username");
             Username = scanner.next();
            System.out.println("Enter Password");
             Password = scanner.next();

            if(getUsername().equals("1") && getPassword().equals("1"))
            {


                System.out.println("WELCOME ADMIN");
                System.out.println("Enter The Operation You Want To Perform");
                System.out.println("1. ADD STUDENT");
                System.out.println("2. DELETE STUDENT");
                System.out.println("3. MODIFY RECORD OF STUDENT");
                System.out.println("4. ADD TEACHER");
                System.out.println("5. DELETE TEACHER");
                System.out.println("6. MODIFY RECORD OF TEACHER");
                int Operation = scanner.nextInt();

                switch(Operation)
                {
                    case 1:
                        File file = new File("school.txt");
                        try{
                            if(file.createNewFile())
                            {
                                System.out.println("file created");
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                        PrintWriter pw = new PrintWriter(bw);
                        System.out.println("Enter The Number Of Students You Want To Add");
                        int number = scanner.nextByte();
                        for(i = 0 ; i<number ; i++) {
                            System.out.println("Enter Student Name");
                            StudentName = scanner.next();
                            System.out.println("Enter Student Class");
                            StudentClass = scanner.next();
                            System.out.println("Enter Student Age");
                            StudentAge = scanner.next();
                            System.out.println("Enter Student Roll No");
                            StudentRollNo = scanner.next();
                            pw.println(StudentName);
                            pw.println(StudentClass);
                            pw.println(StudentAge);
                            pw.println(StudentRollNo);
                            pw.close();
                        }
                        break;
                    case 2:

                        break;
                    case 3:
                        System.out.println("Enter The File Path");



                }
                    break;
                }

            else
            {
                System.out.println("ACCESS DENIED");
            }
            i++;
        }while (i < 3);

    }
}