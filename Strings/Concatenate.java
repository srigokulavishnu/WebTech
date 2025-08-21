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
public class Concatenate {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        
        System.out.println("Enter two strings: ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println("String 1:"+s1);
        System.out.println("String 2 :"+s2);
        
        System.out.println("Concatinated string (s1+s2):" + s1.concat(s2));
        
    }
    
    
}
