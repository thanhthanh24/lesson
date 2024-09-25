package com.thanhthanh.lesson1;

import java.util.ArrayList;
/**
 * Bài 5:
 * 1. Khai báo một danh sách rỗng có kiểu dữ liệu số nguyên
 * 2. Thêm giá trị từ 1 đến 20 vào danh sách đã khai báo
 * 3. In ra màn hình các số không chia hết cho 5 từ dsach tren
 */
public class Bai5 {
    public static void main(String[] args) {
        ArrayList<Integer> firstOf20 = new ArrayList<>();
        ArrayList<Integer> notDivide5 = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            firstOf20.add(i);
            if (i % 5 != 0) {
                notDivide5.add(i);
            }
        }
        System.out.println(notDivide5);
    }
}
