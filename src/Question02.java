public class Question02 {
    public static void main(String[] args) {
        System.out.println("""
                =============================================
                Câu 2:
                    - Tìm số nguyên dương n nhỏ nhất sao cho:
                        1 + 2 + 3 + ... n > 10000
                =============================================
                """);

        // INPUT

        // PROCESS
        int total = 0;
        int n;
        final int MIN_TOTAL_NUMBERS = 10_000;

        for (int i = 1; ; i++) {
            total += i;

            if (total >= MIN_TOTAL_NUMBERS) {
                n = i;
                break;
            }
        }

        // OUTPUT
        System.out.println("Số nguyên n là: " + n);
    }
}
