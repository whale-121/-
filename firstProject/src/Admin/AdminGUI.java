package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import Login_model.MemberDTO;
import Login_view.MainGUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class AdminGUI {

	private JFrame frame;
	MemberDTO loginInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGUI window = new AdminGUI();
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
	public AdminGUI() {
		initialize();
		frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("ReviewTube - 관리자 메뉴");
		frame.getContentPane().setBackground(SystemColor.text);
	      frame.setBounds(100, 100, 385, 545);
	      frame.setLocation(750,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0 \uC870\uD68C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberInfoGUI MI = new MemberInfoGUI();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("HY헤드라인M", Font.PLAIN, 16));
		btnNewButton.setBounds(79, 176, 222, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uB9AC\uBDF0 \uAD00\uB9AC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewAdminGUI reviewadmin = new ReviewAdminGUI();
			}
		});
		button.setBackground(Color.WHITE);
		button.setFont(new Font("HY헤드라인M", Font.PLAIN, 16));
		button.setBounds(79, 276, 222, 57);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginInfo = null;
				JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");
				MainGUI main = new MainGUI();
			}
		});
		button_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 16));
		button_1.setBounds(79, 376, 222, 57);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (8).png"));
		lblNewLabel_1.setBounds(12, 56, 345, 75);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		lblNewLabel.setBounds(0, 0, 369, 506);
		frame.getContentPane().add(lblNewLabel);
	}

}
