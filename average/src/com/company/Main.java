package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num,average,counter=0,total=0;
        String numString;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a number:");
        numString=scan.nextLine();
        while (!numString.equals("end")) {
            num=Double.parseDouble(numString);
            counter++;
            total+=num;
            System.out.print("Enter a number:");
            numString=scan.next();
        }

        if (counter!=0) {
            average=total/counter;
            System.out.println("The average is " + average);
        }
    }
}
