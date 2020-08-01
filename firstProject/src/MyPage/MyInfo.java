package MyPage;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controller.TableModelChange_FA;
import Controller.TableModelChange_TT;
import Login_model.MemberDAO;
import Login_model.MemberDTO;
import title.titleDAO;
import title.titleDTO;
import javax.swing.SwingConstants;

public class MyInfo {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static MemberDTO dto;
	private JTable table;
	String genre;
	MemberDTO newDto;
	int cnt;
	

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
		genre = dto.getLikeGenre();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		frame = new JFrame("내 정보 보기");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 616, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 400);
		frame.getContentPane().setLayout(null);


		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setBounds(34, 57, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uB098\uC774");
		lblNewLabel_1.setBounds(34, 87, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("\uC131\uBCC4");
		label.setBounds(34, 117, 57, 15);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\uB0B4 \uD0C0\uC774\uD2C0 : ");
		label_1.setBounds(277, 57, 69, 15);
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
		lbl_age.setText("" + dto.getAge());

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
		String myGenre = null;
		if (dto.getLikeGenre().equals("ACTION")) {
			myGenre = "액션";
		}else if (dto.getLikeGenre().equals("COMEDY")) {
			myGenre = "코미디";
		}else if (dto.getLikeGenre().equals("ROMANCE")) {
			myGenre = "로맨스";
		}else if (dto.getLikeGenre().equals("HORRORTHRILLER")) {
			myGenre = "공포/스릴러";
		}else if (dto.getLikeGenre().equals("SFFANTASY")) {
			myGenre = "SF/판타지";
		}else if (dto.getLikeGenre().equals("ANIMATION")) {
			myGenre = "애니메이션";
		}else if (dto.getLikeGenre().equals("DRAMA")) {
			myGenre = "드라마";
		}
		lbl_genre.setText(myGenre);

		JRadioButton rdbtnac = new JRadioButton("\uC561\uC158");
		rdbtnac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_genre.setText("액션");
				genre = "ACTION";
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
				genre = "COMEDY";
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
				genre = "ROMANCE";
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
				genre = "HORRORTHRILLER";
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
				genre = "SFFANTASY";
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
				genre = "ANIMATION";
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
				genre = "DRAMA";
			}
		});
		
		JLabel lbl_title = new JLabel(dto.getTitle());
		
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setBounds(347, 57, 195, 15);
		frame.getContentPane().add(lbl_title);

		JButton button_1 = new JButton("\uC218\uC815");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				dao.updateGenre(genre, dto);
				
				int b = table.getSelectedRow();
				String title = (String) table.getValueAt(b, 2);
				lbl_title.setText(title);
				dao.updateTitle(title, dto);
				
				cnt = dao.updateGenre(genre, dto) + dao.updateTitle(title, dto);
				
				if (cnt == 0) {
					JOptionPane.showMessageDialog(null, "수정 실패");
				} else {
					JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
					newDto = new MemberDTO(dto.getId(), dto.getPw(), dto.getNickName(), dto.getName(),
							dto.getAge(), dto.getSex(), genre, title);
				}
					
				
			}
		});
		
		JButton button = new JButton("\uB2EB\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt == 0) {
					frame.dispose();
					mypage pg = new mypage(dto);
				}else {
					frame.dispose();
					mypage pg = new mypage(newDto);
					
				}
			}
		});
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setBounds(475, 10, 97, 29);
		frame.getContentPane().add(button);
		
		button_1.setBackground(SystemColor.inactiveCaptionBorder);
		button_1.setBounds(366, 10, 97, 29);
		frame.getContentPane().add(button_1);

		buttonGroup.add(rdbtndr);
		rdbtndr.setBackground(Color.WHITE);
		rdbtndr.setBounds(34, 301, 69, 23);
		frame.getContentPane().add(rdbtndr);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(277, 102, 297, 210);
		frame.getContentPane().add(scrollPane);

		String[] colName = { "장르", "달성 조건", "타이틀" };
		titleDAO dao = new titleDAO();
		TableModelChange_TT modelCh = new TableModelChange_TT(dao.select_id(dto.getId()));
		Object[][] data = modelCh.titleList();
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i][0]);
			System.out.print(data[i][1]);
			System.out.print(data[i][2]);
		}
		table = new JTable(data, colName);
		scrollPane.setViewportView(table);
		
		JLabel label_4 = new JLabel("\uB0B4 \uD0C0\uC774\uD2C0 \uBAA9\uB85D");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(376, 87, 97, 15);
		frame.getContentPane().add(label_4);
		
	}
}
