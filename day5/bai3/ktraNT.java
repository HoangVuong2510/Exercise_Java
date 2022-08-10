package day5.bai3;

import java.util.Scanner;

public class ktraNT {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPrime(float n) {
        return false;
    }

    public static boolean isPrime(double n) {
        return false;
    }

    public static void main(String[] args) {
        int a;
        long b;
        float c;
        double d;

        System.out.print("nhap so nguyen kieu int: ");
        a = scanner.nextInt();
        if (isPrime(a))
            System.out.println(a + " la so nguyen to");
        else
            System.out.println(a + " khong la so nguyen to");

        System.out.print("nhap so nguyen kieu long: ");
        b = scanner.nextLong();
        if (isPrime(b))
            System.out.println(b + " la so nguyen to");
        else
            System.out.println(b + " khong la so nguyen to");

        System.out.print("nhap so thuc kieu float: ");
        c = scanner.nextFloat();
        if (isPrime(c))
            System.out.println(c + " la so nguyen to");
        else
            System.out.println(c + " khong la so nguyen to");

        System.out.print("nhap so thuc kieu double: ");
        d = scanner.nextDouble();
        if (isPrime(d))
            System.out.println(d + " la so nguyen to");
        else
            System.out.println(d + " khong la so nguyen to");
    }
}
