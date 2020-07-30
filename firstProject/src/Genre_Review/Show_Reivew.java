package Genre_Review;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import Controller.TableModelChange;
import Controller.TableModelChange_RV;
import Genre_Review_Model.ReviewDAO;
import Login_model.MemberDAO;
import Login_view.GenreGUI;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Show_Reivew {

	public static String genre;
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Show_Reivew window = new Show_Reivew(genre);
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
	public Show_Reivew(String a) {
		genre = a;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 884, 694);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uB9AC\uBDF0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 10, 844, 41);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 85, 844, 515);
		frame.getContentPane().add(scrollPane);
		
		
		
		String[] colName = {"�Խù�ȣ", "�г���", "�帣", "��ȭ����", "����", "����", "���� ����", "��¥"};
		ReviewDAO dao = new ReviewDAO();
//		genre = "ACTION";
		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select(genre));
		Object[][] data = modelCh.listTypeChange_RV();
		System.out.println(dao.select(genre).size());
		
		table = new JTable(data, colName);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("New button");
		scrollPane.setColumnHeaderView(btnNewButton);
		
		JButton btn_close = new JButton("\uB2EB\uAE30");
		btn_close.setBackground(SystemColor.inactiveCaptionBorder);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GenreGUI gg = new GenreGUI();
			}
		});
		btn_close.setBounds(653, 610, 203, 35);
		frame.getContentPane().add(btn_close);
		

	}
	public void setGenre(String a) {
		genre = a;
	}
}
