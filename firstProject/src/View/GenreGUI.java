package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GenreGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenreGUI window = new GenreGUI();
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
	public GenreGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_action = new JButton("\uC561\uC158");
		btn_action.setBounds(36, 49, 97, 78);
		frame.getContentPane().add(btn_action);
		
		JButton btn_comedy = new JButton("\uCF54\uBBF8\uB514");
		btn_comedy.setBounds(169, 49, 97, 78);
		frame.getContentPane().add(btn_comedy);
		
		JButton btn_drama = new JButton("\uB4DC\uB77C\uB9C8");
		btn_drama.setBounds(302, 49, 97, 78);
		frame.getContentPane().add(btn_drama);
		
		JButton btn_romance = new JButton("\uB85C\uB9E8\uC2A4");
		btn_romance.setBounds(169, 303, 97, 78);
		frame.getContentPane().add(btn_romance);
		
		JButton btn_hrror = new JButton("\uACF5\uD3EC/\uC2A4\uB9B4\uB7EC");
		btn_hrror.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_hrror.setBounds(169, 176, 97, 78);
		frame.getContentPane().add(btn_hrror);
		
		JButton btn_SF = new JButton("SF/\uD310\uD0C0\uC9C0");
		btn_SF.setBounds(302, 303, 97, 78);
		frame.getContentPane().add(btn_SF);
		
		JButton btn_ani = new JButton("\uC560\uB2C8\uBA54\uC774\uC158");
		btn_ani.setBounds(36, 303, 97, 78);
		frame.getContentPane().add(btn_ani);
		
		JButton btn_close = new JButton("\uB2EB\uAE30");
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserGUI user = new UserGUI();
			}
		});
		btn_close.setBounds(279, 413, 146, 38);
		frame.getContentPane().add(btn_close);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uC7A5\uB974 \uC120\uD0DD");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 413, 28);
		frame.getContentPane().add(lblNewLabel);
	}

}
