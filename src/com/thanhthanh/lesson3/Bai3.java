package com.thanhthanh.lesson3;

import java.util.Scanner;

public class Bai3 {
    //Bài 3: Viết chương trình nhập vào số nguyên N và in ra màn hình các số nguyên tố <= n
    public static int nhapSoN(){
        System.out.print("Mời bạn nhập vào số nguyên N : ");
        int N;
        Scanner sc = new Scanner(System.in);
        while (true){
            N = sc.nextInt();
            if(N < 0){
                System.out.print("Số bạn nhập không phải là số nguyên. Mời bạn nhập lại số N: ");
            }else
                break;
        }
        return N;
    }
    public static boolean kiemTraSNT(int N){
        if (N ==1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(N); i++){
            if(N%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void inSoNguyenTo(int N){
        System.out.print("Danh sách các số nguyên tố < " +N+ " là : ");
        for (int i = 2 ; i <N ; i++){
            if (kiemTraSNT(i) == true){
                System.out.print(i + " ");
            }

        }

    }

    public static void main(String[] args) {
        inSoNguyenTo(nhapSoN());

    }
}
