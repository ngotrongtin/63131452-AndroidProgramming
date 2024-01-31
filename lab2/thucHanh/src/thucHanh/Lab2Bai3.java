package thucHanh;
import java.util.Scanner;
public class Lab2Bai3 {
	public static void tinhTienDien() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        int giaDuoi50 = 1000;  // Giá mỗi số điện dưới 50
        int giaTren50 = 1200;  // Giá mỗi số điện vượt hạn mức

        int tien;

        if (soDien <= 50) {
            tien = soDien * giaDuoi50;
        } else {
            tien = 50 * giaDuoi50 + (soDien - 50) * giaTren50;
        }
        System.out.println("Tổng tiền điện là: " + tien + " VND");
        scanner.close();
	}

}
