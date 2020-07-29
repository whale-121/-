package Login_view;

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

import Login_model.MemberDAO;
import Login_model.MemberDTO;
import Login_view.MainGUI;

import java.awt.event.ActionListener;
import java.lang.reflect.Member;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.SystemColor;

public class MainGUI {

	private JFrame frame;
	public static JTextField tf_main_id;
	public static JPasswordField pf_main_pw;
	MemberDTO loginInfo = null;
	JButton btn_main_close;
	JButton btn_main_showReview;
	JButton btn_main_join;
	JButton btn_main_logIn;
	JLabel lbl_id;
	JLabel lbl_pw;
	JPanel panel;

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
		frame.setBackground(SystemColor.text);
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 503, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

		panel = new JPanel();
		panel.setBackground(SystemColor.text);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		btn_main_logIn = new JButton("\uB85C\uADF8\uC778");
		btn_main_logIn.setBackground(SystemColor.inactiveCaptionBorder);
		btn_main_logIn.addActionListener(new ActionListener() {
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
					setLoginInfo(dto);
				}
			}
		});
		btn_main_logIn.setFont(new Font("굴림", Font.BOLD, 20));
		btn_main_logIn.setBounds(49, 211, 389, 46);
		panel.add(btn_main_logIn);

		btn_main_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_main_join.setBackground(SystemColor.inactiveCaptionBorder);
		btn_main_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JoinGUI joinGui = new JoinGUI();
			}
		});
		btn_main_join.setFont(new Font("굴림", Font.BOLD, 20));
		btn_main_join.setBounds(49, 278, 389, 46);
		panel.add(btn_main_join);

		tf_main_id = new JTextField();
		tf_main_id.setBounds(122, 58, 304, 34);
		panel.add(tf_main_id);
		tf_main_id.setColumns(10);

		pf_main_pw = new JPasswordField();
		pf_main_pw.setBounds(122, 105, 304, 34);
		panel.add(pf_main_pw);

		lbl_id = new JLabel("I D :");
		lbl_id.setFont(new Font("굴림", Font.BOLD, 16));
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setBounds(37, 61, 73, 34);
		panel.add(lbl_id);

		lbl_pw = new JLabel("P W :");
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setFont(new Font("굴림", Font.BOLD, 16));
		lbl_pw.setBounds(37, 105, 73, 34);
		panel.add(lbl_pw);

		JButton btn_main_close = new JButton("\uB2EB\uAE30");
		btn_main_close.setBackground(SystemColor.inactiveCaptionBorder);
		btn_main_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				result = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
				if (result == 0) {
					frame.dispose();
				}
			}
		});
		btn_main_close.setFont(new Font("굴림", Font.BOLD, 20));
		btn_main_close.setBounds(49, 340, 389, 46);
		panel.add(btn_main_close);
	}

	public void setLoginInfo(MemberDTO dto) {
		loginInfo = dto;
		JOptionPane.showMessageDialog(null, loginInfo.getNickName() + "님 환영합니다.");
		if (loginInfo.getId().equals("admin")) {
			frame.dispose();
			AdminGUI admin = new AdminGUI();
		} else {
			frame.dispose();
			UserGUI user = new UserGUI();

		}

	}
}
