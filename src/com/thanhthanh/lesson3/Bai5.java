package com.thanhthanh.lesson3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Bai5 {
    //Bài 5: Viết chương trình nhập vào một mảng số nguyên và đếm số lần xuất hiện của các phần từ trong mảng
    public static int[] arraySize() {
        int[] array;
        try {
            System.out.println("Mời bạn nhập kích thước của mảng: ");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            array = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.printf("Mời bạn nhập phần tử thứ %s của mảng: %n", i + 1);
                array[i] = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Kích thước của mảng phải là dạng số nguyên. Mời bạn nhập lại!");
            return arraySize();
        } catch (NegativeArraySizeException e) {
            System.out.println("Kích thước mảng phải >= 0. Nhập lại đê!");
            return arraySize();
        } catch (Exception e) {
            System.out.println("Có lỗi gì đó từ dữ liệu đầu vào, mời nhập lại!");
            return arraySize();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = arraySize();
        if (array.length == 0) {
            System.out.println("Mảng của bạn bị rỗng!");
            return;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        // Duyệt qua mảng và đếm số lần xuất hiện
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // In ra số lần xuất hiện của từng phần tử
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Phần tử " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
        }
    }
}
