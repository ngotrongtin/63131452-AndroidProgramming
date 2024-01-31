package baithuchanh;

import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap he so a: ");
		int a = scanner.nextInt();
		System.out.printf("Nhap he so b: ");
		int b = scanner.nextInt();
		System.out.printf("Nhap he so c: ");
		int c = scanner.nextInt();
		double delta = Math.pow(b,4) - 4*a*c;
		System.out.printf("delta can la: %f", Math.sqrt(delta));
		
	}

}
