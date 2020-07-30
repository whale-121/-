package Login_view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import Controller.TableModelChange;
import Login_model.MemberDAO;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemberInfoGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInfoGUI window = new MemberInfoGUI();
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
	public MemberInfoGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 777, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		lblNewLabel.setBounds(12, 23, 737, 43);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 83, 737, 477);
		frame.getContentPane().add(scrollPane);
		
		String[] colName = { "ID", "PW", "�г���", "�̸�", "����", "����","�����ϴ� �帣","Ÿ��Ʋ" };
//		String[] colName = {"�Խù�ȣ", "Ÿ��Ʋ", "�г���", "�帣", "��ȭ����", "����", "����", "���� ����", "��¥"};
		
		MemberDAO dao = new MemberDAO();
		TableModelChange modelCh = new TableModelChange(dao.memberInfoSelect());
		Object[][] data = modelCh.listTypeChange();
		

		table = new JTable(data, colName);
		scrollPane.setViewportView(table);
	}
}
