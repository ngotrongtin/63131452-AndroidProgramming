package Thuchanh;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab6Bai3 {

	public static boolean kiemTraEmail(String email) {
        // Biểu thức chính qui kiểm tra định dạng email
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean kiemTraSoDienThoai(String soDienThoai) {
        // Biểu thức chính qui kiểm tra định dạng số điện thoại
        String regex = "^[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        return matcher.matches();
    }

    public static boolean kiemTraCMND(String cmnd) {
        // Biểu thức chính qui kiểm tra định dạng CMND (9 hoặc 12 số)
        String regex = "^[0-9]{9}$|^[0-9]{12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] sinhVien = new String[5][4]; // Mảng 2 chiều lưu thông tin của 5 sinh viên

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            sinhVien[i][0] = scanner.nextLine();
            System.out.print("Email: ");
            sinhVien[i][1] = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            sinhVien[i][2] = scanner.nextLine();
            System.out.print("Chứng minh nhân dân: ");
            sinhVien[i][3] = scanner.nextLine();

            if (!kiemTraEmail(sinhVien[i][1])) {
                System.out.println("Lỗi: Định dạng email không hợp lệ.");
                i--;
                continue;
            }
            if (!kiemTraSoDienThoai(sinhVien[i][2])) {
                System.out.println("Lỗi: Định dạng số điện thoại không hợp lệ.");
                i--;
                continue;
            }
            if (!kiemTraCMND(sinhVien[i][3])) {
                System.out.println("Lỗi: Định dạng CMND không hợp lệ.");
                i--;
            }
        }

        // In thông tin của 5 sinh viên đã nhập đúng định dạng
        System.out.println("\nDanh sách sinh viên đã nhập:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ và tên: " + sinhVien[i][0]);
            System.out.println("Email: " + sinhVien[i][1]);
            System.out.println("Số điện thoại: " + sinhVien[i][2]);
            System.out.println("Chứng minh nhân dân: " + sinhVien[i][3]);
            System.out.println();
        }
    }

}
