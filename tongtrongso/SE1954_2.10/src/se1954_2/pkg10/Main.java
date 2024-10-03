
package se1954_2.pkg10;


import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng phần tử n
        int n = scanner.nextInt();
        int[] a = new int[n];

        // Đọc các phần tử của mảng
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Tạo đối tượng lớp Mang và tính trọng số
        Mang mang = new Mang(a);
        long trongSo = mang.tinhTrongSo();

        // In kết quả
        System.out.println(trongSo);

        scanner.close();
    }
}

