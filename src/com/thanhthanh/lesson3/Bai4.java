package com.thanhthanh.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    //Bài 4: Viết chương trình nhập vào n số nguyên tố và in ra màn hình n số nguyên tố đầu tiên

    public static int nhapSoN(){
        System.out.print("Mời bạn nhập vào 1 số nguyên dương n");
        Scanner sc = new Scanner(System.in);
        int n ;
        while (true){
            n = sc.nextInt();
            if (n < 0){
                System.out.print("Sai rồi . Nhập lại đê");
            }else
            {
                break;
            }
        }
        return n;
    }
    public static boolean kiemTraSNT(int n){
        if (n ==1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void inSoNguyenTo(){
        int n = nhapSoN();
        List<Integer> list = new ArrayList<>();
        int count = 0; // Đếm số lượng số nguyên tố đã tìm thấy
        int num = 2;   // Số bắt đầu kiểm tra
            while (count < n) {
                if (kiemTraSNT(num)) {
                    list.add(num);
                    count++;
                }
                num++;
            }

            // In ra danh sách số nguyên tố
            System.out.println("Danh sách " + n + " số nguyên tố đầu tiên:");
            for (int prime : list) {
                System.out.print(prime + " ");
            }
            System.out.println();


    }


    public static void main(String[] args) {
        inSoNguyenTo();


    }
}
