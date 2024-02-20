package ThucHanh;
import java.util.Scanner;
public class Lab3Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int a = scanner.nextInt();
        for(int i = 2; i < a;i++) {
        	if(a%i == 0)
        	{
        		System.out.print("Không phải là số nguyên tố");
        		return;
        	}
        	
        }
        
    	System.out.print("Là số nguyên tố");
	}

}
