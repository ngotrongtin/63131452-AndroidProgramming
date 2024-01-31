package thucHanh;
import java.util.Scanner;
public class Lab2Bai1 {

	public static void PtBac1() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm");
	            } else {
	                System.out.println("Phương trình vô nghiệm");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Nghiệm của phương trình là: " + x);
	        }
	        scanner.close();
	}

}
