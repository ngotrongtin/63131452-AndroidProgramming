package Thuchanh;
import java.util.Scanner;
public class Lab4Bai1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham(12, "sp1");
		SanPham sp2 = new SanPham(13, "sp2");
		sp1.xuat();
		sp2.xuat();
	}

}


class SanPham {
	public SanPham(int donGia, String tenSp) {
		super();
		this.donGia = donGia;
		this.tenSp = tenSp;
	}

	public SanPham(int donGia, String tenSp, double giamGia) {
		super();
		this.donGia = donGia;
		this.tenSp = tenSp;
		this.giamGia = giamGia;
	}

	Scanner scanner = new Scanner(System.in);
	private int donGia;
	private String tenSp;
	private double giamGia;

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	
	
	public void xuat() {
		System.out.print("\nTen san pham la: " + tenSp);
		System.out.print("\nDon gia la: " + donGia);
		System.out.print("\nGiam gia la: " + giamGia);
		System.out.printf("\nThue nhap khau la: %.2f" , getThueNhapKhau());
	}
	
	public void nhap() {
		System.out.print("Nhap vao don gia san pham: ");
		donGia = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nhap vao ten san pham: ");
		tenSp = scanner.nextLine();
		System.out.print("Nhap vao gia giam san pham: ");
		giamGia = scanner.nextDouble();
	}
	
	private double getThueNhapKhau() {
		double ketQua = donGia*(1.0/10);
		return ketQua;
	}
}