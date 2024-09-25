package com.thanhthanh.lesson2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập một số nguyên (hoặc 'exit' để thoát): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                System.out.println("Số bạn đã nhập là: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Đầu vào không hợp lệ. Vui lòng nhập một số nguyên.");
            }
        }
        scanner.close();
    }
}

