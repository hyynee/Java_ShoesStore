package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class QuanLyNhanVien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMaNhanVien;
	private JTextField txtHoVaTen;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtChucVu;
	private JTextField txtSoDienThoai;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					QuanLyNhanVien frame = new QuanLyNhanVien();
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
	public QuanLyNhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lý nhân viên");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(355, 10, 236, 50);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), null));
		panel.setBounds(26, 89, 436, 222);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mã nhân viên");
		lblNewLabel_2.setBounds(22, 25, 109, 22);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel_2);
		
		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMaNhanVien.setBounds(153, 19, 260, 34);
		panel.add(txtMaNhanVien);
		txtMaNhanVien.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Họ và tên");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(22, 63, 109, 22);
		panel.add(lblNewLabel_2_1);
		
		txtHoVaTen = new JTextField();
		txtHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtHoVaTen.setColumns(10);
		txtHoVaTen.setBounds(153, 57, 260, 34);
		panel.add(txtHoVaTen);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Giới tính");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(22, 101, 109, 22);
		panel.add(lblNewLabel_2_1_1);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		buttonGroup.add(rdbtnNam);
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNam.setBounds(153, 97, 80, 28);
		panel.add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("Nữ");
		buttonGroup.add(rdbtnNu);
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNu.setBounds(256, 97, 80, 28);
		panel.add(rdbtnNu);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Chức vụ");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(22, 136, 109, 22);
		panel.add(lblNewLabel_2_1_2);
		
		txtChucVu = new JTextField();
		txtChucVu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtChucVu.setColumns(10);
		txtChucVu.setBounds(153, 130, 260, 34);
		panel.add(txtChucVu);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(153, 168, 260, 34);
		panel.add(txtSoDienThoai);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Số điện thoại");
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_2_1.setBounds(22, 174, 109, 22);
		panel.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin nhân viên");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(30, 57, 186, 28);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), null));
		panel_1.setBounds(489, 89, 447, 222);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quyền");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(496, 57, 186, 28);
		contentPane.add(lblNewLabel_1_1);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Mã nhân viên", "Họ và tên", "Giới tính", "Chức vụ", "Số điện thoại", "Trạng thái"
				}
			));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(26, 383, 737, 239);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tìm kiếm: ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(50, 339, 98, 28);
		contentPane.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(152, 337, 441, 34);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\lumin\\OneDrive\\Máy tính\\LƯU TRỮ ĐỒ ÁN\\java\\Java_ShoesStore\\images\\Search-icon.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(609, 336, 154, 34);
		contentPane.add(btnNewButton);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setIcon(new ImageIcon("C:\\Users\\lumin\\OneDrive\\Máy tính\\LƯU TRỮ ĐỒ ÁN\\java\\Java_ShoesStore\\images\\add-icon.png"));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThem.setBounds(788, 370, 122, 40);
		contentPane.add(btnThem);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setIcon(new ImageIcon("C:\\Users\\lumin\\OneDrive\\Máy tính\\LƯU TRỮ ĐỒ ÁN\\java\\Java_ShoesStore\\images\\Pencil-icon.png"));
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSua.setBounds(788, 419, 122, 40);
		contentPane.add(btnSua);
		
		JButton btnXoa = new JButton("Xoá");
		btnXoa.setIcon(new ImageIcon("C:\\Users\\lumin\\OneDrive\\Máy tính\\LƯU TRỮ ĐỒ ÁN\\java\\Java_ShoesStore\\images\\delete-icon.png"));
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa.setBounds(788, 469, 122, 40);
		contentPane.add(btnXoa);
		
		JButton btnNhapExecel = new JButton("Nhập");
		btnNhapExecel.setIcon(new ImageIcon("C:\\Users\\lumin\\OneDrive\\Máy tính\\LƯU TRỮ ĐỒ ÁN\\java\\Java_ShoesStore\\images\\excel-icon.png"));
		btnNhapExecel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNhapExecel.setBounds(788, 519, 122, 40);
		contentPane.add(btnNhapExecel);
		
		JButton btnXuatExcel = new JButton("Xuất");
		btnXuatExcel.setIcon(new ImageIcon("C:\\Users\\lumin\\OneDrive\\Máy tính\\LƯU TRỮ ĐỒ ÁN\\java\\Java_ShoesStore\\images\\excel-icon.png"));
		btnXuatExcel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXuatExcel.setBounds(788, 569, 122, 40);
		contentPane.add(btnXuatExcel);
	}
}
