package Genre_Review;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controller.TableModelChange;
import Controller.TableModelChange_RV;
import Genre_Review_Model.ReviewDAO;
import Genre_Review_Model.ReviewDTO;
import Login_model.MemberDAO;
import Login_model.MemberDTO;
import Login_view.GenreGUI;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Show_Reivew {

	public static String genre;
	private JFrame frame;
	private JTable table;
	private JTextField tf_search;
	JComboBox cb_searchType;
	public static String nickName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Show_Reivew window = new Show_Reivew(null, null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Show_Reivew(String a,MemberDTO dto) {
		genre = a;
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		frame = new JFrame("ReviewTube - 영화 리뷰");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100,800, 545);
		frame.setLocation(750,200);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (6).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 10, 750, 75);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 134, 760, 311);
		frame.getContentPane().add(scrollPane);

		String[] colName = { "게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜" };
		ReviewDAO dao = new ReviewDAO();
//		genre = "ACTION";
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select(genre));
		Object[][] data = modelCh.listTypeChange_RV();
		System.out.println(dao.select(genre).size());

		table = new JTable(data, colName);
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("New button");
		scrollPane.setColumnHeaderView(btnNewButton);

		JButton btn_close = new JButton("\uB2EB\uAE30");
		btn_close.setBackground(Color.WHITE);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenreGUI gg = new GenreGUI(dto);
				frame.setLocation(-800,0);
			}
		});
		btn_close.setBounds(675, 455, 97, 35);
		frame.getContentPane().add(btn_close);

		tf_search = new JTextField();
		tf_search.setBackground(Color.WHITE);
		tf_search.setBounds(270, 95, 342, 29);
		frame.getContentPane().add(tf_search);
		tf_search.setColumns(10);

		cb_searchType = new JComboBox();
		cb_searchType.setBackground(Color.WHITE);
		cb_searchType.setModel(new DefaultComboBoxModel(
				new String[] { "\uC804\uCCB4\uAC80\uC0C9", "\uC601\uD654\uC81C\uBAA9", "\uB2C9\uB124\uC784" }));
		cb_searchType.setBounds(156, 95, 97, 29);
		frame.getContentPane().add(cb_searchType);

		JButton btn_search = new JButton("\uAC80\uC0C9");
		btn_search.setBackground(Color.WHITE);
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTableSearch();
			}
		});
		btn_search.setBounds(624, 95, 68, 29);
		frame.getContentPane().add(btn_search);

		JButton btn_reset = new JButton("\uCD08\uAE30\uD654");
		btn_reset.setBackground(Color.WHITE);
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTableReset();
			}
		});
		btn_reset.setBounds(54, 95, 90, 29);
		frame.getContentPane().add(btn_reset);
		
		JButton btn_showRv = new JButton("\uB9AC\uBDF0 \uB0B4\uC6A9 \uBCF4\uAE30");
		btn_showRv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewDAO dao = new ReviewDAO();
	               int b = table.getSelectedRow();
	               int reviewNumber = (int) table.getValueAt(b, 0);
	               nickName = (String) table.getValueAt(b, 1);
	               ReviewDTO rdto = dao.detailRv(reviewNumber);
	               DetailReviewGUI dtRv = new DetailReviewGUI(rdto,dto);
	               dao.detailRv(reviewNumber);
			}
		});
		btn_showRv.setBackground(Color.WHITE);
		btn_showRv.setBounds(12, 455, 162, 35);
		frame.getContentPane().add(btn_showRv);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		lblNewLabel_1.setBounds(0, 0, 784, 506);
		frame.getContentPane().add(lblNewLabel_1);

	}

	public void jTableSearch() {

		ReviewDAO dao = new ReviewDAO();
		String[] colName = { "게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜" };
		TableModelChange_RV modelCh = new TableModelChange_RV(
				dao.search((String) cb_searchType.getSelectedItem(), tf_search.getText()));
		Object[][] data = modelCh.listTypeChange_RV();
		DefaultTableModel model = new DefaultTableModel(data, colName);
		table.setModel(model);
	}

	public void jTableReset() {

		ReviewDAO dao = new ReviewDAO();
//		genre = "ACTION";
		String[] colName = { "게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜" };
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select(genre));
		Object[][] data = modelCh.listTypeChange_RV();
		System.out.println(dao.select(genre).size());
		DefaultTableModel model = new DefaultTableModel(data, colName);
		table.setModel(model);
	}
}
