package ThucHanh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//Tạo lớp SinhVienPoly gồm 2 thuộc tính họ tên và ngành cùng với phương thức
//trừu tượng là getDiem(). Thêm phương thức getHocLuc() để xếp loại học lực. Lớp
//cũng bao gồm một phương thức xuat() để xuất họ tên, ngành, điểm và học lực ra
//màn hình
abstract class SinhVienPoly{
	String HoTen, Nganh;

	public SinhVienPoly(String hoTen, String nganh) {
		super();
		HoTen = hoTen;
		Nganh = nganh;
	}
	
	abstract double getDiem();
	
	String getHocLuc() {
        double diem = getDiem();
        
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
	
	public void xuat() {
		System.out.print("Ho ten la: " + HoTen + "\n" +
				"Nganh la: " + Nganh + "\n" +	
				"Diem la: " + getDiem() + "\n" +
				"Hoc luc la: " + getHocLuc() + "\n"
				);
	}
	
}

class SinhVienIT extends SinhVienPoly {
	double diemJava,diemHtml,diemCss;

	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss) {
		super(hoTen, nganh);
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		this.diemCss = diemCss;
	}
	@Override
	public double getDiem() {
		return (2*diemJava + diemCss + diemHtml)/4;
	}
}

class SinhVienBiz extends SinhVienPoly {
	double diemMarketing,diemSale;

	public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale) {
		super(hoTen, nganh);
		this.diemMarketing = diemMarketing;
		this.diemSale = diemSale;
	}

	@Override
	public double getDiem() {
		return (2*diemMarketing + diemSale)/3;
	}
}




public class Lab7Bai234 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVienPoly> danhSachSinhVien = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhapDanhSachSinhVien(scanner, danhSachSinhVien);
                    break;
                case 2:
                    xuatDanhSachSinhVien(danhSachSinhVien);
                    break;
                case 3:
                    xuatSinhVienGioi(danhSachSinhVien);
                    break;
                case 4:
                    sapXepTheoDiem(danhSachSinhVien);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 5);
    }

    private static void nhapDanhSachSinhVien(Scanner scanner, ArrayList<SinhVienPoly> danhSachSinhVien) {
        int soLuong;
        System.out.print("Nhập số lượng sinh viên: ");
        soLuong = scanner.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            scanner.nextLine(); // clear buffer
            String hoTen = scanner.nextLine();
            System.out.print("Ngành: ");
            String nganh = scanner.nextLine();
            System.out.print("Loại sinh viên (1: IT, 2: Biz): ");
            int loai = scanner.nextInt();

            if (loai == 1) {
                System.out.print("Điểm Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Điểm HTML: ");
                double diemHtml = scanner.nextDouble();
                System.out.print("Điểm CSS: ");
                double diemCss = scanner.nextDouble();
                danhSachSinhVien.add(new SinhVienIT(hoTen, nganh, diemJava, diemHtml, diemCss));
            } else if (loai == 2) {
                System.out.print("Điểm Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Điểm Sale: ");
                double diemSale = scanner.nextDouble();
                danhSachSinhVien.add(new SinhVienBiz(hoTen, nganh, diemMarketing, diemSale));
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
                i--;
            }
        }
    }

    private static void xuatDanhSachSinhVien(ArrayList<SinhVienPoly> danhSachSinhVien) {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng.");
        } else {
            System.out.println("-----DANH SÁCH SINH VIÊN-----");
            for (SinhVienPoly sv : danhSachSinhVien) {
                sv.xuat();
            }
        }
    }

    private static void xuatSinhVienGioi(ArrayList<SinhVienPoly> danhSachSinhVien) {
        boolean found = false;
        System.out.println("-----DANH SÁCH SINH VIÊN GIỎI-----");
        for (SinhVienPoly sv : danhSachSinhVien) {
            if (sv.getHocLuc().equals("Giỏi")) {
                sv.xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có sinh viên nào có học lực giỏi.");
        }
    }

    private static void sapXepTheoDiem(ArrayList<SinhVienPoly> danhSachSinhVien) {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        });

        System.out.println("-----DANH SÁCH SINH VIÊN THEO ĐIỂM-----");
        for (SinhVienPoly sv : danhSachSinhVien) {
            sv.xuat();
        }
    }
}
