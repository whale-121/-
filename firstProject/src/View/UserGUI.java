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

public class UserGUI {

	private JFrame frame;
	MemberDTO loginInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI window = new UserGUI();
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
	public UserGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\uB9AC\uBDF0 \uBCF4\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GenreGUI genre = new GenreGUI();
			}
		});
		button.setFont(new Font("±¼¸²", Font.BOLD, 18));
		button.setBounds(67, 43, 260, 57);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uB9AC\uBDF0 \uC4F0\uAE30");
		button_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		button_1.setBounds(67, 143, 260, 57);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		button_2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		button_2.setBounds(67, 243, 260, 57);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginInfo = null;
				JOptionPane.showMessageDialog(null, "·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
				frame.dispose();
				MainGUI main = new MainGUI();
			}
		});
		button_3.setFont(new Font("±¼¸²", Font.BOLD, 18));
		button_3.setBounds(67, 343, 260, 57);
		frame.getContentPane().add(button_3);
	}

}
