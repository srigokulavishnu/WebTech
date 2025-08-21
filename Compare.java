/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
package String;
import java.util.*;
public class Compare {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    String s1;
    String s2;
    System.out.println("Enter two strings:");
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    System.out.println(s1.equals(s2));
    System.out.println(s1 == s2);
    System.out.println(s1.compareTo(s2));
    }
    
}
