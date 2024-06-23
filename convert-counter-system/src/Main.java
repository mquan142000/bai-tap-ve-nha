import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1. Chuyển đổi thập phân sang nhị phân");
            System.out.println("2. Chuyển đổi thập phân sang bát phân");
            System.out.println("3. Chuyển đổi thập phân sang thập lục phân");
            System.out.println("4. Chuyển đổi nhị phân sang thập phân");
            System.out.println("5. Chuyển đổi bát phân sang thập phân");
            System.out.println("6. Chuyển đổi thập lục phân sang thập phân");
            System.out.println("0. Thoát");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số thập phân: ");
                    int decimal1 = scanner.nextInt();
                    System.out.println("Chuyển đổi thập phân sang nhị phân: " + ConvertCounterSystem.convertBinary(decimal1));
                    break;
                case 2:
                    System.out.println("Nhập số thập phân: ");
                    int decimal2 = scanner.nextInt();
                    System.out.println("Chuyển đổi thập phân sang bát phân: " + ConvertCounterSystem.convertOctal(decimal2));
                    break;
                case 3:
                    System.out.println("Nhập số thập phân: ");
                    int decimal3 = scanner.nextInt();
                    System.out.println("Chuyển đổi thập phân sang thập lục phân: " + ConvertCounterSystem.convertHexadecimal(decimal3));
                    break;
                case 4:
                    System.out.println("Nhập số nhị phân: ");
                    String binary = scanner.next();
                    System.out.println("Chuyển đổi nhị phân sang thập phân: " + ConvertCounterSystem.convertBinaryToDecimal(binary));
                    break;
                case 5:
                    System.out.println("Nhập số bát phân: ");
                    String octal = scanner.next();
                    System.out.println("Chuyển đổi bát phân sang thập phân: " + ConvertCounterSystem.convertOctalToDecimal(octal));
                    break;
                case 6:
                    System.out.println("Nhập số thập lục phân: ");
                    String hexadecimal = scanner.next();
                    System.out.println("Chuyển đổi thập lục phân sang thập phân: " + ConvertCounterSystem.convertHexadecimalToDecimal(hexadecimal));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}