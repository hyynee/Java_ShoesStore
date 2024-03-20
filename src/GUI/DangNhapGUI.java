package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class DangNhapGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField email;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhapGUI frame = new DangNhapGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DangNhapGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbDangNhap = new JLabel("Đăng Nhập");
		lbDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbDangNhap.setBounds(359, 24, 168, 80);
		contentPane.add(lbDangNhap);
		
		JLabel txtEmail = new JLabel("Email: ");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setBounds(249, 152, 62, 25);
		contentPane.add(txtEmail);
		
		JLabel txtPassWord = new JLabel("PassWord: ");
		txtPassWord.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassWord.setBounds(249, 225, 106, 36);
		contentPane.add(txtPassWord);
		
		email = new JTextField();
		email.setBounds(358, 140, 284, 58);
		contentPane.add(email);
		email.setColumns(10);
		
		password = new JTextField();
		password.setBounds(359, 219, 283, 58);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.DARK_GRAY);
		btnLogin.setBackground(Color.GREEN);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(359, 329, 128, 47);
		contentPane.add(btnLogin);
	}
}
