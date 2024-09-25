package com.thanhthanh.lesson3;

import java.util.Scanner;

public class Bai1 {
    //Bài 1: Viết chương trình cho phép nhập một số từ bàn phím và kiểm tra số đó có phải là số nguyên tố hay không

    public static Integer nhapSoN(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số : ");
        return sc.nextInt();
    }
    public static boolean kiemTra(int N){
        if (N ==1){
            return false;
        }
        for(int i = 2; i<Math.sqrt(N); i++){
            if(N%i ==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        if (kiemTra(nhapSoN()) == true){
            System.out.println("Số bạn vừa nhập là số nguyên tố");
        }else {
            System.out.println("Số bạn vừa nhập không phải là số nguyên tố");
        }

    }
}
