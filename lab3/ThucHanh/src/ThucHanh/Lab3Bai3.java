package ThucHanh;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[100];
		int n;
		System.out.printf("Nhap n: ");
		n = scanner.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.printf("Nhap phan tu thu %d: ", i);
			a[i] = scanner.nextInt();
		}
		int[] b = Arrays.copyOf(a, n);
		Arrays.sort(b);
		for(int i = 0 ; i < n ; i++) {
			System.out.printf("Phan tu thu %d la %d\n", i, b[i]);
		}
		int min = b[0];
		for(int i = 1;i<n;i++) {
			if(min > b[i])
				min = b[i];
		}
		System.out.printf("so nho nhat la %d\n", min);
		double tbc = 0;
		int dem = 0;
		for(int i = 0;i<n;i++) {
			if(b[i]%3 == 0) {
				tbc += b[i];
				dem++;
			}
		}
		if(dem != 0)
			tbc /= dem;
		System.out.printf("trung binh cong cac so chia het cho 3 la %f\n", tbc);
		
		
	}

}
