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
		frame.setBounds(100, 100, 490, 167);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_back = new JButton("\uC774\uC804\uC73C\uB85C");
		btn_back.setBackground(SystemColor.inactiveCaptionBorder);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserGUI ug = new UserGUI(dto);
			}
		});
		btn_back.setBounds(12, 10, 96, 23);
		frame.getContentPane().add(btn_back);
		
		JLabel lblNewLabel = new JLabel(">> \uC601\uD654 \uC81C\uBAA9\uC744 \uC785\uB825\uD574 \uC8FC\uC138\uC694 <<");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 14));
		lblNewLabel.setBounds(72, 43, 350, 23);
		frame.getContentPane().add(lblNewLabel);
		
		tf_search = new JTextField();
		tf_search.setBounds(72, 76, 272, 30);
		frame.getContentPane().add(tf_search);
		tf_search.setColumns(10);
		
		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Å¬¸¯ ¼º°ø");
				openBrower("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query="+tf_search.getText());
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setBounds(356, 75, 66, 30);
		frame.getContentPane().add(btnNewButton);
	}
}
