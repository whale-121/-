package View;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import model.MemberDAO;
import model.MemberDTO;
import View.MainGUI;

import java.awt.event.ActionListener;
import java.lang.reflect.Member;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
public class MainGUI {

	private JFrame frame;
	private JTextField tf_main_id;
	private JPasswordField pf_main_pw;
	MemberDTO loginInfo = null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 718);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btn_logIn = new JButton("\uB85C\uADF8\uC778");
		btn_logIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = tf_main_id.getText();
				String pw = pf_main_pw.getText();
				MemberDTO dto = dao.loginSelect(id, pw);
				if (dto == null) {
					// 다이얼로그 띄우기
					// 에러메세지 -> 4개 매개변수
					JOptionPane.showMessageDialog(null, "로그인 실패!", "로그인", JOptionPane.ERROR_MESSAGE);
					pf_main_pw.setText("");
				} else {
					frame.dispose();
					MainGUI mainGui = new MainGUI();
				}
			}
		});
		btn_logIn.setFont(new Font("굴림", Font.BOLD, 20));
		btn_logIn.setBounds(398, 267, 121, 60);
		panel.add(btn_logIn);

		JButton btn_joIn = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_joIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JoinGUI joinGui = new JoinGUI();
			}
		});
		btn_joIn.setFont(new Font("굴림", Font.BOLD, 20));
		btn_joIn.setBounds(88, 388, 389, 46);
		panel.add(btn_joIn);

		tf_main_id = new JTextField();
		tf_main_id.setBounds(127, 255, 238, 34);
		panel.add(tf_main_id);
		tf_main_id.setColumns(10);

		pf_main_pw = new JPasswordField();
		pf_main_pw.setBounds(127, 302, 238, 34);
		panel.add(pf_main_pw);

		JLabel lblNewLabel = new JLabel("I D :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 258, 73, 34);
		panel.add(lblNewLabel);

		JLabel lblPw = new JLabel("P W :");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("굴림", Font.BOLD, 16));
		lblPw.setBounds(42, 302, 73, 34);
		panel.add(lblPw);
		
		JButton btn_close = new JButton("\uB2EB\uAE30");
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_close.setFont(new Font("굴림", Font.BOLD, 20));
		btn_close.setBounds(88, 450, 389, 46);
		panel.add(btn_close);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_image = new JLabel(new ImageIcon(""));
		panel_1.add(lbl_image, "name_1131022174943900");
	}
	public void setLoginInfo(MemberDTO dto) {
		loginInfo = dto;
//		btn_main_login.setVisible(false);
//		btn_main_join.setVisible(false);
		if(dto.getId().equals("admin")) {
//			btn_admin_menu.setVisible(true);
		}
//		btn_main_logout.setVisible(true);
		JOptionPane.showMessageDialog(null, loginInfo.getNickName()+"님 환영합니다.");
	}
}
