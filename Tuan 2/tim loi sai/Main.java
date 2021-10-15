//https://stackoverflow.com/questions/35809185/and-in-while-loop-problems
package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "";
        char c = ' ';
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Enter 'A' for option A"+"or 'B' for option B");

            s=keyboard.next();
            s = s.toLowerCase();
            //System.out.println("s la "+s);
            c = s.charAt(0);

        }while((c!='a')&&(c!='b'));
        // khi dung || c phai = 'a' dong thoi vua bang 'b'(bat kha thi) thi vong lap moi dung -> lap vo han
        System.out.println("chon xong option "+ c);
    }
}
