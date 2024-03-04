import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField otk;
	private JTextField omk;

	public LoginFrame() {
		setTitle("Tài Khoản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRANG ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(133, 10, 165, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblTiKhon = new JLabel("Tài Khoản");
		lblTiKhon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTiKhon.setBounds(30, 89, 82, 46);
		contentPane.add(lblTiKhon);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(30, 144, 82, 46);
		contentPane.add(lblMtKhu);
		
		otk = new JTextField();
		otk.setBounds(122, 97, 304, 35);
		contentPane.add(otk);
		otk.setColumns(10);
		
		omk = new JTextField();
		omk.setColumns(10);
		omk.setBounds(122, 155, 304, 35);
		contentPane.add(omk);
		
		JButton nutdn = new JButton("Đăng Nhập");
		nutdn.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Code xu ly cong
			XuLyDangNhap();
			}
		});
		nutdn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nutdn.setBounds(176, 218, 122, 35);
		contentPane.add(nutdn);
	}
	//Xu ly dang nhap
	void XuLyDangNhap() {
		String str_tk = otk.getText();
		String str_mk = omk.getText();
		if (str_tk.equals("63CNTT")&& str_mk.equals("123")) {
			//Hien trang chu
			MainFrame homePage = new MainFrame();
			homePage.setVisible(true);
			//an form dang nhap
			this.setVisible(false);
		}else {// bao loi
			otk.setText("");
			omk.setText("");
			JOptionPane hopThoaiLoi = new JOptionPane();
			hopThoaiLoi.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}

}
