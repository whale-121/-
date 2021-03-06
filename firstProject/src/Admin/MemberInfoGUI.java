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
import Controller.TableModelChange_RV;
import Login_model.MemberDAO;
import MyPage.RemoveAction;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MemberInfoGUI {

	private JFrame frame;
	private JTable table;
	public static String id;
	private JTextField tf_search;
	JComboBox cb_search;
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
		frame = new JFrame("ReviewTube - 회원 관리");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100,800,545);
		frame.setLocation(750,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMT056\\Downloads\\\uBB34\uC81C (9).png"));
		lblNewLabel.setBounds(12, 10, 760, 56);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 122, 760, 322);
		frame.getContentPane().add(scrollPane);
		
		String[] colName = { "ID", "PW", "닉네임", "이름", "나이", "성별","좋아하는 장르","타이틀" };
//		String[] colName = {"게시번호", "타이틀", "닉네임", "장르", "영화제목", "평점", "제목", "리뷰 내용", "날짜"};
		
		MemberDAO dao = new MemberDAO();
		TableModelChange modelCh = new TableModelChange(dao.memberInfoSelect());
		Object[][] data = modelCh.listTypeChange();
		

		table = new JTable(data, colName);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminGUI ag = new AdminGUI();
				frame.setLocation(-800,0);
			}
		});
		btnNewButton.setBounds(675, 454, 97, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btn_memberDel = new JButton("\uD68C\uC6D0\uC0AD\uC81C");
		btn_memberDel.setBackground(Color.WHITE);
		btn_memberDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int result = 0;
	            result = JOptionPane.showConfirmDialog(null, "회원을 삭제하겠습니까?", "회원삭제",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
	            if (result == 0) {
	               MemberDAO dao = new MemberDAO();
	               int b = table.getSelectedRow();
	               id = (String) table.getValueAt(b, 0);
	               dao.admin_MemberDel(id);
	               JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다");
	               jTableRefresh();
	            }
				
				
			}
		});
		btn_memberDel.setBounds(12, 454, 97, 37);
		frame.getContentPane().add(btn_memberDel);
		
		JButton btn_reset = new JButton("\uCD08\uAE30\uD654");
		btn_reset.setBackground(Color.WHITE);
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTableRefresh();
			}
		});
		btn_reset.setBounds(12, 83, 90, 29);
		frame.getContentPane().add(btn_reset);
		
		cb_search = new JComboBox();
		cb_search.setBackground(Color.WHITE);
		cb_search.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4\uAC80\uC0C9", "\uC544\uC774\uB514", "\uB2C9\uB124\uC784", "\uC774\uB984", "\uC131\uBCC4", "\uC88B\uC544\uD558\uB294\uC7A5\uB974"}));
		cb_search.setBounds(114, 83, 117, 29);
		frame.getContentPane().add(cb_search);
		
		tf_search = new JTextField();
		tf_search.setColumns(10);
		tf_search.setBounds(243, 83, 420, 29);
		frame.getContentPane().add(tf_search);
		
		JButton btn_search = new JButton("\uAC80\uC0C9");
		btn_search.setBackground(Color.WHITE);
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTableSearch();
			}
		});
		btn_search.setBounds(675, 83, 97, 29);
		frame.getContentPane().add(btn_search);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\SMT056\\Desktop\\black.png"));
		background.setBounds(0, 0, 784, 506);
		frame.getContentPane().add(background);
	}
	public void jTableRefresh(){
		MemberDAO dao = new MemberDAO();
		String[] colName = { "ID", "PW", "닉네임", "이름", "나이", "성별","좋아하는 장르","타이틀" };
		TableModelChange modelCh = new TableModelChange(dao.memberInfoSelect());
		Object[][] data = modelCh.listTypeChange();
		DefaultTableModel model= new DefaultTableModel(data, colName);
		table.setModel(model);
		}
	public void jTableSearch() {
		MemberDAO dao = new MemberDAO();
		String[] colName = { "ID", "PW", "닉네임", "이름", "나이", "성별","좋아하는 장르","타이틀" };
		TableModelChange modelCh = new TableModelChange(dao.search((String) cb_search.getSelectedItem(), tf_search.getText()));
		Object[][] data = modelCh.listTypeChange();
		DefaultTableModel model= new DefaultTableModel(data, colName);
		table.setModel(model);
	}
}
