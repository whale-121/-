package MyPage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;

public class MyInfo {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MyInfo window = new MyInfo();
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
	public MyInfo() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("내 정보 보기");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500,400);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\uB2EB\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setBounds(475, 10, 97, 29);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setBounds(34, 57, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button_1 = new JButton("\uC218\uC815");
		button_1.setBackground(SystemColor.inactiveCaptionBorder);
		button_1.setBounds(366, 10, 97, 29);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uB098\uC774");
		lblNewLabel_1.setBounds(34, 87, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uC131\uBCC4");
		label.setBounds(34, 117, 57, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uB0B4 \uD0C0\uC774\uD2C0");
		label_1.setBounds(277, 57, 57, 15);
		frame.getContentPane().add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(277, 88, 267, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 267, 250);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel label_2 = new JLabel("\uB2C9\uB124\uC784");
		label_2.setBounds(34, 147, 57, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC120\uD638\uD558\uB294 \uC7A5\uB974");
		label_3.setBounds(34, 177, 83, 15);
		frame.getContentPane().add(label_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(79, 57, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(79, 87, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(79, 117, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(79, 147, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(129, 177, 57, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC561\uC158");
		rdbtnNewRadioButton.setBackground(SystemColor.text);
		rdbtnNewRadioButton.setBounds(34, 204, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("\uCF54\uBBF8\uB514");
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(34, 235, 61, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\uB85C\uB9E8\uC2A4");
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(34, 269, 69, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\uACF5\uD3EC/\uC2A4\uB9B4\uB7EC");
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(129, 269, 97, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton rdbtnSf = new JRadioButton("SF/\uD310\uD0C0\uC9C0");
		rdbtnSf.setBackground(Color.WHITE);
		rdbtnSf.setBounds(129, 205, 83, 23);
		frame.getContentPane().add(rdbtnSf);
		
		JRadioButton radioButton_3 = new JRadioButton("\uC560\uB2C8\uBA54\uC774\uC158");
		radioButton_3.setBackground(Color.WHITE);
		radioButton_3.setBounds(129, 239, 97, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\uB4DC\uB77C\uB9C8");
		radioButton_4.setBackground(Color.WHITE);
		radioButton_4.setBounds(34, 301, 69, 23);
		frame.getContentPane().add(radioButton_4);
	}
}
