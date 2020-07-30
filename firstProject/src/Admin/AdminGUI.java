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
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 405, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0 \uC870\uD68C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MemberInfoGUI MI = new MemberInfoGUI();
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setFont(new Font("����", Font.BOLD, 18));
		btnNewButton.setBounds(71, 66, 260, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uB9AC\uBDF0 \uAD00\uB9AC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewAdminGUI reviewadmin = new ReviewAdminGUI();
				frame.dispose();
			}
		});
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setFont(new Font("����", Font.BOLD, 18));
		button.setBounds(71, 189, 260, 57);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button_1.setBackground(SystemColor.inactiveCaptionBorder);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginInfo = null;
				JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ǿ����ϴ�.");
				frame.dispose();
				MainGUI main = new MainGUI();
			}
		});
		button_1.setFont(new Font("����", Font.BOLD, 18));
		button_1.setBounds(71, 312, 260, 57);
		frame.getContentPane().add(button_1);
	}

}
