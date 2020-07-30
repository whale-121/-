package MyPage;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import Controller.TableModelChange_FA;
import Controller.TableModelChange_RV;
import Fav_model.favDAO;
import Login_model.MemberDTO;

public class FavoriteList {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FavoriteList window = new FavoriteList();
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
	public FavoriteList(MemberDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MemberDTO dto) {
		System.out.println(dto.getNickName()+"asdflkjasfdkl");
		frame = new JFrame("���ã�� ���");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 619, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(500,400);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 49, 579, 298);
		frame.getContentPane().add(scrollPane);
		
		String[] colName = {"TITLE", "NICKNAME", "REVIEWS"};
		favDAO dao = new favDAO();
		TableModelChange_FA modelCh = new TableModelChange_FA (dao.select());
		Object[][] data = modelCh.FavList();
		table = new JTable(data, colName);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = table.getSelectedRow();
				TableModel model = table.getModel();
				String f = (String) model.getValueAt(index, 1);
				
				FavReview mrl = new FavReview(f, dto);
				frame.dispose();
			}
		});
		table.setBackground(SystemColor.text);
		scrollPane.setViewportView(table);
//		RemoveAction rmaction = new RemoveAction(table);
		
		JButton btn_back = new JButton("\uB2EB\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				mypage mp = new mypage(dto);
			}
		});
		btn_back.setBackground(SystemColor.inactiveCaptionBorder);
		btn_back.setBounds(494, 10, 97, 29);
		frame.getContentPane().add(btn_back);
		
		JButton btn_Del = new JButton("\uC0AD\uC81C");
		btn_Del.setBounds(528, 357, 63, 33);
		frame.getContentPane().add(btn_Del);
		btn_Del.setBackground(SystemColor.inactiveCaptionBorder);
		
		JButton btn_look = new JButton("\uB9AC\uBDF0 \uBCF4\uAE30");
		btn_look.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_look.setBackground(SystemColor.inactiveCaptionBorder);
		btn_look.setBounds(418, 357, 97, 33);
		frame.getContentPane().add(btn_look);
        
//        btn_Del.addActionListener( new ActionListener(){
//        	public void actionPerformed(ActionEvent e) {
//        		rmaction.actionPerformed(e);            
//        	}
        	
	}
}
