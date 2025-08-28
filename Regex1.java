/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regex;

/**
 *
 * @author student
 */
import java.util.*;
 import java.util.regex.*;
public class Regex1 {
        public static void main(String args[])
        {
           
        String text ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strig:");
        text = sc.nextLine();
        Pattern pattern = Pattern.compile("\\bthe\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("The string contains the word 'the'.");
        } else {
            System.out.println(" The string does not contain the word 'the'.");
        }
    }
}

        
    

