package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float S1 = 0, S2 = 0, S3 = 0;
        int count1 = 0, count2 = 0, count3 = 0;
        Scanner keyboard = new Scanner(System.in);
        Scanner fileIn = null ; // initializes fileIn to empty
        try
        {
            // Attempt to open the file
            String filePath = "C:/Users/phamv/IdeaProjects/ADC_trungbinh_tuan2/src/com/company/data.txt";
            fileIn = new Scanner( new
                    FileInputStream(filePath));

            while (fileIn.hasNextLine())
            {

                String s = fileIn.nextLine();
                if(s.indexOf(',')!=-1){ // ktra neu co dau ,
                    s = s.substring(s.indexOf(",") + 1).trim(); // cat tu dau , dau tien
                    float temp = Float.parseFloat(s.substring(s.indexOf(",") + 1).trim()); // string to float (dau , thu 2)
                    if(s.charAt(3)=='1'){ // ktra kytu thu 3 trong chuoi
                        count1++;
                        S1 = S1 + temp;
                    }
                    if(s.charAt(3)=='2'){
                        count2++;
                        S2 = S2 + temp;
                    }
                    if(s.charAt(3)=='3'){
                        count3++;
                        S3 = S3 + temp;
                    }
                }else {
                    if(s.indexOf('#')!=-1){ // ktra neu dong co dau #
                        S1 = S1/count1;
                        S2 = S2/count2;
                        S3 = S3/count3;
                        s = s.substring(s.indexOf("#") + 1, 9).trim(); // cat 9 kytu sau # dau tien
                        if(count1!=0) System.out.println("ADC1 "+S1+" "+s);
                        if(count2!=0) System.out.println("ADC2 "+S2+" "+s);
                        if(count3!=0) System.out.println("ADC3 "+S3+" "+s);
                        S1 = S2 = S3 =0;
                        count1 = count2 = count3 = 0;
                    }

                };
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
