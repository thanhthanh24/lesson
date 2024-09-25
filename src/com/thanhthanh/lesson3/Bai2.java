package com.thanhthanh.lesson3;

import java.util.Scanner;

public class Bai2 {
    //Bài 2: Viết chương trình cho phép nhập một số từ bàn phím và in ra màn hình danh sách các ước của số đó
    public static int nhapSoN(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số N : " );
        return sc.nextInt();
    }
    public static void kiemTraUoc(int N){
        System.out.print("Các ước của N lần lượt là: ");
        for (int i = 1 ; i <= N; i++){
            if (N%i ==0 ){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
       kiemTraUoc(nhapSoN());

    }
}
