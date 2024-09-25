package com.thanhthanh.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * Bài 6: Cho mảng số nguyên list1= [10, -2, 5, -7, -1], list2= [14, 20, -10]
 * 1. So sánh độ dài list1 và list2 và đưa ra kết quả
 * 2. Nối 2 mảng với nhau thành một mảng list3 và in ra kết quả
 * 3. Kiểm tra các phần tử trong list3 và nguyên âm hay nguyên dương, nếu nguyên âm thì in ra ".... là số nguyên âm" hoặc ngược lại in ra ".... là số nguyên dương"
 * 4. Tính trung bình cộng của các phần tử trong mảng list3
 */

public class Bai6 {
    public static void main(String[] args) {

        //Tạo một danh sách (List) từ các phần tử được cung cấp
        //Khai báo một biến list1 kiểu List chứa các phần tử kiểu Integer
        List<Integer> list1 = Arrays.asList(10, -2, 5, -7, -1);
        List<Integer> list2 = Arrays.asList(14, 20, -10, 0);

        if (list1.size() == list2.size()) {
            System.out.println("2 mảng có số lượng phần tử như nhau");
        }else if(list1.size() < list1.size()){
            System.out.println(" mảng 1 có số lượng phần tử ít hơn mảng 2");
        }else{
            System.out.println("mảng 2 có số lượng phần tử ít hơn mảng 1");
        }

        /*Collections.emptyList(): Tạo một danh sách rỗng không thay đổi được.
        new ArrayList<>(Collections.emptyList()): Tạo một ArrayList mới từ danh sách rỗng, cho phép thêm và xóa phần tử sau khi khởi tạo.*/

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
        for(int i = 0; i< list3.size(); i++){
            if(list3.get(i) < 0){
                System.out.println(list3.get(i) + " là số nguyên âm");
            }else if(list3.get(i) > 0){
                System.out.println(list3.get(i) + " là số nguyên dương");
            }else  {
                System.out.println(" Là số 0");
            }
        }

        int sum =0 ;
        for (int bienTam : list3){
            sum += bienTam;

        }
        System.out.println(sum);
        double TBC = (double) sum / list3.size();
        System.out.println("Trung binh cộng là " +TBC);

        //Size() là phương thức để lấy số lượng phần tử trong collection : List
        //length là thuộc tính để lấy kích thước của mảng
        //Cả 2 đều bắt đầu từ 0 và kết thúc là size()-1, length -1


    }
}
