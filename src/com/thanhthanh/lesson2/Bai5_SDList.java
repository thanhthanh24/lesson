package com.thanhthanh.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai5_SDList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập phần tử của danh sách thứ nhất
        System.out.print("Nhập số lượng phần tử của danh sách thứ nhất: ");
        int n1 = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Nhập các phần tử của danh sách thứ nhất:");
        for (int i = 0; i < n1; i++) {
            list1.add(scanner.nextInt());
        }

        // Nhập phần tử của danh sách thứ hai
        System.out.print("Nhập số lượng phần tử của danh sách thứ hai: ");
        int n2 = scanner.nextInt();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Nhập các phần tử của danh sách thứ hai:");
        for (int i = 0; i < n2; i++) {
            list2.add(scanner.nextInt());
        }

        // Kiểm tra và so sánh hai danh sách
        if (n1 != n2) {
            System.out.println("NO");
        } else {
            Collections.sort(list1);
            Collections.sort(list2);
            if (list1.equals(list2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
