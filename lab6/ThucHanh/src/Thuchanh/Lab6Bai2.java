package Thuchanh;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab6Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> sp = new ArrayList<SanPham>();
		for(int i = 1; i <= 5;i++) {
			SanPham a = new SanPham();
			a.nhap();
			sp.add(a);
		}
	}

}

class SanPham{
	
	private String tenSp;
	private double donGia;
	private String hang;
	public SanPham() {
		this.hang = "nokia";
	}
	public void xuat() {
		
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ten san pham: ");
		this.tenSp = scanner.nextLine();
		System.out.print("Nhap vao gia san pham: ");
		this.donGia = scanner.nextInt();
		scanner.nextLine();
	}
}
