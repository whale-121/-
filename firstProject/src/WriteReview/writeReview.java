package WriteReview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class writeReview {

	private JFrame frame;
	int r = 0;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					writeReview window = new writeReview();
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
	public writeReview() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.getContentPane().setLayout(null);
		frame.setLocation(500,400);
		
		JLabel lblNewLabel = new JLabel("NEW REVIEW");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 107, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2C9\uB124\uC784 : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(12, 51, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC791\uC131 \uC77C\uC790 : ");
		lblNewLabel_2.setBounds(12, 76, 64, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("\uC7A5\uB974 \uC120\uD0DD");
		lblNewLabel_4.setBounds(12, 111, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdbtn_action = new JRadioButton("\uC561\uC158");
		rdbtn_action.setBackground(SystemColor.text);
		rdbtn_action.setBounds(77, 107, 57, 23);
		frame.getContentPane().add(rdbtn_action);
		
		JRadioButton rdbtn_comedy = new JRadioButton("\uCF54\uBBF8\uB514");
		rdbtn_comedy.setBackground(Color.WHITE);
		rdbtn_comedy.setBounds(138, 107, 64, 23);
		frame.getContentPane().add(rdbtn_comedy);
		
		JRadioButton rdbtn_drama = new JRadioButton("\uB4DC\uB77C\uB9C8");
		rdbtn_drama.setBackground(Color.WHITE);
		rdbtn_drama.setBounds(206, 107, 64, 23);
		frame.getContentPane().add(rdbtn_drama);
		
		JRadioButton rdbtn_romance = new JRadioButton("\uB85C\uB9E8\uC2A4");
		rdbtn_romance.setBackground(Color.WHITE);
		rdbtn_romance.setBounds(274, 107, 64, 23);
		frame.getContentPane().add(rdbtn_romance);
		
		JRadioButton rdbtn_horror_thrill = new JRadioButton("\uACF5\uD3EC/\uC2A4\uB9B4\uB7EC");
		rdbtn_horror_thrill.setBackground(SystemColor.text);
		rdbtn_horror_thrill.setBounds(77, 132, 106, 23);
		frame.getContentPane().add(rdbtn_horror_thrill);
		
		JRadioButton rdbtn_sf_fantasy = new JRadioButton("SF/\uD310\uD0C0\uC9C0");
		rdbtn_sf_fantasy.setBackground(Color.WHITE);
		rdbtn_sf_fantasy.setBounds(187, 132, 93, 23);
		frame.getContentPane().add(rdbtn_sf_fantasy);
		
		JRadioButton rdbtn_animation = new JRadioButton("\uC560\uB2C8\uBA54\uC774\uC158");
		rdbtn_animation.setBackground(Color.WHITE);
		rdbtn_animation.setBounds(284, 132, 107, 23);
		frame.getContentPane().add(rdbtn_animation);
		
		JLabel lbl_point = new JLabel("\uD3C9\uC810 \uC120\uD0DD");
		lbl_point.setBounds(12, 210, 57, 15);
		frame.getContentPane().add(lbl_point);
		
		JLabel lbl_pointNumber = new JLabel("New label");
		lbl_pointNumber.setBounds(322, 210, 57, 23);
		frame.getContentPane().add(lbl_pointNumber);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 420, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				r = slider.getValue();
				lbl_pointNumber.setText(r+"Á¡");
			}
		});
		slider.setForeground(SystemColor.desktop);
		slider.setMinorTickSpacing(1);
		slider.setBackground(SystemColor.text);
		slider.setMaximum(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(77, 210, 233, 26);
		frame.getContentPane().add(slider);
		
		JLabel lblNewLabel_3 = new JLabel("\uC601\uD654 \uC81C\uBAA9 : ");
		lblNewLabel_3.setBounds(12, 169, 64, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(77, 166, 302, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContents = new JLabel("CONTENTS");
		lblContents.setHorizontalAlignment(SwingConstants.LEFT);
		lblContents.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblContents.setBounds(12, 246, 107, 31);
		frame.getContentPane().add(lblContents);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 287, 379, 275);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btn_cancle = new JButton("\uCDE8\uC18C");
		btn_cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_cancle.setBackground(SystemColor.inactiveCaptionBorder);
		btn_cancle.setBounds(294, 572, 97, 23);
		frame.getContentPane().add(btn_cancle);
		
		JButton btn_save = new JButton("\uC800\uC7A5");
		btn_save.setBackground(SystemColor.inactiveCaptionBorder);
		btn_save.setBounds(187, 572, 97, 23);
		frame.getContentPane().add(btn_save);
		
	}
}
