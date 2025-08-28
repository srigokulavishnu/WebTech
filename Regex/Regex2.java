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
public class Regex2 {
  
    public static void main(String[] args) {
      
         String text ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strig:");
        text = sc.nextLine();
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()) {
            System.out.println(" The string contains at least one digit.");
        } else {
            System.out.println(" The string does not contain any digit.");
        }
    }
}

    
