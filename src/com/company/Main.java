package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //public class Main {
            //public static void main (String [] args){
                Scanner sc = new Scanner(System.in);
                //System.out.println("Введите число в бинарном формате");
                int X = sc.nextInt();
                //System.out.print("Число переведено в двоичный формат: ");
                System.out.println(Integer.toBinaryString(X));

            }
        }

        // write your code here
