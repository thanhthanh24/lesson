package com.thanhthanh.lesson1;

public class Bai3_ReverseString {
    public static void main(String[] args) {
       //Bài 3: Viết chương trình đảo ngược chuỗi sau "toi yeu automation test"

        //Input đầu vào
        String original ="toi yeu automation test";
        String original2 ="Tran Thanh Thanh";

        //Sử dụng StringBuilder
        /*Khởi tạo một biến sb mới để lưu trữ dữ liễu đầu vào từ chuỗi original ban đầu */
        StringBuilder sb = new StringBuilder(original);
        StringBuilder sb2 = new StringBuilder(original2);

        // Thực hiện đảo ngược chuỗi
        sb.reverse();
        sb2.reverse();

        //Vì để sử dụng hàm reverse() đảo ngược chuỗi ta phải dùng StringBuilder nên giờ muốn in ra chuỗi phải chuyển chuỗi sau khi đảo ngược về lại kiểu String
        /*Hàm StringBuilder có thể thay đổi giá trị chuỗi trực tiếp
        * còn String thì không thay đổi trực tiếp nên nếu muốn dùng String để đảo ngược chuỗi thì phải sử dụng biến trung gian */

        String reserse1 = sb.toString();
        String reserse2 = sb2.toString();
        System.out.println("Chuỗi sau khi đảo ngược là :" +reserse1);
        System.out.println(reserse2);
    }
}
