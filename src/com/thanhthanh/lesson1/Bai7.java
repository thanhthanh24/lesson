package com.thanhthanh.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Bài 7: Cho mảng [20, -5, 10, 30, 40, 25, -10, 12]
 * 1. Tìm giá trị lớn nhất của mảng trên và in ra màn hình
 * 2. Tìm giá trị nhỏ nhất của mảng trên và in ra màn hình
 * 3. Tìm trung trình cộng của các phần tử trong mảng trên
 * 4. Xóa tất cả các phần tử có giá trị > trung bình cộng vừa tìm được
 */
public class Bai7 {
    public static void main(String[] args) {
        //đưa dữ liệu input đầu vào
        List<Integer> mangFirst = Arrays.asList(20, -5, 10, 30, 40, 25, -10, 12);

        //tìm giá trị lớn nhất

        int max = Collections.max(mangFirst);
        System.out.println("Giá trị lớn nhất là :" +max);

        //tìm giá trị nhỏ nhất

        int min = Collections.min(mangFirst);
        System.out.println("Giá trị nhỏ nhất là : "+min);

        int sum =0;

        for (int bienTam : mangFirst){
            sum+= bienTam;
        }
        double average = (double) sum / mangFirst.size();
        System.out.println("Trung bình cộng của mảng là : " +average);

        //tạo 1 list mới rỗng
        //ở trong vòng for sử dụng Integer thay vì int vì đang sử dụng List<Integer>

        List<Integer> newList = new ArrayList<>();
        for (Integer value :mangFirst){
            if(value >= average){
                newList.add(value);
            }
        }
        System.out.println(newList);
    }
}
