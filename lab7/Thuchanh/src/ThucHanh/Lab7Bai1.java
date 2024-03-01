package ThucHanh;

class ChuNhat {
	int rong,dai;
	
	public ChuNhat(int rong, int dai) {
		this.rong = rong;
		this.dai = dai;
	}

	int getChuVi() {
		return (rong+dai)*2;
	}
	
	int getDienTich() {
		return rong*dai;
	}
	
	void xuat() {
		System.out.print("Chieu dai la: " + dai + "\n" +
				"Chieu rong la: " + rong + "\n" +
				"Chu vi la: " + getChuVi() + "\n" +
				"Chieu dai la: " + getDienTich() + "\n"
				);
	}
}

class Vuong extends ChuNhat {
	
	public Vuong(int rong) {
		super(rong, rong);
		// TODO Auto-generated constructor stub
	}
	
	void xuat() {
		System.out.print("Canh la: " + dai + "\n" +
				"Chu vi la: " + getChuVi() + "\n" +
				"Chieu dai la: " + getDienTich() + "\n"
				);
	}
}


public class Lab7Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChuNhat cn = new ChuNhat(3,4);
		ChuNhat cn2 = new ChuNhat(7,8);
		ChuNhat v = new Vuong(5);
		cn.xuat();
		cn2.xuat();
		v.xuat();
	}

}
