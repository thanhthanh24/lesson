package com.thanhthanh.lesson1;

public class Bai3_SuDungStreamAPI {
    public static void main(String[] args) {
        /*new StringBuilder(original).reverse().toString() thực hiện ba bước liên tiếp:
        Tạo một đối tượng StringBuilder từ chuỗi gốc.
        Đảo ngược nội dung của đối tượng StringBuilder.
        Chuyển đối tượng StringBuilder đã đảo ngược trở lại thành chuỗi.*/
        String original = "toi yeu automation test";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
    }
}
