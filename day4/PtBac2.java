package day4;

import java.util.Scanner;

/*
* Bài 3: (25đ) Khai báo ra một lớp phương trình bậc 2 (dạng ax^2 + bx + c = 0)
với 3 thuộc tính là a, b, c, các phương thức nhập, xuất, tính nghiệm.
Khai báo 1 đối tượng PtBac2 a, nhập thông tin cho nó và in ra nghiệm của phương trình.
* */
public class PtBac2 {
    public static Scanner scanner = new Scanner(System.in);
    private float a;
    private float b;
    private float c;
    public void input(){
        do {
            System.out.print("nhap a: ");
            a = scanner.nextFloat();
            scanner.nextLine();
            if(a == 0)
                System.out.println("a != 0. nhap lai");
        }while (a == 0);
        System.out.print("nhap b: ");
        b = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("nhap c: ");
        c = scanner.nextFloat();
        scanner.nextLine();
    }
    public void output(){
        if(b > 0)
            System.out.print(a + "x^2 + " + b + "x + " + c + " = 0");
        else if(b == 0)
            System.out.print(a + "x^2 + " + c + " = 0");
        else
            System.out.print(a + "x^2 - " + -b + "x + " + c + " = 0");
    }

    public void giaiPTB2(){
        float delta = b*b - 4*(a*c);
        if(delta < 0)
            System.out.println("\npt vo nghiem");
        else if(delta == 0)
            System.out.printf("\npt co nghiem kep x1 = x2 = " + -b/2*a);
        else
            System.out.printf("\npt co 2 nghiem phan biet:\nx1 = " + (-b+Math.sqrt(delta))/2*a + "\nx2 = " + (-b-Math.sqrt(delta))/2*a);
    }

    public static void main(String[] args) {
        PtBac2 a = new PtBac2();

        a.input();
        System.out.print("ptb2 vua nhap: ");
        a.output();
        a.giaiPTB2();
    }
}