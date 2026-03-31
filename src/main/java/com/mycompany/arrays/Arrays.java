package com.mycompany.arrays;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        
        Scanner tt = new Scanner(System.in);
        String[] name = new String[5]; // gives us the five names starting from zero {"Rene", "Nkoka", "Gomo", "Nobuntu", "Lesego"};
        int[] age = new int[5]; //does the same as line 9, but we store numbers.
        
        for (int a = 0; a < 5; a = a + 1) //lets the compiler to expect 3 statements. 
        {
            
        System.out.println("Enter student " + (a+1) + "'s name:");
        name[a] = tt.next();
        System.out.println("what is" + name[a] + "'s age:");
        age[a] = tt.nextInt();
        }
        
        System.out.println("\n\n\nNames...."); //displays the names
        
        for(int a = 0; a < 5; a++)
        {
            if(age[a] <= 18)
            {
            System.out.println(name[a]);
        }
            
      }
    }
}
