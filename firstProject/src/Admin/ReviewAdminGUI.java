package Admin;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controller.TableModelChange_RV;
import Genre_Review_Model.ReviewDAO;
import Login_model.MemberDAO;
import Login_model.MemberDTO;
import Login_view.GenreGUI;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ReviewAdminGUI {

	private JFrame frame;
	private JTable table;
	private JTextField tf_search;
	JComboBox cb_searchType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReviewAdminGUI window = new ReviewAdminGUI();
//					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReviewAdminGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100,800,545);
		frame.setLocation(750,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uB9AC\uBDF0");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (10).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 10, 761, 75);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 134, 761, 316);
		frame.getContentPane().add(scrollPane);

		String[] colName = { "게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜" };
		ReviewDAO dao = new ReviewDAO();
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.selectAll());
		Object[][] data = modelCh.listTypeChange_RV();
		System.out.println(dao.selectAll().size());

		table = new JTable(data, colName);
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("New button");
		scrollPane.setColumnHeaderView(btnNewButton);

		JButton btn_close = new JButton("\uB2EB\uAE30");
		btn_close.setBackground(Color.WHITE);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminGUI adGui = new AdminGUI();
				frame.setLocation(-800,0);
			}
		});
		btn_close.setBounds(642, 460, 131, 35);
		frame.getContentPane().add(btn_close);

		tf_search = new JTextField();
		tf_search.setBackground(Color.WHITE);
		tf_search.setBounds(240, 95, 424, 29);
		frame.getContentPane().add(tf_search);
		tf_search.setColumns(10);

		cb_searchType = new JComboBox();
		cb_searchType.setBackground(Color.WHITE);
		cb_searchType.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4\uAC80\uC0C9", "\uC601\uD654\uC81C\uBAA9", "\uB2C9\uB124\uC784", "\uC7A5\uB974"}));
		cb_searchType.setBounds(121, 95, 107, 29);
		frame.getContentPane().add(cb_searchType);

		JButton btn_search = new JButton("\uAC80\uC0C9");
		btn_search.setBackground(Color.WHITE);
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTableSearch();
			}
		});
		btn_search.setBounds(676, 95, 97, 29);
		frame.getContentPane().add(btn_search);

		JButton btn_reset = new JButton("\uCD08\uAE30\uD654");
		btn_reset.setBackground(Color.WHITE);
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTableReset();
			}
		});
		btn_reset.setBounds(12, 95, 97, 29);
		frame.getContentPane().add(btn_reset);
		
		JButton btn_delete = new JButton("\uC0AD\uC81C\uD558\uAE30");
		btn_delete.setBackground(Color.WHITE);
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int result = 0;
		            result = JOptionPane.showConfirmDialog(null, "리뷰를 삭제하시겠습니까?", "리뷰삭제", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
		            if (result == 0) {
		            	ReviewDAO dao = new ReviewDAO();
			               int b = table.getSelectedRow();
			               int reviewNumber = (int) table.getValueAt(b, 0);
			               dao.reviewDelete(reviewNumber);
		               JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.");
		               jTableReset();
		            }
			}
		});
		btn_delete.setBounds(12, 460, 131, 35);
		frame.getContentPane().add(btn_delete);
		
		JLabel background = new JLabel("New label");
		background.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		background.setBounds(0, 0, 784, 506);
		frame.getContentPane().add(background);
	}

	public void jTableSearch() {

		ReviewDAO dao = new ReviewDAO();
		String[] colName = { "게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜" };
		TableModelChange_RV modelCh = new TableModelChange_RV(
				dao.searchAdmin((String) cb_searchType.getSelectedItem(), tf_search.getText()));
		Object[][] data = modelCh.listTypeChange_RV();
		DefaultTableModel model = new DefaultTableModel(data, colName);
		table.setModel(model);
	}

	public void jTableReset() {

		ReviewDAO dao = new ReviewDAO();
//		genre = "ACTION";
		String[] colName = { "게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜" };
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.selectAll());
		Object[][] data = modelCh.listTypeChange_RV();
		System.out.println(dao.selectAll().size());
		DefaultTableModel model = new DefaultTableModel(data, colName);
		table.setModel(model);
	}
}
