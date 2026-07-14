import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ==================================================================
                Câu 3:
                    - Viết chương trình tính tổng các số lẻ nguyên dương nhỏ hơn n
                    - Yêu cầu nhập n với n > 0
                ==================================================================
                """);

        // INPUT
        System.out.print("Nhập vào số nguyên dương n: ");
        int n;

        while (true) {
            n = Integer.parseInt(sc.nextLine());

            if (n > 0) break;
            System.out.print("Vui lòng nhập vào số nguyên dương n (n>0): ");
        }

        // PROCESS
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) total += i;
        }

        // OUTPUT
        System.out.println("Tổng các số lẻ nguyên dương nhỏ hơn n là: " + total);
    }
}
