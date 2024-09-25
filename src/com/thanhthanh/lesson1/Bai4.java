package com.thanhthanh.lesson1;

public class Bai4 {
    public static void main(String[] args) {
        /*Bài 4: Viết chương trình đếm số từ trong câu sau
        "Chiều 1/9, cơn mưa lớn kéo dài hơn 2 tiếng đã khiến nhiều tuyến đường ở TPHCM như biến thành "sông". Vịt bơi tung tăng trong nhà người dân."*/
        String input = "Chiều 1/9, cơn mưa lớn kéo dài hơn 2 tiếng đã khiến nhiều tuyến đường ở TPHCM như biến thành \"sông\". " +
                "Vịt bơi tung tăng trong nhà người dân.";

        var x = input.split(" ");
        System.out.println(x.length);


    }
}
