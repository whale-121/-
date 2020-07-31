package MyPage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.event.AncestorListener;

import Login_model.MemberDTO;

import javax.swing.event.AncestorEvent;

public class MyInfo {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static MemberDTO dto;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MyInfo window = new MyInfo(dto);
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
	public MyInfo(MemberDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		frame = new JFrame("내 정보 보기");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 616, 411);
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
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
			}
		});
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
		
		JLabel label_2 = new JLabel("\uB2C9\uB124\uC784");
		label_2.setBounds(34, 147, 57, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC120\uD638\uD558\uB294 \uC7A5\uB974");
		label_3.setBounds(34, 177, 83, 15);
		frame.getContentPane().add(label_3);
		
		JLabel lbl_name = new JLabel("New label");
		lbl_name.setBounds(79, 57, 57, 15);
		lbl_name.setText(dto.getName());
		
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_age = new JLabel("New label");
		lbl_age.setBounds(79, 87, 57, 15);
		lbl_age.setText(""+dto.getAge());
		
		frame.getContentPane().add(lbl_age);
		
		JLabel lbl_sex = new JLabel("New label");
		lbl_sex.setBounds(79, 117, 57, 15);
		frame.getContentPane().add(lbl_sex);
		lbl_sex.setText(dto.getSex());
		
		JLabel lbl_nick = new JLabel("New label");
		lbl_nick.setBounds(79, 147, 57, 15);
		frame.getContentPane().add(lbl_nick);
		lbl_nick.setText(dto.getNickName());
		
		JLabel lbl_genre = new JLabel();
		lbl_genre.setBounds(129, 177, 114, 15);
		frame.getContentPane().add(lbl_genre);
		lbl_genre.setText(dto.getLikeGenre());
		
		JRadioButton rdbtnac = new JRadioButton("\uC561\uC158");
		rdbtnac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("액션");
			}
		});
		buttonGroup.add(rdbtnac);
		rdbtnac.setBackground(SystemColor.text);
		rdbtnac.setBounds(34, 204, 57, 23);
		frame.getContentPane().add(rdbtnac);
		
		
		JRadioButton rrdbtnco = new JRadioButton("\uCF54\uBBF8\uB514");
		rrdbtnco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("코미디");
			}
		});
		buttonGroup.add(rrdbtnco);
		rrdbtnco.setBackground(Color.WHITE);
		rrdbtnco.setBounds(34, 235, 83, 23);
		frame.getContentPane().add(rrdbtnco);
		
		JRadioButton rdbtnro = new JRadioButton("\uB85C\uB9E8\uC2A4");
		rdbtnro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("로맨스");
			}
		});
		buttonGroup.add(rdbtnro);
		rdbtnro.setBackground(Color.WHITE);
		rdbtnro.setBounds(34, 269, 69, 23);
		frame.getContentPane().add(rdbtnro);
		
		JRadioButton rdbtnho = new JRadioButton("\uACF5\uD3EC/\uC2A4\uB9B4\uB7EC");
		rdbtnho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("공포/스릴러");
			}
		});
		buttonGroup.add(rdbtnho);
		rdbtnho.setBackground(Color.WHITE);
		rdbtnho.setBounds(129, 269, 97, 23);
		frame.getContentPane().add(rdbtnho);
		
		JRadioButton rdbtnSf = new JRadioButton("SF/\uD310\uD0C0\uC9C0");
		rdbtnSf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("SF/판타지");
			}
		});
		buttonGroup.add(rdbtnSf);
		rdbtnSf.setBackground(Color.WHITE);
		rdbtnSf.setBounds(129, 205, 83, 23);
		frame.getContentPane().add(rdbtnSf);
		
		JRadioButton rdbtnan = new JRadioButton("\uC560\uB2C8\uBA54\uC774\uC158");
		rdbtnan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("애니메이션");
			}
		});
		buttonGroup.add(rdbtnan);
		rdbtnan.setBackground(Color.WHITE);
		rdbtnan.setBounds(129, 239, 97, 23);
		frame.getContentPane().add(rdbtnan);
		
		JRadioButton rdbtndr = new JRadioButton("\uB4DC\uB77C\uB9C8");
		rdbtndr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("드라마");
			}
		});
		buttonGroup.add(rdbtndr);
		rdbtndr.setBackground(Color.WHITE);
		rdbtndr.setBounds(34, 301, 69, 23);
		frame.getContentPane().add(rdbtndr);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(277, 102, 297, 210);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
