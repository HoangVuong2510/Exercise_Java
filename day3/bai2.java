/*
Bài 2: (50đ) Chuẩn hóa chuỗi theo các yêu cầu sau:
Xóa tât cả các dấu cách thừa trong chuỗi
Viết hoa các chữ cái đầu mỗi từ, các chữ cái sau viết thường
Xóa hết các số có trong chuỗi
*/

package day3;

import java.util.Locale;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao 1 chuoi: ");
        String str = scanner.nextLine();
        System.out.println("chuoi vua nhap: " + str);

        str = xoaDauCachThua(str);
        str = vietHoaChuCaiDau(str);
        System.out.println("chuoi sau khi chuan hoa: " + xoaSo(str));

    }

    //Xóa tât cả các dấu cách thừa trong chuỗi
        public static String xoaDauCachThua(String s) {
            return s.replaceAll("\\s+", " ").trim();
        }

    //Viết hoa các chữ cái đầu mỗi từ, các chữ cái sau viết thường
        public static String vietHoaChuCaiDau(String s) {
            s = s.toLowerCase();
            String str1[] = s.split(" ");
            s = "";
            for (int i = 0; i < str1.length; i++) {
                s += String.valueOf(str1[i].charAt(0)).toUpperCase() + str1[i].substring(1);
                if (i < str1.length - 1)
                    s += " ";
            }
            return s;
        }

    //Xóa hết các số có trong chuỗi
        public static String xoaKyTu(String s, int pos) {
            return s.substring(0, pos) + s.substring(pos + 1);
        }

        public static boolean isNumber(char c) {
            if((int)c >= 48 && (int)c <= 57)
                return true;
            else
                return false;
        }

        public static String xoaSo(String s) {

            int n = s.length();
            for(int i = 0; i < n; i++) {
                if(isNumber(s.charAt(i))) {
                    s = xoaKyTu(s, i);
                    i--;
                    n--;
                }
            }
            return s;
        }
    }