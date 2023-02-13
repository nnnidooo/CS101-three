package B;

import java.util.Scanner;

public class CPRChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your CPR number");
        String cpr = sc.next();
        System.out.println(isValidCPRNumber(cpr));

    }

    public static boolean isValidCPRNumber(String cpr) {
        if (cpr.length() != 10) {
            return false;
        }
        int day = Integer.parseInt(cpr.substring(0, 2));
        int month = Integer.parseInt(cpr.substring(2, 4));
        if (day > 31 || month > 12) {
            return false;
        } else {
            return true;
        }
    }

}
//Write a method that returns if a user has input a valid CPR number.
//A valid CPR number has: 10 digits,
//The first 2 digits are not above 31.
//The middle 2 digits are not above 12.