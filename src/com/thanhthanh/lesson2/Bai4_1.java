package com.thanhthanh.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Nhập số nguyên n . Nhập n số nguyên , add mảng 1 ra
**/

public class Bai4_1 {

    public static void KiemTraN(int n) {
        if (n < 2) {
            System.out.println("Để tạo thành một mảng, bạn phải nhập n > 1.");
            System.exit(0);  // Dừng chương trình khi n không hợp lệ
        }
    }

    public static List<Integer> nhapDanhSach(int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập lần lượt " + N + " phần tử:");
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list1.add(sc.nextInt());
        }

        return list1;
    }

    public static Integer timSoLonThuHai(List<Integer> list) {
        if (list.size() < 2) {
            return null; // Không đủ số lượng phần tử
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int num : list) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên (Lớn hơn 1):");
        int n = sc.nextInt();

        KiemTraN(n);

        List<Integer> list1 = nhapDanhSach(n);

        // In ra danh sách số nguyên
        System.out.println("Danh sách số nguyên:");
        for (int number : list1) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Tìm số nguyên lớn thứ 2
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : list1) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Danh sách không đủ số lượng để tìm số lớn thứ hai.");
        } else {
            System.out.println("Số nguyên lớn thứ hai là: " + secondMax);
        }
    }
}
