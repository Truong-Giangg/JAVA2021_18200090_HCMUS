package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 10;
        for(int j =0; j<5;j++){
            for (int i = 0; i < n -(j*2); i++) {
                System.out.print(i);
            }
            for (int i = 0; i < (n-7)+(j*4); i++) {
                System.out.print(' ');
            }
            for (int i = (n-1)-(j*2); i >=0; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
        for(int j =3; j>=0;j--){
            for (int i = 0; i < n -(j*2); i++) {
                System.out.print(i);
            }
            for (int i = 0; i < (n-7)+(j*4); i++) {
                System.out.print(' ');
            }
            for (int i = (n-1)-(j*2); i >=0; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
