package com.thanhthanh.lesson2;

import java.util.Scanner;

/**
 * Bài 3: viết chương trình nhập một số nguyên dương từ bàn phím và tính tổng của các chữ số của số nguyên đó và in ra kết quả
 * 456/10 n=6
 */


public class Bai3_1 {

    public static int tinhTong(int n){
        int sum =0;
        while (n > 0) {
            //chia để lấy phần dư
             sum = sum + n%10;
            //chia số n để lấy phần nguyên
            n = n/10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // sử dụng vòng lặp while(true) để vòng lặp này luôn đúng và luon chạy cho tới khi nào gặp lệnh break
        while (true){
            System.out.println("Mời nhập vào một số nguyên dương: ");

            int n = sc.nextInt();

            if (n>0){
                int tong = tinhTong(n);
                System.out.println("Tổng các chữ số của số nguyên dương bạn vừa nhập là: " + tong);
                break;
            } else {
                System.out.println("Số bạn vừa nhập không phải là 1 số nguyên dương.Nhập lại đi bạn ơi. ");
            }
        }


    }

}
