package Thuchanh;
import java.util.Scanner;
public class Lab6Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        scanner.close();

        // Tách họ, tên đệm và tên
        String ho = fullName.substring(0, fullName.indexOf(' '));
        String tenDem = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        String ten = fullName.substring(fullName.lastIndexOf(' ') + 1);

        // Xuất họ, tên đệm và tên ra màn hình, in HOA
        System.out.println("Họ: " + ho.toUpperCase());
        System.out.println("Tên đệm: " + tenDem.toUpperCase());
        System.out.println("Tên: " + ten.toUpperCase());
	}

}
