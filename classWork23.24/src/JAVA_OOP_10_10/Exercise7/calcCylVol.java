package JAVA_OOP_10_10.Exercise7;

import java.util.Scanner;

public class calcCylVol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double radius = scanner.nextInt();
        double height = scanner.nextInt();

        double vol = pi * radius * height;

        System.out.println(vol);
    }
}