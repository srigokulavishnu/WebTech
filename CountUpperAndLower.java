/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author student
 */
import java.util.*;
public class CountUpperAndLower {
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = sc.nextLine();
        int u=0,l=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                u++;
            } else if (Character.isLowerCase(ch)) {
                l++;
            }
        }

        System.out.println("Uppercase letters: " + u);
        System.out.println("Lowercase letters: " + l);

                             
         
    }
    
}
