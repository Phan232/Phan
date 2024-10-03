package se1954_2.pkg10;

class Mang {

     private int[] a;  // Mảng các số nguyên dương
    private final long MOD = 1000000007;  // Hằng số mod

    // Constructor để khởi tạo mảng với n phần tử
    public Mang(int[] a) {
        this.a = a;
    }

    // Phương thức tính trọng số của mảng
    public long tinhTrongSo() {
        long totalWeight = 0;
        int countOdd = 0;  // Đếm số lượng số lẻ
        int countEven = 0; // Đếm số lượng số chẵn

        // Đếm số lượng số chẵn và số lẻ
        for (int num : a) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Tính tổng trọng số từ số lẻ và số chẵn
        totalWeight = ((countOdd * countEven) % MOD) * ((1 + 1) % MOD) % MOD;

        return totalWeight;
    }
}


