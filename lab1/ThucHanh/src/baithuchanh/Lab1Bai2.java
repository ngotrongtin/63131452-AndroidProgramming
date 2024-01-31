package baithuchanh;
import java.util.Scanner;
public class Lab1Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài: ");
		int chieuDai = scanner.nextInt();
		System.out.print("chiều rộng: ");
		int chieuRong = scanner.nextInt();
		int chuVi = (chieuDai + chieuRong) * 2;
		int dienTich = chieuDai * chieuRong;
		int canhNhoNhat = Math.min(chieuDai, chieuRong);
		System.out.printf("chu vi là : %d\n",chuVi);
		System.out.printf("diện tích là : %d \n",dienTich);
		System.out.printf("cạnh nhỏ nhất là : %d", canhNhoNhat);
	}

}
