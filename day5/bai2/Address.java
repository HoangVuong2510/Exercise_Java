package day5.bai2;

import java.util.Scanner;

public class Address {
    private Scanner scanner = new Scanner(System.in);
    private int id;
    private String quan;
    private String tinh;

    public int getId() {
        return id;
    }

    public String getQuan() {
        return quan;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void input(){
        System.out.print("nhap id dia chi: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhap quan: ");
        quan = scanner.nextLine();
        System.out.print("nhap tinh: ");
        tinh = scanner.nextLine();
    }
    public void output(){
        System.out.printf("%7d%5s%5s\n", id, quan, tinh);
    }
}
