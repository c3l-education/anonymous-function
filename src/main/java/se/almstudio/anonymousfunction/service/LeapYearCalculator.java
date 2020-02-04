package se.almstudio.anonymousfunction.service;

import java.util.Scanner;

public class LeapYearCalculator {

    public static void main(String[] args) {
        LeapYear a;
        a = () ->
        {
            boolean isLeapyear = false;
            while (isLeapyear == false) {
                Scanner myObj = new Scanner(System.in);
                int year;
                System.out.println("enter a year between 2012-2060:");
                year = myObj.nextInt();
                int x = year % 4;
                int y = year % 100;
                int z = year % 400;
                if ((x == 0) & (y != 0) || z == 0) {
                    //When a user enter a leap year the program will be finished
                    System.out.println(year + " is leap year");
                    isLeapyear = true;
                } else {
                    //When a user does not enter a leap year the program keep asking
                    System.out.println(year + " is not leap year");
                    isLeapyear = false;
                }
            }
        };
        a.isleapornot();
    }
}
