import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                ===========================================================
                Câu 1:
                    - Xây dựng trò chơi Oẳn Tù Tì (Bao, Kéo, Búa)
                    - Người và máy sẽ chơi với nhau.
                    - Nhấn:
                        0 - Thoát chương trình
                        1 - "Bao"
                        2 - "Kéo"
                        3 - "Búa"
                    - Trước khi thoát chương trình (khi nhấn 0).
                        Tính xem ai là người chơi thắng nhiều nhất và tỉ số.
                ============================================================
                """);

        System.out.print("Nhập vào một số: [0: Thoát chương trình, 1: Bao, 2: Kéo, 3: Búa]: ");

        int type;
        int userWins = 0;
        int computerWins = 0;
        int phrase = 0;

        while (true) {
            while (true) {
                try {
                    type = Integer.parseInt(sc.nextLine());

                    if (type >= 0 && type <= 3) break;
                    System.out.print("Vui lòng nhập lại một số hợp lệ: [0: Thoát chương trình, 1: Bao, 2: Kéo, 3: Búa]: ");

                } catch (Exception e) {
                    System.out.print("Số không hợp lệ/Không được bỏ trống. Vui lòng nhập lại một số hợp lệ: [0: Thoát chương trình, 1: Bao, 2: Kéo, 3: Búa]: ");

                }
            }

            if (type == 0) break;

            phrase++;
            String userChoice = getChoose(type);

            //  random = min + (Math.random() * ((max - min) + 1));
            int typeComputerChoice = (int) (Math.random() * 4);
            String computerChoice = getChoose(typeComputerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice))
                System.out.println(">>> Người chơi và máy tính giống nhau");
            else if ((userChoice.equalsIgnoreCase("Bao") && !computerChoice.equalsIgnoreCase("Kéo")) || (userChoice.equalsIgnoreCase("Kéo") && !computerChoice.equalsIgnoreCase("Búa")) || (userChoice.equalsIgnoreCase("Búa") && !computerChoice.equalsIgnoreCase("Bao"))) {
                userWins++;
                System.out.println(">>> Người chơi thắng");
            } else {
                computerWins++;
                System.out.println(">>> Máy tính thắng");
            }

            System.out.print("Nhập vào một số: [0: Thoát chương trình, 1: Bao, 2: Kéo, 3: Búa]: ");
        }

        String result;
        String tySo = "[Người chơi thắng: " + userWins + "; Máy tính thắng: " + computerWins + "; Hòa: " + (phrase - userWins - computerWins) + "]";

        if (userWins > computerWins) result = "Người chơi thắng " + tySo;
        else if (userWins < computerWins) result = "Máy tính thắng " + tySo;
        else result = "Hòa nhau " + tySo;

        // OUTPUT
        System.out.println("Kết thúc trò chơi. Chung cuộc, " + result);
    }

    private static String getChoose(int type) {
        switch (type) {
            case 1:
                return "Bao";
            case 2:
                return "Kéo";
            default:
                return "Búa";
        }
    }
}
