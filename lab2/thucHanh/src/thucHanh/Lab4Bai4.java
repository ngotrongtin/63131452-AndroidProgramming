package thucHanh;
import thucHanh.Lab2Bai1;
import thucHanh.Lab2Bai2;
import thucHanh.Lab2Bai3;
import java.util.Scanner;
public class Lab4Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int chosen = 0;
		System.out.printf("+---------------------------------------------------+\n");
		System.out.printf("1. Giai phương trình bậc 1\n");
		System.out.printf("2. Giai phương trình bậc 2\n");
		System.out.printf("3. Tính tiền điện\n");
		System.out.printf("+---------------------------------------------------+\n");
		System.out.printf("Lựa chọn của bạn là: ");
		chosen = scanner.nextInt();
		switch(chosen) {
		case 1:
			Lab2Bai1.PtBac1();
			break;
		case 2:
			Lab2Bai2.PtBac2();
			break;
		case 3:
			Lab2Bai3.tinhTienDien();
			break;
		default:
			break;
		}
		
	}

}
