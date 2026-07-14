import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ================================================
                Câu 4:
                    - Viết chương trình nhập n và x
                    - Tính tổng S(n) = x + x^2 + x^3 + ... + x^n
                ================================================
                """);

        System.out.print("Nhập vào số n: ");
        int n;

        while (true) {
            n = Integer.parseInt(sc.nextLine());

            if (n > 0) break;
            System.out.print("Vui lòng nhập lại số nguyên dương n: ");
        }

        System.out.print("Nhập vào số x: ");
        int x = Integer.parseInt(sc.nextLine());

        double s = 0;

        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, i);
        }

        System.out.println("S(n) = x^1 + x^2 + ... + x^n = " + s);
    }
}
