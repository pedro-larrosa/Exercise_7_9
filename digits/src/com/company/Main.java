package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int oneDigit=0,twoDigits=0,threeDigits=0,moreThreeDigits=0;
        Scanner scan=new Scanner(System.in);

        System.out.print("Insert a number:");
        String numString=scan.nextLine();
        while (!numString.equals("end")) {
            int num=Integer.parseInt(numString);
            if(num!=0) {
                if (num/10==0) {
                    oneDigit++;
                }else if(num/100==0) {
                    twoDigits++;
                }else if(num/1000==0) {
                    threeDigits++;
                }else {
                    moreThreeDigits++;
                }
            }

            System.out.print("Enter another number:");
            numString=scan.nextLine();
        }

        System.out.println("one:"+oneDigit+" two:"+twoDigits+" three:"+threeDigits+" more:"+moreThreeDigits);
    }
}
