package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class homeUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int x = 210;    //chieu rong
	private int y = 733;    //chieu cao
	private JPanel mainMenu; 
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					homeUI frame = new homeUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public homeUI() {
		   setTitle("Danh sách sản phẩm");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(1280, 800);
	        setLocationRelativeTo(null);

	        // Tạo menu bar
	        JMenuBar menuBar = createMenuBar();

	        // Tạo JPanel chứa menu bar
	        JPanel menuPanel = new JPanel();
	        menuPanel.setLayout(null);
	        menuPanel.add(menuBar);

	        // Tạo các mục menu con và thêm vào các menu chính
	        JMenuItem homeMenuItem = new JMenuItem("Trang chủ");
	        JMenuItem productMenuItem = new JMenuItem("Sản phẩm");
	        JMenuItem invoiceMenuItem = new JMenuItem("Hóa đơn");
	        JMenuItem statisticsMenuItem = new JMenuItem("Thống kê");
	        JMenuItem troGiupMenuItem = new JMenuItem("Trợ giúp");
	        JMenuItem loginMenuItem = new JMenuItem("Đăng nhập");
	        JMenuItem logOutMenuItem =  new JMenuItem("Đăng xuất");
	        // Xử lý sự kiện khi nhấp vào các mục menu con
	        homeMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(homeUI.this, "Bạn đang ở trang chủ");
	            }
	        });

	        productMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(homeUI.this, "Danh sách sản phẩm");
	            }
	        });

	        invoiceMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(homeUI.this, "Hóa đơn");
	            }
	        });

	        statisticsMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(homeUI.this, "Thống kê");
	            }
	        });
	        
	        troGiupMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(homeUI.this, "Trợ giúp");
	            }
	        });
	        
	        loginMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(homeUI.this, "Đăng nhập");
	            }
	        });
	        
	        logOutMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(homeUI.this, "Đăng xuất");
	            }
	        });
	       

	        // Danh sách sản phẩm
	        String[] products = {"Sản phẩm 1", "Sản phẩm 2", "Sản phẩm 3", "Sản phẩm 4", "Sản phẩm 5", "Sản phẩm 6"};

	        // Tạo JPanel chứa danh sách sản phẩm
	        JPanel productPanel = new JPanel(new GridLayout(0, 3, 10, 10));
	        productPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

	        // Thêm từng sản phẩm vào JPanel
	        for (String product : products) {
	            JPanel itemPanel = createProductPanel(product);
	            productPanel.add(itemPanel);
	        }

	        // Tạo JSplitPane chứa menu bên trái và danh sách sản phẩm bên phải
	        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuPanel, productPanel);
	        splitPane.setDividerLocation(150); // Thiết lập vị trí chia phần tử
	        splitPane.setResizeWeight(0.0); // Không cho phép thay đổi kích thước menu khi thay đổi cửa sổ

	        // Thêm JSplitPane vào content pane
	        setContentPane(splitPane);

	        // Hiển thị JFrame
	        setVisible(true);
	    }

	    private JMenuBar createMenuBar() {
	        // Tạo menu bar
	        JMenuBar menuBar = new JMenuBar();
	        menuBar.setBounds(0, 0, 149, 751);
	        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.Y_AXIS));

	        // Tạo các menu
	        JMenu homeMenu = new JMenu("Trang chủ");
	        homeMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	        JMenu productMenu = new JMenu("Sản phẩm");
	        productMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	        JMenu invoiceMenu = new JMenu("Hóa đơn");
	        invoiceMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	        JMenu statisticsMenu = new JMenu("Thống kê");
	        statisticsMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	        JMenu troGiupMenuItem = new JMenu("Trợ giúp");
	        troGiupMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	        JMenu loginMenuItem = new JMenu("Đăng nhập");
	        loginMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	        JMenu logOutMenuItem = new JMenu("Đăng xuất");
	        logOutMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	      

	        // Thêm các menu vào menu bar
	        menuBar.add(homeMenu);
	        menuBar.add(productMenu);
	        menuBar.add(invoiceMenu);
	        menuBar.add(statisticsMenu);
	        menuBar.add(troGiupMenuItem);
	        menuBar.add(loginMenuItem);
	        menuBar.add(logOutMenuItem);

	        return menuBar;
	    }

	    private JPanel createProductPanel(String productName) {
	        JPanel panel = new JPanel(new BorderLayout());
	        panel.setBackground(Color.WHITE);
	        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

	        JLabel nameLabel = new JLabel(productName);
	        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        panel.add(nameLabel, BorderLayout.CENTER);

	        return panel;
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(homeUI::new);
	    }
}
