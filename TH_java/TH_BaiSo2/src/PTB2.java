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

public class PTB2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField oa;
    private JTextField ob;
    private JTextField oc;
    private JLabel kqtxt; // 

    public PTB2() {
        setTitle("Chương Trình Tính PTB2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 468, 298);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nhập Hệ Số b");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(166, 27, 122, 49);
        contentPane.add(lblNewLabel);
        
        JLabel lblNhpHS = new JLabel("Nhập hệ số a");
        lblNhpHS.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNhpHS.setBounds(22, 27, 122, 49);
        contentPane.add(lblNhpHS);
        
        oa = new JTextField();
        oa.setBounds(22, 86, 122, 49);
        contentPane.add(oa);
        oa.setColumns(10);
        
        ob = new JTextField();
        ob.setColumns(10);
        ob.setBounds(166, 86, 122, 49);
        contentPane.add(ob);
        
        JLabel lblKtQu = new JLabel("Kết quả: ");
        lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblKtQu.setBounds(10, 204, 122, 49);
        contentPane.add(lblKtQu);
        
        kqtxt = new JLabel(""); // Khởi tạo kqtxt ở đây
        kqtxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
        kqtxt.setBounds(103, 204, 299, 49);
        contentPane.add(kqtxt);
        
        JButton nutcheck = new JButton("Check");
        nutcheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XuLyTinhPTB2();
            }
        });
        nutcheck.setFont(new Font("Tahoma", Font.PLAIN, 16));
        nutcheck.setBounds(166, 165, 91, 41);
        contentPane.add(nutcheck);
        
        JLabel lblNhpHS_1 = new JLabel("Nhập Hệ Số c");
        lblNhpHS_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNhpHS_1.setBounds(314, 27, 122, 49);
        contentPane.add(lblNhpHS_1);
        
        oc = new JTextField();
        oc.setColumns(10);
        oc.setBounds(314, 86, 122, 49);
        contentPane.add(oc);
    }
    
    void XuLyTinhPTB2() {
            double a = Double.parseDouble(oa.getText());
            double b = Double.parseDouble(ob.getText());
            double c = Double.parseDouble(oc.getText());
            
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                kqtxt.setText("x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                kqtxt.setText("Nghiệm kép: x = " + x);
            } else {
                kqtxt.setText("Phương trình vô nghiệm");
            }
    }
}
