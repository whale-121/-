package Login_view;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Login_model.MemberDTO;
import MyPage.mypage;
import WriteReview.writeReview;
import searchMovie.searchMovie;
import javax.swing.ImageIcon;
import java.awt.Color;

public class UserGUI {

	private JFrame frame;
	MemberDTO loginInfo;
	public static MemberDTO dto;
	private final JLabel lblNewLabel_1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UserGUI window = new UserGUI(dto);
////					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public UserGUI(MemberDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		frame = new JFrame("ReviewTube - User Menu");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 385, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(750,200);
		
		JButton btn_view = new JButton("\uB9AC\uBDF0 \uBCF4\uAE30");
		btn_view.setBackground(Color.WHITE);
		btn_view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GenreGUI genre = new GenreGUI(dto);
			}
		});
		btn_view.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btn_view.setBounds(75, 181, 220, 40);
		frame.getContentPane().add(btn_view);
		
		JButton btn_write = new JButton("\uB9AC\uBDF0 \uC4F0\uAE30");
		btn_write.setBackground(Color.WHITE);
		btn_write.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writeReview wr = new writeReview(dto);
			}
		});
		btn_write.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btn_write.setBounds(75, 232, 220, 40);
		frame.getContentPane().add(btn_write);
		
		JButton btn_mypage = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_mypage.setBackground(Color.WHITE);
		btn_mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mypage mp = new mypage(dto);
				
			}
		});
		btn_mypage.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btn_mypage.setBounds(75, 331, 220, 40);
		frame.getContentPane().add(btn_mypage);
		
		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.setBackground(Color.WHITE);
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginInfo = null;
				JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");
				frame.dispose();
				MainGUI main = new MainGUI();
			}
		});
		btn_logout.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btn_logout.setBounds(75, 381, 220, 40);
		frame.getContentPane().add(btn_logout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (3).png"));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 47, 345, 89);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_searchMovie = new JButton("\uC601\uD654 \uCC3E\uAE30");
		btn_searchMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchMovie sm = new searchMovie();
			}
		});
		btn_searchMovie.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btn_searchMovie.setBackground(Color.WHITE);
		btn_searchMovie.setBounds(75, 281, 220, 40);
		frame.getContentPane().add(btn_searchMovie);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		lblNewLabel_1.setBounds(0, 0, 369, 506);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
