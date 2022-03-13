package com.company;
import java.util.Scanner;
import static com.company.Exercise.Calculate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your number: ");

        Scanner in1 = new Scanner(System.in);

        int number = in1.nextInt(),originalNumber = number, remainder = 0, result = 0;

        Calculate(number);

    }
}
