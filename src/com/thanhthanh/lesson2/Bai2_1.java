package com.thanhthanh.lesson2;

import java.util.Scanner;

public class Bai2_1 {
    /*Bài 2: viết chương trình cho phép nhập từ banf phím một số nguyên và kiểm tra số nguyên đó có phải số đối xứng hay không.
    nếu có in ra YES, không in ra NO (ví dụ số đối xứng: 123321, 11111, 13531..)*/

    /*Nhập từ bàn phím số nguyên
    ? có phải là số đổi xứng không : số dối xứng là khi đảo ngược thì số ban đầu và số sau khi đảo ngược không đổi
    ==> Có = Yes
    ===> Không ==> No
    n1 = 12345
    i
    * */
    public static boolean doiXung(int n){

        // chuyển đổi về dạng chuỗi
        String n1 = Integer.toString(n);
        int left = 0;
        int right = n1.length()-1;

        while (left<right){
            //lấy giá trị ký tự tại vị trí bất kỳ
            if(n1.charAt(left) != n1.charAt(right)){
                return  false;
            }
            left ++;
            right --;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số n :");
        int n = sc.nextInt();
        if (doiXung(n)){
            System.out.println("YES");
        }else
            System.out.println("No");

    }
}
