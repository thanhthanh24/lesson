package com.thanhthanh.lesson2;

import java.util.Scanner;
/*Bài 3: viết chương trình nhập một số nguyên dương từ bàn phím và tính tổng của các chữ số của số nguyên đó và in ra kết quả*/

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        // Kiểm tra số nhập vào có phải số dương không
        if (number <= 0) {
            System.out.println("Số nhập vào không hợp lệ. Vui lòng nhập số nguyên dương.");
        } else {
            int sum = 0;
            // Tính tổng các chữ số
            while (number > 0) {
                sum = sum +  number % 10;
                number /= 10;
            }
            System.out.println("Tổng các chữ số là: " + sum);
        }

        scanner.close();
    }
}
