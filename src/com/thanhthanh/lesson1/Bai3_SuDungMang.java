package com.thanhthanh.lesson1;

public class Bai3_SuDungMang {
    public static void main(String[] args) {
        //Bài 3: Viết chương trình đảo ngược chuỗi sau "toi yeu automation test"

        //Input dữ liệu vào
        String original = "toi yeu automation test";

        //chuyển đổi chuỗi về mảng ký tự
        /* khai báo biến character có kiểu mảng ký tự
        * vì String là bất biến nên sử dụng phương thức toCharArray() để chuyển chuỗi original về kiểu ký tự
        * lúc này biến character sẽ sao chép tất cả dữ liệu từ chuỗi original ban đầu về với kiểu dữ liệu lúc này là ký tự */
        char[] characters = original.toCharArray();

        //khai báo biến từ bên trái của chuỗi từ 0 : vì index bắt đầu từ 0
        int left =0;

        //Khai báo biến cuỗi cùng của chuỗi có độ dài character.length - 1 : vì index bắt dầu từ 0
        int right = characters.length -1;

        //dùng while
        while (left<right){
            //khai báo biến tạm để lưu trữ giá trị tạm thời = ký tự tại left
            char temp = characters[left];
            //gán giá trị ở giá trị right vào vị trí left
            characters[left] = characters[right];
            //gán giá trị ở vị trí temp vào vị trị right
            characters[right] = temp;
            /*characters[temp]: Ở đây, temp là một biến kiểu char, nhưng characters[] là một mảng kiểu char.
             Khi bạn sử dụng characters[temp], bạn đang cố gắng sử dụng một ký tự làm chỉ số mảng,
             điều này là không hợp lệ vì chỉ số mảng phải là một số nguyên (int), không phải một ký tự (char)*/
            left++;
            right--;

        }
        //chuyển đổi chuỗi sau khi đã dảo ngược từ kiểu mảng ký tự sang kiểu chuỗi

        String reverse = new String(characters);
        System.out.println("Chuỗi sau khi đảo ngược là : " +reverse);
    }
}
