package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class homeUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int x = 210;    //chieu rong
	private int y = 600;    //chieu cao
	private JPanel mainMenu; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeUI frame = new homeUI();
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
	public homeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mainMenu = new JPanel();
		mainMenu.setBounds(0, 10, 0, 725);
		contentPane.add(mainMenu);
		mainMenu.setLayout(null);
		
		
		JLabel menuIcon = new JLabel("");
		menuIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openMenu();
			}
		});
		menuIcon.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\laptrinhJava\\ShoesStore\\images\\menu.png"));
		menuIcon.setBounds(43, 10, 50, 53);
		contentPane.add(menuIcon);
		
		
		
		
		
		JLabel close = new JLabel("");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				closeMenu();
			}
		});
		close.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\laptrinhJava\\ShoesStore\\images\\close.png"));
		close.setBounds(151, 10, 50, 40);
		mainMenu.add(close);
		
		
		
		
		
		JLabel trangchu = new JLabel("Trang Chủ");
		trangchu.setBounds(65, 179, 136, 62);
		trangchu.setFont(new Font("Tahoma", Font.PLAIN, 24));
		mainMenu.add(trangchu);
		
		JLabel hoadon = new JLabel("Hóa Đơn");
		hoadon.setFont(new Font("Tahoma", Font.PLAIN, 24));
		hoadon.setBounds(65, 323, 110, 62);
		mainMenu.add(hoadon);
		
		JLabel taikhoan = new JLabel("Tài Khoản");
		taikhoan.setFont(new Font("Tahoma", Font.PLAIN, 24));
		taikhoan.setBounds(65, 251, 110, 62);
		mainMenu.add(taikhoan);
		
		JLabel thongke = new JLabel("Thống Kê");
		thongke.setFont(new Font("Tahoma", Font.PLAIN, 24));
		thongke.setBounds(65, 395, 110, 62);
		mainMenu.add(thongke);
		
		JLabel trogiup = new JLabel("Trợ giúp");
		trogiup.setFont(new Font("Tahoma", Font.PLAIN, 24));
		trogiup.setBounds(65, 515, 110, 62);
		mainMenu.add(trogiup);
		
		JLabel gioithieu = new JLabel("Giới thiệu");
		gioithieu.setFont(new Font("Tahoma", Font.PLAIN, 24));
		gioithieu.setBounds(65, 587, 110, 62);
		mainMenu.add(gioithieu);
		
		JLabel dangxuat = new JLabel("Đăng xuất");
		dangxuat.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dangxuat.setBounds(65, 648, 110, 62);
		mainMenu.add(dangxuat);
		
		JPanel pnContainer = new JPanel();
		pnContainer.setBounds(10, 73, 967, 672);
		contentPane.add(pnContainer);
		pnContainer.setLayout(new CardLayout(0, 0));
		
		JPanel home = new JPanel();
		pnContainer.add(home, "name_3068637344034600");
		
		JLabel homeUI = new JLabel("Trang Chủ");
		homeUI.setFont(new Font("Tahoma", Font.PLAIN, 26));
		home.add(homeUI);
		
		JPanel account = new JPanel();
		pnContainer.add(account, "name_3068692720746200");
		
		JLabel taikhoanUI = new JLabel("Tài Khoản");
		taikhoanUI.setFont(new Font("Tahoma", Font.PLAIN, 26));
		account.add(taikhoanUI);
	}

	 public void openMenu() {
	        mainMenu.setSize(x, y);
	        if (x == 0) {
	            new Thread(new Runnable() {
	                @Override
	                public void run() {
	                    try {
	                        for (int i = 0; i <= 210; i++) {
	                        	mainMenu.setSize(i, y);
	                            Thread.sleep(1);
	                        }
	                    } catch (Exception e) {
	                    }
	                }
	            }).start();
	            x = 210;
	        }
	    }
	 public void closeMenu() {
		 mainMenu.setSize(x, y);
	        if (x == 210) {
	            new Thread(new Runnable() {
	                @Override
	                public void run() {
	                    try {
	                        for (int i = 210; i >= 0; i--) {
	                        	mainMenu.setSize(i, y);
	                            Thread.sleep(2);
	                        }
	                    } catch (Exception e) {
	                    }
	                }
	            }).start();
	            x = 0;
	        }
	    }
}
