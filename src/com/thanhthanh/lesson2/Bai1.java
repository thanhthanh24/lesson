package com.thanhthanh.lesson2;

/**
 * bài 1: viết chương trình nhập vào từ bàn phím 3 số nguyên dương.
 * kiểm tra xem 3 số nguyên đó có phải là 3 cạnh của 1 tam giác ko.
 * với trường hợp nhập vào số âm hoặc = 0 thì in ra màn hình là không hợp lệ
 */

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ ba: ");
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Không hợp lệ");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Giá trị nhập vào là tam giác");
        } else {
            System.out.println("Không phải tam giác");
        }

        scanner.close();
    }
}
