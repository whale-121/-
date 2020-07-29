package Login_view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import Login_model.MemberDAO;
import Login_model.MemberDTO;
import Login_view.MainGUI;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class JoinGUI {

	private JFrame frame;
	private JTextField tf_join_id;
	private JTextField tf_join_name;
	private JPasswordField pf_join_pw;
	private JPasswordField pf_join_pwCheck;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField tf_join_nick;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JoinGUI window = new JoinGUI();
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
	public JoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 389, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uD68C \uC6D0 \uAC00 \uC785");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(12, 10, 347, 34);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 80, 86, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(12, 114, 86, 24);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(12, 148, 86, 24);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC774\uB984");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(12, 220, 86, 24);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\uB098\uC774(\uC138)");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(12, 254, 86, 24);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\uC131\uBCC4");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(12, 294, 86, 24);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\uC88B\uC544\uD558\uB294\uC601\uD654 \uC7A5\uB974");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(12, 328, 107, 24);
		frame.getContentPane().add(label_6);
		
		tf_join_id = new JTextField();
		tf_join_id.setBounds(110, 82, 142, 21);
		frame.getContentPane().add(tf_join_id);
		tf_join_id.setColumns(10);
		
		tf_join_name = new JTextField();
		tf_join_name.setColumns(10);
		tf_join_name.setBounds(110, 222, 142, 21);
		frame.getContentPane().add(tf_join_name);
		
		pf_join_pw = new JPasswordField();
		pf_join_pw.setBounds(110, 116, 142, 22);
		frame.getContentPane().add(pf_join_pw);
		
		pf_join_pwCheck = new JPasswordField();
		pf_join_pwCheck.setBounds(110, 148, 142, 22);
		frame.getContentPane().add(pf_join_pwCheck);
		
		JRadioButton rb_join_man = new JRadioButton("\uB0A8\uC790");
		rb_join_man.setBackground(SystemColor.text);
		buttonGroup.add(rb_join_man);
		rb_join_man.setBounds(106, 295, 121, 23);
		frame.getContentPane().add(rb_join_man);
		
		JRadioButton rb_join_woman = new JRadioButton("\uC5EC\uC790");
		rb_join_woman.setBackground(SystemColor.text);
		buttonGroup.add(rb_join_woman);
		rb_join_woman.setBounds(231, 295, 121, 23);
		frame.getContentPane().add(rb_join_woman);
		
		JComboBox cb_join_age = new JComboBox();
		cb_join_age.setModel(new DefaultComboBoxModel(new String[] {"\uB098\uC774\uC120\uD0DD", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"}));
		cb_join_age.setBounds(110, 255, 142, 22);
		frame.getContentPane().add(cb_join_age);
		
		JCheckBox cb_join_action = new JCheckBox("\uC561\uC158");
		cb_join_action.setBackground(SystemColor.text);
		buttonGroup_1.add(cb_join_action);
		cb_join_action.setBounds(22, 368, 115, 23);
		frame.getContentPane().add(cb_join_action);
		
		JCheckBox cb_join_comedy = new JCheckBox("\uCF54\uBBF8\uB514");
		cb_join_comedy.setBackground(SystemColor.text);
		buttonGroup_1.add(cb_join_comedy);
		cb_join_comedy.setBounds(137, 368, 115, 23);
		frame.getContentPane().add(cb_join_comedy);
		
		JCheckBox cb_join_drama = new JCheckBox("\uB4DC\uB77C\uB9C8");
		cb_join_drama.setBackground(SystemColor.text);
		buttonGroup_1.add(cb_join_drama);
		cb_join_drama.setBounds(266, 368, 93, 23);
		frame.getContentPane().add(cb_join_drama);
		
		JCheckBox cb_join_romence = new JCheckBox("\uB85C\uB9E8\uC2A4");
		cb_join_romence.setBackground(SystemColor.text);
		buttonGroup_1.add(cb_join_romence);
		cb_join_romence.setBounds(22, 405, 115, 23);
		frame.getContentPane().add(cb_join_romence);
		
		JCheckBox cb_join_horror = new JCheckBox("\uACF5\uD3EC/\uC2A4\uB9B4\uB7EC");
		cb_join_horror.setBackground(SystemColor.text);
		buttonGroup_1.add(cb_join_horror);
		cb_join_horror.setBounds(137, 405, 115, 23);
		frame.getContentPane().add(cb_join_horror);
		
		JCheckBox cb_join_SF = new JCheckBox("SF/\uD310\uD0C0\uC9C0");
		cb_join_SF.setBackground(SystemColor.text);
		buttonGroup_1.add(cb_join_SF);
		cb_join_SF.setBounds(266, 405, 93, 23);
		frame.getContentPane().add(cb_join_SF);
		
		JCheckBox cb_join_animation = new JCheckBox("\uC560\uB2C8\uBA54\uC774\uC158");
		cb_join_animation.setBackground(SystemColor.text);
		buttonGroup_1.add(cb_join_animation);
		cb_join_animation.setBounds(22, 442, 115, 23);
		frame.getContentPane().add(cb_join_animation);
		
		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.setBackground(SystemColor.inactiveCaptionBorder);
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MemberDAO dao = new MemberDAO();
					String id = tf_join_id.getText();
					String pw = pf_join_pw.getText();
					String pwCheck = pf_join_pwCheck.getText();
					String name = tf_join_name.getText();
					String nickName = tf_join_nick.getText();
					String sex = null;
					String likeGenre = null;
					String title = null;
					if (rb_join_man.isSelected()) {
						sex = rb_join_man.getText();
					} else if (rb_join_woman.isSelected()) {
						sex = rb_join_woman.getText();
					}
					if (cb_join_action.isSelected()) {
						likeGenre = "ACTION";

					}else if(cb_join_comedy.isSelected()) {
						likeGenre = "COMEDY";
					}else if(cb_join_romence.isSelected()) {
						likeGenre = "ROMANCE";
					}else if(cb_join_drama.isSelected()) {
						likeGenre = "DRAMA";
					}else if(cb_join_SF.isSelected()) {
						likeGenre = "SFFANTASY";
					}else if(cb_join_horror.isSelected()) {
						likeGenre = "HORROTHRILLER";
					}else if(cb_join_animation.isSelected()) {
						likeGenre = "ANIMATION";
					}
					int age = Integer.parseInt((String) cb_join_age.getSelectedItem());
					if(pw.equals(pwCheck)) {
						int cnt = dao.joinInsert(new MemberDTO(id, pw, nickName, name, age, sex, likeGenre, title));
						if(cnt == 0) {
							JOptionPane.showMessageDialog(null, "회원가입 실패!");
						}else {
							frame.dispose();
							MainGUI main = new MainGUI();
							JOptionPane.showMessageDialog(null, "회원가입 성공!");
						}
					}else {
						JOptionPane.showMessageDialog(null, "비밀번호 불일치", "비밀번호 확인", JOptionPane.ERROR_MESSAGE);
						pf_join_pwCheck.setText("");
					}
					
				}
				
			
		});
		btn_join.setBounds(42, 493, 270, 39);
		frame.getContentPane().add(btn_join);
		
		JButton btn_join_close = new JButton("\uB2EB\uAE30");
		btn_join_close.setBackground(SystemColor.inactiveCaptionBorder);
		btn_join_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainGUI mainGui = new MainGUI();
			}
		});
		btn_join_close.setBounds(42, 554, 270, 39);
		frame.getContentPane().add(btn_join_close);
		
		JLabel label_7 = new JLabel("\uB2C9\uB124\uC784");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(12, 186, 86, 24);
		frame.getContentPane().add(label_7);
		
		tf_join_nick = new JTextField();
		tf_join_nick.setColumns(10);
		tf_join_nick.setBounds(110, 191, 142, 21);
		frame.getContentPane().add(tf_join_nick);
	}
}
