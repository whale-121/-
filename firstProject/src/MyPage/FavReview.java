package MyPage;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import Controller.TableModelChange_RV;
import Genre_Review_Model.ReviewDAO;
import Login_model.MemberDTO;
import java.awt.Font;

public class FavReview {

	private JFrame frame;
	private JTable table;
	MemberDTO dto = new MemberDTO();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FavReview window = new FavReview();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public FavReview(String f, MemberDTO dto) { // DTO객체 불러오는 법
		initialize(f, dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String f, MemberDTO dto) {
		System.out.println(dto.getNickName());
		frame = new JFrame();
		frame.setBounds(100, 100, 967, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn_back = new JButton("\uC774\uC804\uC73C\uB85C");
		btn_back.setBackground(SystemColor.inactiveCaptionBorder);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FavoriteList fl = new FavoriteList(dto);
			}
		});
		btn_back.setBounds(12, 10, 103, 35);
		frame.getContentPane().add(btn_back);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 63, 925, 501);
		frame.getContentPane().add(scrollPane);

		String[] colName = { "게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜" };
		ReviewDAO dao = new ReviewDAO();
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select_nn(f)); 
		Object[][] data = modelCh.listTypeChange_RV();
		table = new JTable(data, colName);
		scrollPane.setViewportView(table);

		
		JLabel lbl_favlist_title = new JLabel("New label");
		lbl_favlist_title.setFont(new Font("굴림", Font.BOLD, 14));
		lbl_favlist_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_favlist_title.setBounds(617, 10, 322, 43);
		frame.getContentPane().add(lbl_favlist_title);
		lbl_favlist_title.setText(f + "님의 리뷰 리스트");
	}
}
