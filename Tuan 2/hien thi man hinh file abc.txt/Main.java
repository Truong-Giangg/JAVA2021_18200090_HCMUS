package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner fileIn = null ; // initializes fileIn to empty
        try
        {
            // Attempt to open the file
            String filePath = "C:/Users/phamv/IdeaProjects/baitap4_tuan2/src/com/company/abc.txt";
            fileIn = new Scanner( new
                    FileInputStream(filePath));

            while (fileIn.hasNextLine())
            {

                String s = fileIn.nextLine();
                System.out.println(s);
            }
        }
        catch (FileNotFoundException e)
        {
            // If the file could not be found, this code is executed
            // and then the program exits
            System.out.println("File not found.");
            System.exit(0);
        }

    }
}
