package com.example.TestAPIs;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaSDETStudent {
	
 
	
	private String name = "unnamed";
    private String lastname = "unnamed";
    private String phoneNumber = "0123456789";
    private int SSN = 123456789;
    private double GPA = 0.0;
    private int studentID = 123456789;
    private String email = "a@b.com";
    Scanner scanner = new Scanner(System.in);

	JavaSDETStudent(){
		
		 	setName();
	        setLastname();
	        setPhoneNumber();
	        setSSN();
	        setGPA();
	        setStudentID();
	        setEmail();
	};
	
	JavaSDETStudent(String name, String lastname, String phoneNum,int SSN, double GPA, int studentID,  String email){
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNum;
		this.SSN = SSN;
		this.GPA = GPA;
		this.studentID = studentID;
		this.email=email;
	}

	 //Setters
    public void setName() {

        System.out.print("Please enter Student Name: ");
        String str = scanner.nextLine();
        this.name = str;
    }

    public void setLastname() {
        System.out.print("\nPlease enter Student lastname: ");

        String str = scanner.nextLine();
        this.lastname = str;
    }

    public void setPhoneNumber( ) {
        System.out.print("\nPlease enter Student phone number: ");

        String str = scanner.nextLine();
        this.phoneNumber = phoneNumber;
    }

    public void setSSN() {
        System.out.print("\nPlease enter Student SSN: ");

        String str = scanner.nextLine();
        this.SSN = Integer.parseInt(str);
    }

    public void setGPA( ) {
        System.out.print("\nPlease enter Student GPA: ");

        String str = scanner.nextLine();
        this.GPA =  Double.parseDouble(str);
    }

    public void setStudentID(  ) {
        System.out.print("\nPlease enter Student ID: ");

        String str = scanner.nextLine();
        this.studentID = Integer.parseInt(str);
    }

    public void setEmail( ) {
        System.out.print("\nPlease enter Student email: ");

        String str = scanner.nextLine();
        this.email = str;
    }


    //Getters
    public String getName() {
//          System.out.print(name);
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSSN() {
        return SSN;
    }

    public double getGPA() {
        return GPA;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }
}