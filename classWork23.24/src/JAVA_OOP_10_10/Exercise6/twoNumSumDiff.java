package JAVA_OOP_10_10.Exercise6;

import java.util.Scanner;

public class twoNumSumDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

        int diff = num1 - num2;
        System.out.println(diff);

        int prod = num1 * num2;
        System.out.println(prod);

        int rem = num1 / num2;
        System.out.println(rem);
    }
}
