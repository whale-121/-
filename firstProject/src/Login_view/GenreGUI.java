package Login_view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Genre_Review.Show_Reivew;
import Login_model.MemberDTO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class GenreGUI {
	JButton btn_action;
	JButton btn_comedy;
	JButton btn_drama;
	JButton btn_romance;
	JButton btn_hrror;
	JButton btn_SF;
	JButton btn_ani;
	public static String genre;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GenreGUI window = new GenreGUI();
////					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public GenreGUI(MemberDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 598, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn_action = new JButton("\uC561\uC158");
		btn_action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("ACTION",dto);
				genre = "ACTION";
//				Action_Review AR = new Action_Review();
				
			}
		});
		btn_action.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_action.setBackground(SystemColor.inactiveCaptionBorder);
		btn_action.setBounds(36, 72, 97, 78);
		frame.getContentPane().add(btn_action);
		
		btn_comedy = new JButton("\uCF54\uBBF8\uB514");
		btn_comedy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("COMEDY",dto);
				genre = "COMEDY";
//				AR.setGenre("comedy");
			}
		});
		btn_comedy.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_comedy.setBackground(SystemColor.inactiveCaptionBorder);
		btn_comedy.setBounds(169, 72, 97, 78);
		frame.getContentPane().add(btn_comedy);
		
		btn_drama = new JButton("\uB4DC\uB77C\uB9C8");
		btn_drama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("DRAMA",dto);
				genre = "DRAMA";
			}
		});
		btn_drama.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_drama.setBackground(SystemColor.inactiveCaptionBorder);
		btn_drama.setBounds(302, 72, 97, 78);
		frame.getContentPane().add(btn_drama);
		
		btn_romance = new JButton("\uB85C\uB9E8\uC2A4");
		btn_romance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("ROMANCE",dto);
				genre = "ROMANCE";
			}
		});
		btn_romance.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_romance.setBackground(SystemColor.inactiveCaptionBorder);
		btn_romance.setBounds(169, 194, 97, 78);
		frame.getContentPane().add(btn_romance);
		
		btn_hrror = new JButton("\uACF5\uD3EC/\uC2A4\uB9B4\uB7EC");
		btn_hrror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("HORRORTHRILLER",dto);
				genre = "HORRORTHRILLER";
			}
		});
		btn_hrror.setBackground(SystemColor.inactiveCaptionBorder);
		btn_hrror.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_hrror.setBounds(432, 73, 97, 78);
		frame.getContentPane().add(btn_hrror);
		
		btn_SF = new JButton("SF/\uD310\uD0C0\uC9C0");
		btn_SF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("SFFANTASY",dto);
				genre = "SFFANTASY";
			}
		});
		btn_SF.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_SF.setBackground(SystemColor.inactiveCaptionBorder);
		btn_SF.setBounds(302, 194, 97, 78);
		frame.getContentPane().add(btn_SF);
		
		btn_ani = new JButton("\uC560\uB2C8\uBA54\uC774\uC158");
		btn_ani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("ANIMATION",dto);
				genre = "ANIMATION";
			}
		});
		btn_ani.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		btn_ani.setBackground(SystemColor.inactiveCaptionBorder);
		btn_ani.setBounds(36, 194, 97, 78);
		frame.getContentPane().add(btn_ani);
		
		JButton btn_close = new JButton("\uB2EB\uAE30");
		btn_close.setForeground(SystemColor.window);
		btn_close.setBackground(SystemColor.activeCaption);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		btn_close.setBounds(436, 194, 93, 78);
		frame.getContentPane().add(btn_close);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uC7A5\uB974 \uC120\uD0DD");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 22, 493, 28);
		frame.getContentPane().add(lblNewLabel);
	}

}
