package day4;

import java.util.Scanner;

/*
* Bài 4: (25đ) Xây dựng lớp Employee (nhân viên) có các thuộc tính:
string id (mã nhân viên)
string name (họ tên)
int age (tuổi)
int workingDays (số ngày công)
double salary.
Và một hằng số tên là PRICE có giá trị là 50.
Yêu cầu:
Viết các phương thức thiết lập (getter, setter, constructor) và lấy ra các giá trị cho các 4 thuộc tính đầu tiên.
Viết phương thức lấy ra giá trị thuộc tính salary, trong đó salary được tính bằng công thức: salary = workingDays * PRICE.
Viết phương thức input() để nhập vào các thông tin cho Employee.
Viết phương thức output() để hiển thị các thông tin của Employee ra màn hình.
Xây dựng hàm main() để kiểm tra sự hoạt động của lớp Employee trên.

* */
public class Employee {
    private static Scanner scanner = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;
    private static final int price = 50;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

//    public Employee(String id, String name, int age, int workingDays){
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.workingDays = workingDays;
//    }

    public double Salary(){
        return workingDays * price;
    }

    public void input(){
        System.out.print("nhap ma NV: ");
        id = scanner.nextLine();
        System.out.print("nhap ho ten NV: ");
        name = scanner.nextLine();
        System.out.print("nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhap so ngay cong: ");
        workingDays = scanner.nextInt();
        scanner.nextLine();
    }

    public void output(){
        System.out.printf("\n%-10s%-20s%-10d%-20d%-10f", id, name, age, workingDays, Salary());
    }

    public static void main(String[] args) {
        Employee nv1 = new Employee();

        nv1.input();
        System.out.printf("%-10s%-20s%-10s%-20s%-10s", "ma NV", "ten NV", "tuoi", "so ngay cong", "luong");
        nv1.output();
    }
}