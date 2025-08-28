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
public class Regex4 {
    public static void main(String args[]){
        String text ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strig:");
        text = sc.nextLine();
        
        String result = text.replaceAll("\\d", "*");
        System.out.println("Modified string : "+ result);
    
    }
}
