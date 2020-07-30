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

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Action_Review {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Action_Review window = new Action_Review();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Action_Review() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 761, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC561\uC158 \uC601\uD654 \uB9AC\uBDF0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 34, 721, 41);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 85, 721, 443);
		frame.getContentPane().add(scrollPane);
		
		
		

		String[] colName = {"�Խù�ȣ", "Ÿ��Ʋ", "�г���", "�帣", "��ȭ����", "����", "����", "���� ����", "��¥"};
//		ReviewDAO dao = new ReviewDAO();
//		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select());
		Object[][] data= {{"1", "��¼����¼��", "dasfjnsd", "�׼�", "�ݵ�", "4", "������", "������", "2020-07-30"}};
		table = new JTable(data, colName);
		scrollPane.setColumnHeaderView(table);
	}
}
