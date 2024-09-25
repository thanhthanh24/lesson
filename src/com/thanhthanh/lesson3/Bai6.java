package com.thanhthanh.lesson3;

import java.util.HashSet;
import java.util.Scanner;

public class Bai6 {
    //Bài 6: Viết chương trình nhập vào một mảng số nguyên
    // và xóa bỏ những phần tử trùng lặp trong mảng đó sao cho mỗi phần tử chỉ còn xuất hiện một lần và in ra màn hình  mảng mới sau khi xóa
    public static int[] arraySize() {
        int[] arrayInt;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {

                System.out.println("Mời bạn nhập kích thước của mảng(dạng số nguyên): ");
                int size = sc.nextInt();
                arrayInt = new int[size];
            } catch (Exception ex) {
                System.out.println("Kích thước của mảng phải là dạng số nguyên. Mời bạn nhập lại :");
                return arraySize();
            }

            return arrayInt;
        }
    }

    public static int[] arrayValue(int[] arrayInt) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayInt.length; i++) {
            while (true) {
                try {
                    System.out.printf("Mời bạn nhập phần tử thứ %d của mảng: ", i + 1);
                    arrayInt[i] = sc.nextInt(); // Nhập giá trị vào mảng
                    break; // Thoát khỏi vòng lặp khi nhập hợp lệ
                } catch (Exception ex) {
                    System.out.println("Phần tử phải là dạng số nguyên. Mời bạn nhập lại:");
                    sc.next(); // Xóa giá trị không hợp lệ trong bộ đệm
                }
            }
        }
        return arrayInt;
    }
    public static void removeDuplicate(int[] array){

        //HashSet chỉ lưu trữ các phần tử duy nhất , loại bỏ hết các phần tử trùng lặp

        HashSet<Integer> arrayTempo = new HashSet<>();
        //Thực hiện add các phần tử vào mảng tạm arrayTempo
         for (int num : array){
             arrayTempo.add(num);
         }

        System.out.println("Các giá trị của mảng là : ");
         for (int num : arrayTempo){
             System.out.printf("%d ", num);
         }


    }

    public static void main(String[] args) {
        int[] array = arraySize();
        arrayValue(array);
        removeDuplicate(array);


    }
}
