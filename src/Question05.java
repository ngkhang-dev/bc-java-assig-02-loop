import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        System.out.println("""
                =====================================================================================
                Câu 5:
                    - Nhập vào: số tiền hiện tại, lãi suất và số tiền tiết kiệm mong muốn.
                    - Viết chương trình tính số năm ít nhất mà để đạt được số tiền như kỳ vọng.
                    - Giả sử lãi suất tiết kiệm không đổi, không rút bớt tiền và không gởi thêm tiền.
                =====================================================================================
                """);

        double money = 0;
        double interest = 0;
        double percent = 0;
        int years = 0;

        System.out.print("Nhập vào số tiền đang có: ");
        money = validNumber("Vui lòng nhập số tiền lớn hơn 0: ");

        System.out.print("Nhập vào số tiền mong muốn: ");
        interest = validNumber("Vui lòng nhập số tiền mong muốn lớn hơn 0: ");

        System.out.print("Nhập vào lãi suất theo năm (%) (ví dụ: 10): ");
        percent = validNumber("Vui lòng nhập lãi suất hợp lệ: ");

        double currentMoney = money;
        while (currentMoney < interest) {
            years++;
            currentMoney += currentMoney * percent / 100;
        }

        // OUTPUT
        String result = "Để tích lũy được " + interest + " từ " + money + " cần " + years + " năm";
        System.out.println(result);
    }

    private static double validNumber(String message) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        while (true) {
            if (money > 0) break;

            System.out.print(message);
            money = Double.parseDouble(sc.nextLine());
        }

        return money;
    }
}
