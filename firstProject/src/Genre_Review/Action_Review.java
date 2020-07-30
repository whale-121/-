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
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 34, 721, 41);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 85, 721, 443);
		frame.getContentPane().add(scrollPane);
		

		String[] colName = {"°Ô½Ã¹øÈ£", "Å¸ÀÌÆ²", "´Ð³×ÀÓ",};
//		ReviewDAO dao = new ReviewDAO();
//		TableModelChange_RV modelCh = new TableModelChange_RV(dao.select());
		Object[][] data= {{"1", "¾îÂ¼°íÀúÂ¼°í", "dasfjnsd", "¾×¼Ç", "¹Ýµµ", "4", "¶ö¶ö¶ó", "¶ö¶ö¶ó", "2020-07-30"}};
//		Object[][] data = modelCh.listTypeChange_RV();
//		Object[][] data = modelCh.listTypeChange_RV(dao.select());
		

		table = new JTable(data, colName);
		scrollPane.setColumnHeaderView(table);
	}
}
