package com.thanhthanh.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
* Bài 4: viết chương trình nhập từ bàn phím một số nguyên N.
*  sau đó nhập N số nguyên từ bàn phím và lưu thành một mảng list1 sau đó in ra các phần tử của mảng vừa lưu đc mà tìm số nguyên lớn thứ 2 trong mảng đó*/
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Kiểm tra N phải lớn hơn 1 để có ít nhất hai số khác nhau
        if (N <= 1) {
            System.out.println("N phải lớn hơn 1 để tìm số lớn thứ hai.");
            scanner.close();
            return;
        }

        List<Integer> list = new ArrayList<>();

        // Nhập N số nguyên và lưu vào danh sách
        System.out.println("Nhập " + N + " số nguyên:");
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        // Sắp xếp danh sách và tìm số lớn thứ hai
        Collections.sort(list, Collections.reverseOrder());

        // Tìm số lớn thứ hai trong danh sách
        int first = list.get(0);
        Integer second = null;
        for (int num : list) {
            if (num < first) {
                second = num;
                break;
            }
        }

        // In kết quả
        if (second != null) {
            System.out.println("Số lớn thứ hai là: " + second);
        } else {
            System.out.println("Không tìm thấy số lớn thứ hai.");
        }

        scanner.close();
    }
}
