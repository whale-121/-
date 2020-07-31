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
import javax.swing.ImageIcon;
import java.awt.Color;


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
	private JLabel lblNewLabel_1;

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
		frame = new JFrame("ReviewTube - 장르 선택");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 598, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(750,200);
		
		btn_action = new JButton("ACTION");
		btn_action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("ACTION",dto);
				genre = "ACTION";
//				Action_Review AR = new Action_Review();
				
			}
		});
		btn_action.setFont(new Font("HY헤드라인M", Font.PLAIN, 11));
		btn_action.setBackground(Color.WHITE);
		btn_action.setBounds(36, 105, 97, 78);
		frame.getContentPane().add(btn_action);
		
		btn_comedy = new JButton("COMEDY");
		btn_comedy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("COMEDY",dto);
				genre = "COMEDY";
//				AR.setGenre("comedy");
			}
		});
		btn_comedy.setFont(new Font("HY헤드라인M", Font.PLAIN, 11));
		btn_comedy.setBackground(Color.WHITE);
		btn_comedy.setBounds(169, 105, 97, 78);
		frame.getContentPane().add(btn_comedy);
		
		btn_drama = new JButton("DRAMA");
		btn_drama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("DRAMA",dto);
				genre = "DRAMA";
			}
		});
		btn_drama.setFont(new Font("HY헤드라인M", Font.PLAIN, 11));
		btn_drama.setBackground(Color.WHITE);
		btn_drama.setBounds(302, 105, 97, 78);
		frame.getContentPane().add(btn_drama);
		
		btn_romance = new JButton("ROMANCE");
		btn_romance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("ROMANCE",dto);
				genre = "ROMANCE";
			}
		});
		btn_romance.setFont(new Font("HY헤드라인M", Font.PLAIN, 11));
		btn_romance.setBackground(Color.WHITE);
		btn_romance.setBounds(169, 194, 97, 78);
		frame.getContentPane().add(btn_romance);
		
		btn_hrror = new JButton();
		btn_hrror.setText("<html><body>HORROR<br>THRILLER</body></html>");
//		myLabel.setText("<html><body>with<br>linebreak</body></html>");
		btn_hrror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("HORRORTHRILLER",dto);
				genre = "HORRORTHRILLER";
			}
		});
		btn_hrror.setBackground(Color.WHITE);
		btn_hrror.setFont(new Font("HY헤드라인M", Font.PLAIN, 11));
		btn_hrror.setBounds(432, 106, 97, 78);
		frame.getContentPane().add(btn_hrror);
		
		btn_SF = new JButton();
		btn_SF.setText("<html><body>\u3000  SF<br>FANTASY</body></html>");
		btn_SF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("SFFANTASY",dto);
				genre = "SFFANTASY";
			}
		});
		btn_SF.setFont(new Font("HY헤드라인M", Font.PLAIN, 11));
		btn_SF.setBackground(Color.WHITE);
		btn_SF.setBounds(302, 194, 97, 78);
		frame.getContentPane().add(btn_SF);
		
		btn_ani = new JButton("ANIMATION");
		btn_ani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show_Reivew AR = new Show_Reivew("ANIMATION",dto);
				genre = "ANIMATION";
			}
		});
		btn_ani.setFont(new Font("HY헤드라인M", Font.PLAIN, 11));
		btn_ani.setBackground(Color.WHITE);
		btn_ani.setBounds(36, 194, 97, 78);
		frame.getContentPane().add(btn_ani);
		
		JButton btn_close = new JButton("CLOSE");
		btn_close.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btn_close.setForeground(new Color(255, 0, 0));
		btn_close.setBackground(Color.WHITE);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserGUI ug = new UserGUI(dto);
				
			}
		});
		btn_close.setBounds(432, 194, 97, 78);
		frame.getContentPane().add(btn_close);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (5).png"));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 10, 490, 70);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		lblNewLabel_1.setBounds(0, 0, 582, 294);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
