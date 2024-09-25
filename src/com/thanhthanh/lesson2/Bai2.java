package com.thanhthanh.lesson2;

/**
 * viết chương trình cho phép nhập từ banf phím một số nguyên và kiểm tra số nguyên đó có phải số đối xứng hay không.
 * nếu có in ra YES, không in ra NO (ví dụ số đối xứng: 123321, 11111, 13531..)
 */

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);
        String reverseNumber = new StringBuilder(numberStr).reverse().toString();


        if (numberStr.equals(reverseNumber)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }


}
