/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment30 {

    public static void main(String[] args) {
        int i;
        List<Character> theList = new ArrayList();
        List<Integer> theList2 = new ArrayList();
        List<Integer> theList3 = new ArrayList();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        for (i = 0; i < username.length(); i++) {

            char a_char = username.charAt(i);

            theList.add(a_char);
        }
        for (i = 0; i < theList.size(); i++) {
            int ascii = 10 + (int) theList.get(i);
            theList2.add(ascii);
        }
        for (i = 0; i < theList2.size(); i++) {
            System.out.println(theList2.get(i));
            int decode = theList2.get(i) - 10;
            theList3.add(decode);
        }
        for (i = 0; i < theList3.size(); i++) {
            String decoded = String.valueOf(Character.toChars(theList3.get(i)));
            System.out.println(decoded);
        }
    }
}
