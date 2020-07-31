package Login_view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Login_model.MemberDTO;
import MyPage.mypage;
import WriteReview.writeReview;
import java.awt.SystemColor;

public class UserGUI {

	private JFrame frame;
	MemberDTO loginInfo;
	public static MemberDTO dto;

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
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 430, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_view = new JButton("\uB9AC\uBDF0 \uBCF4\uAE30");
		btn_view.setBackground(SystemColor.inactiveCaptionBorder);
		btn_view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenreGUI genre = new GenreGUI(dto);
			}
		});
		btn_view.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn_view.setBounds(67, 43, 260, 57);
		frame.getContentPane().add(btn_view);
		
		JButton btn_write = new JButton("\uB9AC\uBDF0 \uC4F0\uAE30");
		btn_write.setBackground(SystemColor.inactiveCaptionBorder);
		btn_write.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				writeReview wr = new writeReview(dto);
			}
		});
		btn_write.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn_write.setBounds(67, 143, 260, 57);
		frame.getContentPane().add(btn_write);
		
		JButton btn_mypage = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_mypage.setBackground(SystemColor.inactiveCaptionBorder);
		btn_mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mypage mp = new mypage(dto);
				
			}
		});
		btn_mypage.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn_mypage.setBounds(67, 243, 260, 57);
		frame.getContentPane().add(btn_mypage);
		
		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.setBackground(SystemColor.inactiveCaptionBorder);
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginInfo = null;
				JOptionPane.showMessageDialog(null, "·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
				frame.dispose();
				MainGUI main = new MainGUI();
			}
		});
		btn_logout.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn_logout.setBounds(67, 343, 260, 57);
		frame.getContentPane().add(btn_logout);
	}

}
