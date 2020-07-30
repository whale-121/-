package MyPage;

import java.awt.Font;
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

public class MyReview {

	private JFrame frame;
	private JTable table;
	MemberDTO dto = new MemberDTO();

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				MyInfo window = new MyInfo(nickname);
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
	
	public MyReview(MemberDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(MemberDTO dto) {
		frame = new JFrame("내 타이틀 보기");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500,400);
		
		JButton button = new JButton("\uB2EB\uAE30");
		button.setBounds(475, 322, 97, 29);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		button.setBackground(SystemColor.inactiveCaptionBorder);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("\uB0B4\uAC00 \uC4F4 \uB9AC\uBDF0\uB9AC\uC2A4\uD2B8");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 560, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 71, 538, 240);
		frame.getContentPane().add(scrollPane);
		
		String[] colName = {"게시번호", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜"};
		ReviewDAO dao = new ReviewDAO();
		
//		genre = "ACTION";
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select_nn(dto.getNickName()));
		Object[][] data = modelCh.listTypeChange_RV();
		table = new JTable(data, colName);
		scrollPane.setViewportView(table);
	}

}
