import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien(10);

        while (true) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Mã sinh viên: ");
                    int maSV = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Tên sinh viên: ");
                    String tenSV = scanner.nextLine();

                    System.out.println("Email: ");
                    String email = scanner.nextLine();

                    System.out.println("SDT: ");
                    String sdt = scanner.nextLine();

                    System.out.println("GPA: ");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();

                    SinhVien sinhVien = new SinhVien(maSV, tenSV, email, sdt, gpa);
                    quanLySinhVien.themSinhVien(sinhVien);
                    break;
                case 2:
                    quanLySinhVien.hienThiSinhVien();
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần sửa: ");
                    int maSVSua = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Tên mới: ");
                    String tenMoi = scanner.nextLine();

                    System.out.println("Email mới: ");
                    String emailMoi = scanner.nextLine();

                    System.out.println("Số điện thoại mới: ");
                    String sdtMoi = scanner.nextLine();

                    System.out.println("GPA mới: ");
                    double gpaMoi = scanner.nextDouble();
                    scanner.nextLine();

                    quanLySinhVien.suaSinhVien(maSVSua, tenMoi, emailMoi, sdtMoi, gpaMoi);
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    int maSVXoa = scanner.nextInt();
                    scanner.nextLine();

                    quanLySinhVien.xoaSinhVien(maSVXoa);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
