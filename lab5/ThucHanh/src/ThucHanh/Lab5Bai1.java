package ThucHanh;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lab5Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		List<Double> list = new ArrayList<Double>();
		while(true){
			Double x = scanner.nextDouble();
			list.add(x);
			System.out.print("Nhập thêm (Y/N)? ");
			if(scanner.nextLine().equals("N")){
				break;
			}
		}
		
		 System.out.println("Danh sách số thực bạn vừa nhập:");
	     for (double number : list) {
	        System.out.println(number);
	     }

	     double sum = 0;
	     for (double number : list) {
	         sum += number;
	     }
	     System.out.println("Tổng của các số thực là: " + sum);
		scanner.close();
	}

}
