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
import javax.swing.ImageIcon;

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
		frame = new JFrame("ReviewTube - ªÛºº ∏Æ∫‰");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 385, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(750, 200);

		JLabel lblNewLabel = new JLabel("\uB2C9 \uB124 \uC784 :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 76, 99, 18);
		frame.getContentPane().add(lblNewLabel);

		JLabel label_1 = new JLabel("\uC601\uD654\uC81C\uBAA9 :");
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("±º∏≤", Font.BOLD, 15));
		label_1.setBounds(12, 104, 99, 18);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\uC7A5 \uB974 :");
		label_2.setForeground(Color.WHITE);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("±º∏≤", Font.BOLD, 15));
		label_2.setBounds(12, 132, 99, 18);
		frame.getContentPane().add(label_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (7).png"));
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 349, 40);
		frame.getContentPane().add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 60, 369, 446);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(107, 14, 244, 20);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
				JLabel lbl_nick = new JLabel("");
				lbl_nick.setBounds(12, 0, 244, 18);
				panel_1.add(lbl_nick);
				lbl_nick.setBackground(new Color(255, 255, 255));
				lbl_nick.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_nick.setFont(new Font("±º∏≤", Font.PLAIN, 15));
				lbl_nick.setText(dto.getNickName());

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(107, 43, 244, 20);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
				JLabel lbl_movieTitle = new JLabel("");
				lbl_movieTitle.setBounds(12, 0, 244, 18);
				panel_2.add(lbl_movieTitle);
				lbl_movieTitle.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_movieTitle.setFont(new Font("±º∏≤", Font.PLAIN, 15));
				lbl_movieTitle.setText(rdto.getMovieName());

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(107, 71, 244, 20);
		panel.add(panel_3);
				panel_3.setLayout(null);
		
				JLabel lbl_genre = new JLabel("");
				lbl_genre.setBounds(12, 0, 244, 18);
				panel_3.add(lbl_genre);
				lbl_genre.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_genre.setFont(new Font("±º∏≤", Font.PLAIN, 15));
				lbl_genre.setText(rdto.getGenre());

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(107, 131, 244, 20);
		panel.add(panel_4);
				panel_4.setLayout(null);
		
				JLabel lbl_reviewName = new JLabel("");
				lbl_reviewName.setBounds(12, 0, 219, 18);
				panel_4.add(lbl_reviewName);
				lbl_reviewName.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_reviewName.setFont(new Font("±º∏≤", Font.PLAIN, 15));
				lbl_reviewName.setText(rdto.getReviewName());

		JLabel label = new JLabel("\uD3C9 \uC810 :");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("±º∏≤", Font.BOLD, 15));
		label.setBounds(0, 103, 99, 18);
		panel.add(label);
		
				JButton btn_addFav = new JButton("\uC774\uC0AC\uB78C\uC744 \uC990\uACA8\uCC3E\uAE30\uC5D0\uCD94\uAC00");
				btn_addFav.setBounds(10, 399, 223, 32);
				panel.add(btn_addFav);
				btn_addFav.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						favDAO dao = new favDAO();
						dao.favorAdd(Show_Reivew.nickName, dto);
						JOptionPane.showMessageDialog(null, rdto.getNickName() + "¥‘¿Ã ¡Ò∞‹√£±‚ø° √ﬂ∞°µ«æ˙Ω¿¥œ¥Ÿ");
					}
				});
				btn_addFav.setBackground(Color.WHITE);
				
						JLabel lbl_point = new JLabel("0");
						lbl_point.setBounds(117, 101, 234, 18);
						panel.add(lbl_point);
						lbl_point.setHorizontalAlignment(SwingConstants.LEFT);
						lbl_point.setFont(new Font("±º∏≤", Font.PLAIN, 15));
						lbl_point.setText("" + rdto.getPoint());
						
								JLabel label_3 = new JLabel("\uAE00 \uC81C \uBAA9 :");
								label_3.setBounds(10, 131, 99, 18);
								panel.add(label_3);
								label_3.setForeground(Color.WHITE);
								label_3.setHorizontalAlignment(SwingConstants.CENTER);
								label_3.setFont(new Font("±º∏≤", Font.BOLD, 15));
								
										JTextArea textArea_review = new JTextArea();
										textArea_review.setFont(new Font("±º∏≤", Font.PLAIN, 15));
										textArea_review.setBounds(12, 179, 339, 210);
										panel.add(textArea_review);
										textArea_review.setBackground(SystemColor.text);
										textArea_review.setText(" "+rdto.getReviewCont());
										textArea_review.setLineWrap(true);
										
												JButton btn_close = new JButton("\uB2EB\uAE30");
												btn_close.setBounds(245, 399, 106, 32);
												panel.add(btn_close);
												btn_close.setBackground(Color.WHITE);
												
												JPanel panel_5 = new JPanel();
												panel_5.setLayout(null);
												panel_5.setBackground(Color.WHITE);
												panel_5.setBounds(107, 101, 244, 20);
												panel.add(panel_5);
												btn_close.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														frame.setLocation(-800,0);
													}
												});
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		lblNewLabel_2.setBounds(0, 0, 369, 506);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
