package WriteReview;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import title.titleDAO;
import title.titleDTO;

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
	static MemberDTO dto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					writeReview window = new writeReview(dto);
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
	public writeReview(MemberDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		frame = new JFrame("ReviewTube - ���� �ۼ�");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 800, 545);
		frame.setLocation(750, 200);

		JLabel lbl_reviewNo = new JLabel("");
		lbl_reviewNo.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\1.png"));
		lbl_reviewNo.setForeground(Color.WHITE);
		lbl_reviewNo.setBackground(SystemColor.menuText);
		lbl_reviewNo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_reviewNo.setFont(new Font("����", Font.BOLD, 14));
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				r = slider.getValue();
				lbl_pointNumber.setText(r + "��");
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
		lblContents.setFont(new Font("����", Font.BOLD, 14));
		lblContents.setBounds(399, 10, 107, 31);
		frame.getContentPane().add(lblContents);

		tf_cont = new JTextField();
		tf_cont.setBounds(399, 50, 373, 433);
		frame.getContentPane().add(tf_cont);
		tf_cont.setColumns(10);

		JButton btn_cancle = new JButton("\uCDE8\uC18C");
		btn_cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserGUI ug = new UserGUI(dto);
			}
		});
		btn_cancle.setBackground(SystemColor.inactiveCaptionBorder);
		btn_cancle.setBounds(148, 460, 97, 23);
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

				ReviewDAO dao1 = new ReviewDAO();
				String action = rdbtn_action.getText();
				String comedy = rdbtn_comedy.getText();
				String drama = rdbtn_drama.getText();
				String romance = rdbtn_romance.getText();
				String horrorthrill = rdbtn_horror_thrill.getText();
				String sffantasy = rdbtn_sf_fantasy.getText();
				String animation = rdbtn_animation.getText();

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

				int cnt = dao1.reviewSave(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName,
						reviewCont, reviewDate));
				if (cnt == 0) {
					JOptionPane.showMessageDialog(null, "���� ����!");
				} else {
					frame.setLocation(-800,0);
					JOptionPane.showMessageDialog(null, "���� ����!");
					
				}
				titleDAO dao = new titleDAO();
				ArrayList<titleDTO> titleList = new ArrayList<titleDTO>();
				
//				int cnt = dao.duplicateTitle(tdto.getTitle(), dto);
//				if (cnt=0) {
//					titleList.add(tdto);
//			
//				}
				
				
				if(dao.countReview(dto.getId()) >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 10�� ", "���� 10���� ��ȭ�� �ٶ� �� �����", dto.getId());
					titleList.add(tdto);
				}if (10< dao.countReview(dto.getId()) && dao.countReview(dto.getId())>= 30) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 30�� ", "���� �׸� ���� 30����", dto.getId());
					titleList.add(tdto);
				}if (30 < dao.countReview(dto.getId()) && dao.countReview(dto.getId()) >= 50) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 50�� ", "���� 50�� ����", dto.getId());
					titleList.add(tdto);
				}if (50< dao.countReview(dto.getId()) && dao.countReview(dto.getId())>= 100) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 100�� ", "�� ���� 100�� �� ����̾�", dto.getId());
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("ACTION", dto.getId()) >= 10){
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 10��", "ACTION BRONZE", dto.getId());
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 30){
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 20��", "ACTION SILVER", dto.getId());
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 40) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 30��", "ACTION GOLD", dto.getId());
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 50) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 40��", "ACTION PLATINUM", dto.getId());
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 100) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 50��", "ACTION DIAMOND", dto.getId());
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ACTION", dto.getId())) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 100��", "ACTION LEGEND", dto.getId());
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("DRAMA", dto.getId()) >= 10){
					titleDTO tdto = new titleDTO("���", "�� �帣 10��", "DRAMA BRONZE", dto.getId());
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 30){
					titleDTO tdto = new titleDTO("���", "�� �帣 20��", "DRAMA SILVER", dto.getId());
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 40) {
					titleDTO tdto = new titleDTO("���", "�� �帣 30��", "DRAMA GOLD", dto.getId());
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 50) {
					titleDTO tdto = new titleDTO("���", "�� �帣 40��", "DRAMA PLATINUM", dto.getId());
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 100) {
					titleDTO tdto = new titleDTO("���", "�� �帣 50��", "DRAMA DIAMOND", dto.getId());
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("DRAMA", dto.getId())) {
					titleDTO tdto = new titleDTO("���", "�� �帣 100��", "DRAMA LEGEND", dto.getId());
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("ROMANCE", dto.getId()) >= 10){
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 10��", "ROMANCE BRONZE", dto.getId());
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 30){
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 20��", "ROMANCE SILVER", dto.getId());
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 40) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 30��", "ROMANCE GOLD", dto.getId());
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 50) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 40��", "ROMANCE PLATINUM", dto.getId());
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 100) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 50��", "ROMANCE DIAMOND", dto.getId());
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ROMANCE", dto.getId())) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 100��", "ROMANCE LEGEND", dto.getId());
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("COMEDY", dto.getId()) >= 10){
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 10��", "COMEDY BRONZE", dto.getId());
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 30){
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 20��", "COMEDY SILVER", dto.getId());
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 40) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 30��", "COMEDY GOLD", dto.getId());
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 50) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 40��", "COMEDY PLATINUM", dto.getId());
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 100) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 50��", "COMEDY DIAMOND", dto.getId());
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("COMEDY", dto.getId())) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 100��", "COMEDY LEGEND", dto.getId());
					titleList.add(tdto);
				}
				if(dao.countReview_Genre("ANIMATION", dto.getId()) >= 10){
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 10��", "ANIMATION BRONZE", dto.getId());
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 30){
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 20��", "ANIMATION SILVER", dto.getId());
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 40) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 30��", "ANIMATION GOLD", dto.getId());
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 50) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 40��", "ANIMATION PLATINUM", dto.getId());
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 100) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 50��", "ANIMATION DIAMOND", dto.getId());
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ANIMATION", dto.getId())) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 100��", "ANIMATION LEGEND", dto.getId());
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("SFFANTASY", dto.getId()) >= 10){
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 10��", "SFFANTASY BRONZE", dto.getId());
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 30){
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 20��", "SFFANTASY SILVER", dto.getId());
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 40) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 30��", "SFFANTASY GOLD", dto.getId());
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 50) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 40��", "SFFANTASY PLATINUM", dto.getId());
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 100) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 50��", "SFFANTASY DIAMOND", dto.getId());
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("SFFANTASY", dto.getId())) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 100��", "SFFANTASY LEGEND", dto.getId());
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("HORRORTHRILLER", dto.getId()) >= 10){
					titleDTO tdto = new titleDTO("����/������", "�� �帣 10��", "HORRORTHRILLER BRONZE", dto.getId());
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 30){
					titleDTO tdto = new titleDTO("����/������", "�� �帣 20��", "HORRORTHRILLER SILVER", dto.getId());
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 40) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 30��", "HORRORTHRILLER GOLD", dto.getId());
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 50) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 40��", "HORRORTHRILLER PLATINUM", dto.getId());
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 100) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 50��", "HORRORTHRILLER DIAMOND", dto.getId());
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId())) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 100��", "HORRORTHRILLER LEGEND", dto.getId());
					titleList.add(tdto);
				}

				if(dao.countReview_Point(5, dto.getId()) >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 5�� 10�� �̻�", "5�� Assemble", dto.getId());
					titleList.add(tdto);
				}if(dao.countReview_Point(4, dto.getId()) >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 4�� 10�� �̻�", "4�� ���� ����� ��", dto.getId());
					titleList.add(tdto);
				}if(dao.countReview_Point(3, dto.getId()) >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 3�� 10�� �̻�", "3�� ���̰� ����", dto.getId());
					titleList.add(tdto);
				}if(dao.countReview_Point(2, dto.getId()) >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 2�� 10�� �̻�", "2�� �ʹ��� �� �ƴϳİ�", dto.getId());
					titleList.add(tdto);
				}if(dao.countReview_Point(1, dto.getId()) >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 1�� 10�� �̻�", "1���� �����ΰ� �����ΰ�", dto.getId());
					titleList.add(tdto);
				}
				titleDAO dao11 = new titleDAO();
				ArrayList<titleDTO> test = new ArrayList<titleDTO>();
				ArrayList<String> titleList1 = dao11.duplicateTitle(dto);
				
				for (int i = 0; i < titleList.size(); i++) {
					
					for (int j = 0; j < titleList1.size(); j++) {
						
						if(titleList.get(i).getTitle().equals(titleList1.get(j))) {
							
							System.out.println("�ߺ�");
						}else if (titleList.get(i).getTitle().equals(titleList1.get(j)) == false){
							
							System.out.println("�ߺ�����");
							test.add(titleList.get(i));
//							dao11.newTitle(titleList.get(i));
						}
					}
				}
//				System.out.println("������������" + titleList.size());
//				System.out.println("���� ���� Ÿ��Ʋ ���� " +titleList1.size());
//				System.out.println("�ߺ����� Ÿ��Ʋ"+test.size());
				for (int i = 0; i <test.size(); i++) {
					dao11.newTitle(test.get(i));
				}
			}
		}
				
				
				

//				
//				JOptionPane.showMessageDialog(null, "���䰡 ����Ǿ����ϴ�");
//				frame.dispose();

			

		);
		btn_save.setBackground(SystemColor.inactiveCaptionBorder);
		btn_save.setBounds(22, 460, 97, 23);
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
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 784, 506);
		frame.getContentPane().add(background);

	}
}
