package Genre_Review;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controller.TableModelChange;
import Controller.TableModelChange_RV;
import Genre_Review_Model.ReviewDAO;
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

public class Show_Reivew {

	public static String genre;
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
					Show_Reivew window = new Show_Reivew(genre);
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
	public Show_Reivew(String a) {
		genre = a;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 884, 743);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uB9AC\uBDF0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 10, 844, 41);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 134, 844, 515);
		frame.getContentPane().add(scrollPane);
		
		
		
		String[] colName = {"게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜"};
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
		btn_close.setBackground(SystemColor.inactiveCaptionBorder);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MemberDTO dto = null;
				GenreGUI gg = new GenreGUI(dto);
			}
		});
		btn_close.setBounds(653, 659, 203, 35);
		frame.getContentPane().add(btn_close);
		
		tf_search = new JTextField();
		tf_search.setBounds(270, 95, 342, 29);
		frame.getContentPane().add(tf_search);
		tf_search.setColumns(10);
		
		cb_searchType = new JComboBox();
		cb_searchType.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4\uAC80\uC0C9", "\uC601\uD654\uC81C\uBAA9", "\uB2C9\uB124\uC784"}));
		cb_searchType.setBounds(156, 95, 97, 29);
		frame.getContentPane().add(cb_searchType);
		
		JButton btn_search = new JButton("\uAC80\uC0C9");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jTableSearch();
			}
		});
		btn_search.setBounds(624, 95, 68, 29);
		frame.getContentPane().add(btn_search);
		
		JButton btn_reset = new JButton("\uCD08\uAE30\uD654");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTableReset();
			}
		});
		btn_reset.setBounds(52, 95, 90, 29);
		frame.getContentPane().add(btn_reset);
		

	}
	public void setGenre(String a) {
		genre = a;
	}
	public void jTableSearch(){
		ReviewDAO dao = new ReviewDAO();
		String[] colName = {"게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜"};
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.search((String)cb_searchType.getSelectedItem(),tf_search.getText()));
		Object[][] data = modelCh.listTypeChange_RV();
		DefaultTableModel model= new DefaultTableModel(data, colName);
		table.setModel(model);
		}
	public void jTableReset() {
		ReviewDAO dao = new ReviewDAO();
//		genre = "ACTION";
		String[] colName = {"게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜"};
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select(genre));
		Object[][] data = modelCh.listTypeChange_RV();
		System.out.println(dao.select(genre).size());
		DefaultTableModel model= new DefaultTableModel(data, colName);
		table.setModel(model);
	}
}
