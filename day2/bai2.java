/*Nhập 3 cạnh a, b, c(a, b, c nguyên). Kiểm tra xem 3 cạnh có thể tạo thành một tam giác không
 và nếu có nó thuộc loại tam giác nào(thường, vuông, vuông cân, cân, đều)*/
package day2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        do {
            System.out.print("nhap vao lan luot 3 canh a, b, c: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }while(a<=0 || b<=0 || c<=0);

        if(a+b<=c || a+c<=b || b+c<=a)
            System.out.println("3 canh ban vua nhap khong the tao thanh 1 tam giac");
        else{
            if(a == b && b == c)
                System.out.println("tam giac deu");
            else if (a == b || a == c || b == c){
                if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c+c==a*a)
                    System.out.println("tam giac vuong can");
                else
                    System.out.println("tam giac can");
            }
            else if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c+c==a*a)
                System.out.println("tam giac vuong");
            else
                System.out.println("tam giac thuong");
        }
    }
}
