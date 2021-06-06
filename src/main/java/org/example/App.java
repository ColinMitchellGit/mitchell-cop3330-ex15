/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = input.nextLine();

        if(password.equals("abc$123")) {
            System.out.println("Welcome!");
        }else {
            System.out.println("I don't know you.");
        }
    }
}
