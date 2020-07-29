package MyPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Login_model.MemberDTO;
import Login_view.UserGUI;

public class mypage {

	private JFrame frame;
	private MemberDTO loginInfo = null;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					mypage window = new mypage();
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
	public mypage() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("MY PAGE");
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 463, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(500,400);
		
		JLabel lbl_title = new JLabel("M Y P A G E");
		lbl_title.setForeground(Color.BLACK);
		lbl_title.setBackground(Color.BLACK);
		lbl_title.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setBounds(12, 10, 424, 36);
		frame.getContentPane().add(lbl_title);
		
		JButton btn_close = new JButton("\uB2EB \uAE30");
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserGUI ug = new UserGUI();
			}
			
		});
		btn_close.setBackground(SystemColor.inactiveCaptionBorder);
		btn_close.setBounds(175, 200, 97, 36);
		frame.getContentPane().add(btn_close);
		
		JButton btn_info = new JButton("\uB0B4 \uC815\uBCF4");
		btn_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyInfo mi = new MyInfo();
			}
		});
		btn_info.setBackground(SystemColor.inactiveCaptionBorder);
		btn_info.setBounds(12, 72, 97, 97);
		frame.getContentPane().add(btn_info);
		
		JButton button = new JButton("\uB0B4 \uB9AC\uBDF0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyReview mr = new MyReview();
			}
		});
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setBounds(121, 72, 97, 97);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uC990\uACA8\uCC3E\uAE30");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FavoriteList FavList = new FavoriteList();
			}
		});
		button_1.setBackground(SystemColor.inactiveCaptionBorder);
		button_1.setBounds(230, 72, 97, 97);
		frame.getContentPane().add(button_1);
		
		JButton btn_del = new JButton("\uD68C\uC6D0 \uD0C8\uD1F4");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MemberDel md = new MemberDel();
			}
		});
		btn_del.setBackground(SystemColor.inactiveCaptionBorder);
		btn_del.setBounds(339, 72, 97, 97);
		frame.getContentPane().add(btn_del);
		
		String[] colName = {};
		Object[][] data = {};
	}
	
	// 액션, 코미디, 드라마, 로맨스, 공포/스릴러, SF/판타지, 애니메이션
}
