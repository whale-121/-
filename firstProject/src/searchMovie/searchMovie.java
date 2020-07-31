package searchMovie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;

import Login_model.MemberDTO;
import Login_view.UserGUI;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class searchMovie {
	

	private JFrame frame;
	MemberDTO dto;
	private JTextField tf_search;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					serarchMovie window = new serarchMovie();
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
	public searchMovie() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public static void openBrower(String url)  {
		java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
		
		if( !desktop.isSupported( java.awt.Desktop.Action.BROWSE ) ) {
			System.err.println( "Desktop doesn't support web browser action" );
		}
		try {
			java.net.URI uri = new java.net.URI( url );
			desktop.browse( uri );
		}       
		catch (IOException _e) {
			System.err.println( _e.getMessage() );
		}
		catch (URISyntaxException _e) {
			System.err.println( _e.getMessage() );
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 385, 545);
		frame.setLocation(750,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_back = new JButton("\uC774\uC804\uC73C\uB85C");
		btn_back.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btn_back.setBackground(Color.WHITE);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setLocation(-800,0);
				UserGUI ug = new UserGUI(dto);
			}
		});
		btn_back.setBounds(12, 10, 96, 23);
		frame.getContentPane().add(btn_back);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (11).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 14));
		lblNewLabel.setBounds(12, 148, 350, 65);
		frame.getContentPane().add(lblNewLabel);
		
		tf_search = new JTextField();
		tf_search.setBounds(57, 223, 272, 30);
		frame.getContentPane().add(tf_search);
		tf_search.setColumns(10);
		
		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭 성공");
				openBrower("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query="+tf_search.getText());
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setBounds(157, 263, 66, 30);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		lblNewLabel_1.setBounds(0, 0, 369, 506);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
