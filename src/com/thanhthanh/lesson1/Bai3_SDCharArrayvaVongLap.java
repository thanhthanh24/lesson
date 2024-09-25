package com.thanhthanh.lesson1;

public class Bai3_SDCharArrayvaVongLap {
    public static void main(String[] args) {
        String original = "toi yeu automation test";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    /*Đoạn mã reversed.append(str.charAt(i)); thực hiện một thao tác quan trọng trong quá trình đảo ngược chuỗi. Dưới đây là giải thích chi tiết về từng phần của đoạn mã này:

reversed.append(str.charAt(i));
Để hiểu đoạn lệnh này, ta cần phân tích từng phần của nó:

str.charAt(i)

str: Đây là chuỗi đầu vào mà bạn muốn đảo ngược.
.charAt(i): Đây là một phương thức của lớp String. Phương thức này nhận một chỉ số i (kiểu int) và trả về ký tự nằm ở vị trí i trong chuỗi str.
Ví Dụ:

Nếu str là "toi yeu automation test" và i là 5, thì str.charAt(5) trả về ký tự 'e'.
reversed.append(...)

reversed: Đây là một đối tượng của lớp StringBuilder. StringBuilder là một lớp trong Java dùng để xây dựng và thao tác với chuỗi mà có thể thay đổi.
.append(...): Đây là một phương thức của lớp StringBuilder. Phương thức này thêm một ký tự, chuỗi, số, hoặc đối tượng vào cuối nội dung hiện tại của StringBuilder.
Ví Dụ:

Nếu reversed hiện đang chứa chuỗi "tset " và bạn gọi reversed.append('e'), thì reversed sẽ trở thành "tset e".
Toàn Bộ Quá Trình
Trong ngữ cảnh của đoạn mã for để đảo ngược chuỗi:

java
Copy code
for (int i = str.length() - 1; i >= 0; i--) {
    reversed.append(str.charAt(i));
}
Khởi Tạo Vòng Lặp: Vòng lặp bắt đầu từ chỉ số cuối cùng của chuỗi (str.length() - 1) và tiếp tục cho đến khi i không còn lớn hơn hoặc bằng 0.

Lấy Ký Tự Tại Vị Trí i: str.charAt(i) lấy ký tự tại vị trí i trong chuỗi str. Ví dụ, nếu i là 5, thì str.charAt(5) lấy ký tự 'e'.

Thêm Ký Tự Vào StringBuilder: reversed.append(str.charAt(i)) thêm ký tự vừa lấy vào cuối đối tượng StringBuilder. Nhờ đó, ký tự ở vị trí i của chuỗi str được thêm vào chuỗi đảo ngược.

Ví Dụ Cụ Thể
Giả sử chuỗi str là "abc":

Vòng Lặp Đầu Tiên (i = 2):

str.charAt(2): 'c'
reversed.append('c'): reversed trở thành "c"
Vòng Lặp Thứ Hai (i = 1):

str.charAt(1): 'b'
reversed.append('b'): reversed trở thành "cb"
Vòng Lặp Thứ Ba (i = 0):

str.charAt(0): 'a'
reversed.append('a'): reversed trở thành "cba"
Kết quả cuối cùng là chuỗi "cba", tức là chuỗi "abc" đã bị đảo ngược.

Tổng Kết
str.charAt(i): Lấy ký tự tại chỉ số i trong chuỗi str.
reversed.append(...): Thêm ký tự vào cuối đối tượng StringBuilder.
Kết hợp lại, reversed.append(str.charAt(i)) thêm ký tự từ chuỗi gốc vào đối tượng StringBuilder, nhưng từ cuối chuỗi về đầu, giúp tạo ra chuỗi đảo ngược khi vòng lặp kết thúc.*/
}
