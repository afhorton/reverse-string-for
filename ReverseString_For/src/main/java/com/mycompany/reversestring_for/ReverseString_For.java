/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversestring_for;

/**
 *
 * @author allenhorton
 */
import java.util.Scanner;

public class ReverseString_For {

    public static void main(String[] args) {
        String str;
      
        Scanner sc=new Scanner(System.in);
        System.out.print("Tell me something: ");
        str=sc.nextLine();
        System.out.println("You said '" + str + "'.  Here\'s how you say it"
                + " backwards :");
        for(int j=str.length(); j > 0; --j) {
            System.out.print(str.charAt(j-1));
        }
    }
}
