package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dikdörtgenin genişliği: ");
        double width = scanner.nextDouble();
        System.out.print("Dikdörtgenin yüksekliği: ");
        double height = scanner.nextDouble();
        System.out.println("Dikdörtgenin alanı: " + area(width, height));

        System.out.print("Dairenin yarıçapı: ");
        double radius = scanner.nextDouble();
        System.out.println("Dairenin alanı: " + area(radius));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && (clock < 8 || clock >= 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}