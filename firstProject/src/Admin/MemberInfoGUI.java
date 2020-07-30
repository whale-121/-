package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import Controller.TableModelChange;
import Login_model.MemberDAO;
import MyPage.RemoveAction;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberInfoGUI {

	private JFrame frame;
	private JTable table;
	public static String id;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MemberInfoGUI window = new MemberInfoGUI();
////					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});\
//	}

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
		scrollPane.setBounds(12, 62, 737, 477);
		frame.getContentPane().add(scrollPane);
		
		String[] colName = { "ID", "PW", "�г���", "�̸�", "����", "����","�����ϴ� �帣","Ÿ��Ʋ" };
//		String[] colName = {"�Խù�ȣ", "Ÿ��Ʋ", "�г���", "�帣", "��ȭ����", "����", "����", "���� ����", "��¥"};
		
		MemberDAO dao = new MemberDAO();
		TableModelChange modelCh = new TableModelChange(dao.memberInfoSelect());
		Object[][] data = modelCh.listTypeChange();
		

		table = new JTable(data, colName);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminGUI ag = new AdminGUI();
			}
		});
		btnNewButton.setBounds(652, 549, 97, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btn_memberDel = new JButton("\uD68C\uC6D0\uC0AD\uC81C");
		btn_memberDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int result = 0;
	            result = JOptionPane.showConfirmDialog(null, "ȸ���� �����ϰڽ��ϱ�?", "ȸ������",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
	            if (result == 0) {
	               MemberDAO dao = new MemberDAO();
	               int b = table.getSelectedRow();
	               id = (String) table.getValueAt(b, 0);
	               dao.admin_MemberDel(id);
	               JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�");
	               jTableRefresh();
	            }
				
				
			}
		});
		btn_memberDel.setBounds(12, 549, 97, 37);
		frame.getContentPane().add(btn_memberDel);
	}
	public void jTableRefresh(){
		MemberDAO dao = new MemberDAO();
		String[] colName = { "ID", "PW", "�г���", "�̸�", "����", "����","�����ϴ� �帣","Ÿ��Ʋ" };
		TableModelChange modelCh = new TableModelChange(dao.memberInfoSelect());
		Object[][] data = modelCh.listTypeChange();
		DefaultTableModel model= new DefaultTableModel(data, colName);
		table.setModel(model);
		}
}
