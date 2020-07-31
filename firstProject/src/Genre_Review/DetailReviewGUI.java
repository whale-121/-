package Genre_Review;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Fav_model.favDAO;
import Genre_Review_Model.ReviewDTO;
import Login_model.MemberDTO;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DetailReviewGUI {

	private JFrame frame;
	ReviewDTO rdto;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DeatilReviewGUI window = new DeatilReviewGUI();
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
	public DetailReviewGUI(ReviewDTO rdto, MemberDTO dto) {
		
		initialize(rdto, dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ReviewDTO rdto, MemberDTO dto) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 856, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB2C9 \uB124 \uC784 :");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 76, 99, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbl_nick = new JLabel("");
		lbl_nick.setBackground(new Color(255, 255, 255));
		lbl_nick.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_nick.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lbl_nick.setBounds(118, 76, 129, 18);
		lbl_nick.setText(dto.getNickName());
		frame.getContentPane().add(lbl_nick);
		
		JLabel label_1 = new JLabel("\uC601\uD654\uC81C\uBAA9 :");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("±º∏≤", Font.BOLD, 15));
		label_1.setBounds(12, 104, 99, 18);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC7A5 \uB974 :");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("±º∏≤", Font.BOLD, 15));
		label_2.setBounds(12, 132, 99, 18);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uAE00 \uC81C \uBAA9 :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("±º∏≤", Font.BOLD, 15));
		label_3.setBounds(350, 76, 99, 18);
		frame.getContentPane().add(label_3);
		
		JLabel lbl_movieTitle = new JLabel("");
		lbl_movieTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_movieTitle.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lbl_movieTitle.setBounds(118, 104, 129, 18);
		lbl_movieTitle.setText(rdto.getMovieName());
		frame.getContentPane().add(lbl_movieTitle);
		
		JLabel lbl_genre = new JLabel("");
		lbl_genre.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_genre.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lbl_genre.setBounds(118, 133, 129, 18);
		lbl_genre.setText(rdto.getGenre());
		frame.getContentPane().add(lbl_genre);
		
		JLabel lbl_reviewName = new JLabel("");
		lbl_reviewName.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_reviewName.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lbl_reviewName.setBounds(453, 76, 129, 18);
		lbl_reviewName.setText(rdto.getReviewName());
		frame.getContentPane().add(lbl_reviewName);
		
		JLabel lblNewLabel_1 = new JLabel("\uB9AC\uBDF0 \uBCF4\uAE30");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 828, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea_review = new JTextArea();
		textArea_review.setBackground(SystemColor.text);
		textArea_review.setBounds(22, 172, 790, 403);
		textArea_review.setText(rdto.getReviewCont());
		frame.getContentPane().add(textArea_review);
		
		JButton btn_close = new JButton("\uB2EB\uAE30");
		btn_close.setBackground(Color.WHITE);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_close.setBounds(679, 594, 148, 32);
		frame.getContentPane().add(btn_close);
		
		JButton btn_addFav = new JButton("\uC774\uC0AC\uB78C\uC744 \uC990\uACA8\uCC3E\uAE30\uC5D0\uCD94\uAC00");
		btn_addFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				favDAO dao = new favDAO();
				dao.favorAdd(Show_Reivew.nickName, dto);
				JOptionPane.showMessageDialog(null, rdto.getNickName() + "¥‘¿Ã ¡Ò∞‹√£±‚ø° √ﬂ∞°µ«æ˙Ω¿¥œ¥Ÿ");
			}
		});
		btn_addFav.setBackground(Color.WHITE);
		btn_addFav.setBounds(12, 594, 200, 32);
		frame.getContentPane().add(btn_addFav);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(12, 60, 816, 527);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(107, 14, 126, 20);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(107, 43, 126, 20);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(107, 71, 126, 20);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(442, 14, 126, 20);
		panel.add(panel_4);
		
		JLabel label = new JLabel("\uD3C9 \uC810 :");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("±º∏≤", Font.BOLD, 15));
		label.setBounds(336, 73, 99, 18);
		panel.add(label);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(442, 71, 126, 20);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lbl_point = new JLabel("");
		lbl_point.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_point.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lbl_point.setBounds(0, 0, 129, 18);
		lbl_point.setText(""+rdto.getPoint());
		panel_5.add(lbl_point);
	}
}
