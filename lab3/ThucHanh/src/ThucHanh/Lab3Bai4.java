package ThucHanh;
import java.util.Scanner;
public class Lab3Bai4 {
	static void InHocLuc(double diem) {
		String hocLuc;
		if(diem < 5) {
			hocLuc = new String("Yeu"); 
		}else if(diem < 6.5){
			hocLuc = new String("Trung binh");
		}else if(diem < 7.5) {
			hocLuc = new String("Kha");
		}else if(diem < 9) {
			hocLuc = new String("Gioi");
		}else {
			hocLuc = new String("Xuat sac");
		}
		System.out.printf("Hoc luc: %s", hocLuc);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ssv;
		System.out.printf("Hay nhap so sinh vien: " );
		ssv = scanner.nextInt();
		scanner.nextLine();
		double[] diem = new double[ssv];
		String[] ten = new String[ssv];
		// nhap cac sinh vien
		for(int i = 0 ; i < ssv ; i++) {
			System.out.printf("Sinh vien %d, Nhap ten sinh vien: ", i + 1);
			ten[i] = scanner.nextLine();
			System.out.printf("Nhap diem sinh vien %d: ", i + 1);
			diem[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		// sap xep sinh vien
		for(int i = 0 ; i < ssv - 1; i++) {
			for(int j = i + 1;j < ssv;j++) {
				if(diem[j] < diem[i]) {
					double temp = diem[j];
					diem[j] = diem[i];
					diem[i] = temp;
					String s = ten[j];
					ten[j] = ten[i];
					ten[i] = s;
				}
			}
		}
		// in sinh vien
		for(int i = 0 ; i < ssv ; i++) {
			System.out.printf("Sinh vien %d, ten sinh vien: %s\n ", i + 1, ten[i]);
			System.out.printf("Diem sinh vien %d: %f\n", i + 1, diem[i]);
			InHocLuc(diem[i]);
			System.out.println();
		}
	}

}
