/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regex;

import java.util.Scanner;

/**
 *
 * @author student
 */
import java.util.regex.*;
public class Regex3 {
    public static void main(String args[]){
        String text ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mail:");
        text = sc.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        
        if(matcher.matches())
            System.out.println("Valid email");
        else
            System.out.println("Invalid Email");
        
    }
}
   
