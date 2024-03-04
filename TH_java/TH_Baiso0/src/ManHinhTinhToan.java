import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import netscape.javascript.JSObject;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField oB;
	private JTextField oA;
	private JTextField okq;
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình toán + - * /");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel soatxt = new JLabel("Nhập Số A:");
		soatxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		soatxt.setBounds(85, 48, 86, 34);
		contentPane.add(soatxt);
		
		JLabel sobtxt = new JLabel("Nhập Số B:");
		sobtxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sobtxt.setBounds(85, 119, 86, 34);
		contentPane.add(sobtxt);
		
		oB = new JTextField();
		oB.setBounds(267, 119, 124, 39);
		contentPane.add(oB);
		oB.setColumns(10);
		
		oA = new JTextField();
		oA.setColumns(10);
		oA.setBounds(267, 48, 124, 39);
		contentPane.add(oA);
		
		JButton nutcong = new JButton("+");
		nutcong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nutcong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Code xu ly cong
			HamXuLyCong();
			}
		});
		nutcong.setBounds(54, 203, 101, 39);
		contentPane.add(nutcong);
		
		JButton nuttru = new JButton("-");
		nuttru.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nuttru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Code xu ly cong
			HamXuLyTru();
			}
		});
		nuttru.setBounds(177, 203, 101, 39);
		contentPane.add(nuttru);
		
		JButton nutnhan = new JButton("*");
		nutnhan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nutnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Code xu ly cong
			HamXuLyNhan();
			}
		});
		nutnhan.setBounds(336, 203, 101, 39);
		contentPane.add(nutnhan);
		
		JButton nutchia = new JButton("/");
		nutchia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nutchia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Code xu ly cong
			HamXuLyChia();
			}
		});
		nutchia.setBounds(466, 203, 101, 39);
		contentPane.add(nutchia);
		
		JLabel ketquatxt = new JLabel("Kết Quả:");
		ketquatxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ketquatxt.setBounds(85, 266, 86, 34);
		contentPane.add(ketquatxt);
		
		okq = new JTextField();
		okq.setColumns(10);
		okq.setBounds(238, 266, 182, 39);
		contentPane.add(okq);
	}//het ham tao
	void HamXuLyCong() {
		//Lay du lieu tu dieu khien
		String str_soA = oA.getText();
		String str_soB = oB.getText();
		//Chuyen kieu va tinh
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA+soB;
		//Hien thi
		okq.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lay du lieu tu dieu khien
				String str_soA = oA.getText();
				String str_soB = oB.getText();
				//Chuyen kieu va tinh
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				double tong = soA-soB;
				//Hien thi
				okq.setText(String.valueOf(tong));
	}
	void HamXuLyNhan() {
		//Lay du lieu tu dieu khien
				String str_soA = oA.getText();
				String str_soB = oB.getText();
				//Chuyen kieu va tinh
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				double tong = soA*soB;
				//Hien thi
				okq.setText(String.valueOf(tong));
	}
	void HamXuLyChia() {
		//Lay du lieu tu dieu khien
				String str_soA = oA.getText();
				String str_soB = oB.getText();
				//Chuyen kieu va tinh
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				double tong = soA/soB;
				//Hien thi
				okq.setText(String.valueOf(tong));
	
}
		
}
