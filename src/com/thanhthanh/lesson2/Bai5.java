package com.thanhthanh.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước và phần tử của mảng thứ nhất
        System.out.print("Nhập số lượng phần tử của mảng thứ nhất: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Nhập các phần tử của mảng thứ nhất:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Nhập kích thước và phần tử của mảng thứ hai
        System.out.print("Nhập số lượng phần tử của mảng thứ hai: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Nhập các phần tử của mảng thứ hai:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Kiểm tra và so sánh hai mảng
        if (n1 != n2) {
            System.out.println("NO");
        } else {
            Arrays.sort(array1);
            Arrays.sort(array2);
            if (Arrays.equals(array1, array2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}