package baithuchanh;

import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cạnh : ");
		int Canh = scanner.nextInt();
		int TheTich = (int)Math.pow(Canh, 3);
		System.out.printf("The tích lập phương là: %d", TheTich);
	}

}
