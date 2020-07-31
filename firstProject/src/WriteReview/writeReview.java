package WriteReview;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Genre_Review_Model.ReviewDAO;
import Genre_Review_Model.ReviewDTO;
import Login_model.MemberDTO;
import Login_view.UserGUI;

public class writeReview {

	private JFrame frame;
	int r = 0;
	private JTextField tf_reviewTitle;
	private JTextField tf_cont;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	String genre;
	JLabel lbl_name;
	private JTextField tf_movieTitle;
	JLabel lbl_date;
	JLabel lbl_pointNumber;

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
	public writeReview(MemberDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.getContentPane().setLayout(null);
		frame.setLocation(500, 400);

		JLabel lbl_reviewNo = new JLabel("");
		lbl_reviewNo.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\1.png"));
		lbl_reviewNo.setForeground(Color.WHITE);
		lbl_reviewNo.setBackground(SystemColor.menuText);
		lbl_reviewNo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_reviewNo.setFont(new Font("굴림", Font.BOLD, 14));
		lbl_reviewNo.setBounds(12, 10, 110, 30);
		frame.getContentPane().add(lbl_reviewNo);

		JLabel lblNewLabel_1 = new JLabel("\uB2C9\uB124\uC784 : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(22, 50, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uC791\uC131 \uC77C\uC790 : ");
		lblNewLabel_2.setBounds(22, 75, 64, 15);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("\uC7A5\uB974 \uC120\uD0DD");
		lblNewLabel_4.setBounds(22, 104, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);

		JRadioButton rdbtn_action = new JRadioButton("\uC561\uC158");
		buttonGroup.add(rdbtn_action);
		rdbtn_action.setBackground(SystemColor.text);
		rdbtn_action.setBounds(87, 100, 57, 23);
		frame.getContentPane().add(rdbtn_action);

		JRadioButton rdbtn_comedy = new JRadioButton("\uCF54\uBBF8\uB514");
		buttonGroup.add(rdbtn_comedy);
		rdbtn_comedy.setBackground(Color.WHITE);
		rdbtn_comedy.setBounds(148, 100, 64, 23);
		frame.getContentPane().add(rdbtn_comedy);

		JRadioButton rdbtn_drama = new JRadioButton("\uB4DC\uB77C\uB9C8");
		buttonGroup.add(rdbtn_drama);
		rdbtn_drama.setBackground(Color.WHITE);
		rdbtn_drama.setBounds(216, 100, 64, 23);
		frame.getContentPane().add(rdbtn_drama);

		JRadioButton rdbtn_romance = new JRadioButton("\uB85C\uB9E8\uC2A4");
		buttonGroup.add(rdbtn_romance);
		rdbtn_romance.setBackground(Color.WHITE);
		rdbtn_romance.setBounds(284, 100, 64, 23);
		frame.getContentPane().add(rdbtn_romance);

		JRadioButton rdbtn_horror_thrill = new JRadioButton("\uACF5\uD3EC/\uC2A4\uB9B4\uB7EC");
		buttonGroup.add(rdbtn_horror_thrill);
		rdbtn_horror_thrill.setBackground(SystemColor.text);
		rdbtn_horror_thrill.setBounds(87, 125, 106, 23);
		frame.getContentPane().add(rdbtn_horror_thrill);

		JRadioButton rdbtn_sf_fantasy = new JRadioButton("SF/\uD310\uD0C0\uC9C0");
		buttonGroup.add(rdbtn_sf_fantasy);
		rdbtn_sf_fantasy.setBackground(Color.WHITE);
		rdbtn_sf_fantasy.setBounds(197, 125, 93, 23);
		frame.getContentPane().add(rdbtn_sf_fantasy);

		JRadioButton rdbtn_animation = new JRadioButton("\uC560\uB2C8\uBA54\uC774\uC158");
		buttonGroup.add(rdbtn_animation);
		rdbtn_animation.setBackground(Color.WHITE);
		rdbtn_animation.setBounds(294, 125, 107, 23);
		frame.getContentPane().add(rdbtn_animation);

		JLabel lbl_point = new JLabel("\uD3C9\uC810 \uC120\uD0DD");
		lbl_point.setBounds(22, 239, 57, 15);
		frame.getContentPane().add(lbl_point);

		lbl_pointNumber = new JLabel("New label");
		lbl_pointNumber.setBounds(332, 239, 57, 23);
		frame.getContentPane().add(lbl_pointNumber);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 420, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				r = slider.getValue();
				lbl_pointNumber.setText(r + "점");
			}
		});
		slider.setForeground(SystemColor.desktop);
		slider.setMinorTickSpacing(1);
		slider.setBackground(SystemColor.text);
		slider.setMaximum(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(87, 239, 233, 26);
		frame.getContentPane().add(slider);

		JLabel lblNewLabel_3 = new JLabel("\uB9AC\uBDF0 \uC81C\uBAA9 : ");
		lblNewLabel_3.setBounds(22, 198, 64, 15);
		frame.getContentPane().add(lblNewLabel_3);

		tf_reviewTitle = new JTextField();
		tf_reviewTitle.setBounds(87, 195, 302, 21);
		frame.getContentPane().add(tf_reviewTitle);
		tf_reviewTitle.setColumns(10);

		JLabel lblContents = new JLabel("CONTENTS");
		lblContents.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\2.png"));
		lblContents.setHorizontalAlignment(SwingConstants.LEFT);
		lblContents.setFont(new Font("굴림", Font.BOLD, 14));
		lblContents.setBounds(12, 282, 107, 31);
		frame.getContentPane().add(lblContents);

		tf_cont = new JTextField();
		tf_cont.setBounds(12, 323, 379, 275);
		frame.getContentPane().add(tf_cont);
		tf_cont.setColumns(10);

		JButton btn_cancle = new JButton("\uCDE8\uC18C");
		btn_cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_cancle.setBackground(SystemColor.inactiveCaptionBorder);
		btn_cancle.setBounds(294, 608, 97, 23);
		frame.getContentPane().add(btn_cancle);

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String time1 = format1.format(time);

		lbl_date = new JLabel("New label");
		lbl_date.setBounds(98, 75, 154, 15);
		frame.getContentPane().add(lbl_date);
		lbl_date.setText(time1);

		JButton btn_save = new JButton("\uC800\uC7A5");
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ReviewDAO dao = new ReviewDAO();
				String action = rdbtn_action.getText();
				String comedy = rdbtn_comedy.getText();
				String drama = rdbtn_drama.getText();
				String romance = rdbtn_romance.getText();
				String horrorthrill = rdbtn_horror_thrill.getText();
				String sffantasy = rdbtn_sf_fantasy.getText();
				String animation = rdbtn_animation.getText();

//					cb_join_

				if (rdbtn_action.isSelected()) {
					genre = "ACTION";
				} else if (rdbtn_comedy.isSelected()) {
					genre = "COMEDY";
				} else if (rdbtn_romance.isSelected()) {
					genre = "ROMANCE";
				} else if (rdbtn_drama.isSelected()) {
					genre = "DRAMA";
				} else if (rdbtn_sf_fantasy.isSelected()) {
					genre = "SFFANTASY";
				} else if (rdbtn_horror_thrill.isSelected()) {
					genre = "HORRORTHRILLER";
				} else if (rdbtn_animation.isSelected()) {
					genre = "ANIMATION";
				}
				int reviewNumber = 0;

				String nickName = lbl_name.getText();
				String movieName = tf_movieTitle.getText();
				int point = slider.getValue();
				String reviewName = tf_reviewTitle.getText();
				String reviewCont = tf_cont.getText();
				String reviewDate = lbl_date.getText();
//				dao.reviewSave(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName, reviewCont,
//						reviewDate));

				
					int cnt = dao.reviewSave(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName, reviewCont, reviewDate));
					if(cnt == 0) {
						JOptionPane.showMessageDialog(null, "저장 실패!");
					}else {
						frame.dispose();
						JOptionPane.showMessageDialog(null, "저장 성공!");
						
					}
				
//				
//				JOptionPane.showMessageDialog(null, "리뷰가 저장되었습니다");
//				frame.dispose();

			}

		});
		btn_save.setBackground(SystemColor.inactiveCaptionBorder);
		btn_save.setBounds(187, 608, 97, 23);
		frame.getContentPane().add(btn_save);

		lbl_name = new JLabel("New label");
		lbl_name.setBounds(75, 50, 154, 15);
		frame.getContentPane().add(lbl_name);
		lbl_name.setText(dto.getNickName());

		JLabel label = new JLabel("\uC601\uD654 \uC81C\uBAA9 : ");
		label.setBounds(22, 167, 64, 15);
		frame.getContentPane().add(label);

		tf_movieTitle = new JTextField();
		tf_movieTitle.setColumns(10);
		tf_movieTitle.setBounds(87, 164, 302, 21);
		frame.getContentPane().add(tf_movieTitle);

	}
}
