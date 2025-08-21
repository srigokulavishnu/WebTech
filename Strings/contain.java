/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.*;
public class contain {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       
       String s = "String express";
       System.out.println("Enter a char to check:");
        String target = sc.nextLine();
        if(s.contains(target)) 
            System.out.println(target+"is present in "+s);
        else
            System.out.println("Not present");
    }
    
}
