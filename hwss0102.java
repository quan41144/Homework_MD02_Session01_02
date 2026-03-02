import java.util.*;

public class hwss0102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int n = sc.nextInt();
        System.out.print("Nhập số thứ hai (secondNumber): ");
        int s = sc.nextInt();
        System.out.println();
        System.out.println("--- Kết quả ---");
        System.out.println("firstNumber = " + n);
        System.out.println("secondNumber = " + s);
        System.out.println("Tổng = " + (n + s));
        System.out.println("Hiệu = " + Math.abs(n - s));
        System.out.println("Tích = " + n * s);
        System.out.println("Thương = " + n / s);
        System.out.println("Phần dư = " + n % s);
        sc.close();
    }
}
