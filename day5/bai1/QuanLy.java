package day5.bai1;

import java.util.Scanner;

public class QuanLy {
    private Scanner scanner = new Scanner(System.in);
    private String maQL;
    private String hoTenQL;
    public void input(){
        System.out.print("nhap ma QL: ");
        maQL = scanner.nextLine();
        System.out.print("nhap ho ten QL: ");
        hoTenQL = scanner.nextLine();
    }

    public void output(){
        System.out.println("Ma QL: " + maQL);
        System.out.println("Ho Ten QL: " + hoTenQL);
    }
}
