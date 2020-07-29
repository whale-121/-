package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import model.MemberDTO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 405, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0 \uC870\uD68C");
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnNewButton.setBounds(56, 48, 260, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uB9AC\uBDF0 \uAD00\uB9AC");
		button.setFont(new Font("±¼¸²", Font.BOLD, 18));
		button.setBounds(56, 130, 260, 57);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginInfo = null;
				JOptionPane.showMessageDialog(null, "·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
				frame.dispose();
				MainGUI main = new MainGUI();
			}
		});
		button_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		button_1.setBounds(56, 293, 260, 57);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uC601\uD654\uC815\uBCF4\uAD00\uB9AC");
		button_2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		button_2.setBounds(56, 212, 260, 57);
		frame.getContentPane().add(button_2);
	}

}
