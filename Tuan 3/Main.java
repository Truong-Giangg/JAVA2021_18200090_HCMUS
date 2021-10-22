package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BigDecimal input1, input2, result1;
        System.out.print("Nhap so A \n");
        input1 = new BigDecimal(in.next());
        System.out.print("Nhap so B  \n");
        input2 = new BigDecimal(in.next());
        System.out.print("Chon phep tinh  " +
                "\n1.A+B" +
                "\n2.A-B" +
                "\n3.A*B" +
                "\n4.A/B" +
                "\n5.A^B" +
                "\n#Nhap so 1 -> 5 de chon \n");
        double userOption = in.nextDouble();
        double addition = 1;
        double subtraction = 2;
        double multiplication = 3;
        double division = 4 ;
        double power = 5;
        if (userOption == addition) {
            result1 = input1.add(input2);
            System.out.println(input1 + " + " + input2 + " = " + result1);  }
        else if (userOption == subtraction)  {
            result1 = input1.subtract(input2);
            System.out.println(input1 + " - " + input2 + " = " + result1);	}
        else if (userOption == multiplication)	{
            result1 = input1.multiply(input2);
            System.out.println(input1 + " - " + input2 + " = " + result1);	}
        else if (userOption == division)   {
            result1 = input1.divide(input2);
            System.out.println(input1 + " - " + input2 + " = " + result1);	}
        else if (userOption == power)	{
            System.out.println(input1.pow(input2.intValue()));
        }
    }
}
