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
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter two strings");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        if(s1.equals(s2))
            System.out.println("The strings are Anagram");
        else 
        {
            char one[] = s1.toCharArray();
            char two[] = s2.toCharArray();
            Arrays.sort(one);
            Arrays.sort(two);
            for(int i =0;i<one.length;i++)
            {
                if(one[i]!=two[i]) 
                {
                    System.out.println("The strings are not Anagram");
                    return;
                }
            }
            System.out.println("The strings are in Anagram");
            
            
        }
            
    }
}
