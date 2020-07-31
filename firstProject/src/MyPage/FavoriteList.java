package MyPage;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controller.TableModelChange_FA;
import Fav_model.favDAO;
import Fav_model.favDTO;
import Login_model.MemberDTO;

public class FavoriteList {

	private JFrame frame;
	private JTable table;
	public static String nickname;
	

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
		frame = new JFrame("즐겨찾기 목록");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 619, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(500, 400);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 49, 579, 298);
		frame.getContentPane().add(scrollPane);

		String[] colName = { "TITLE", "NICKNAME", "REVIEWS" };
		favDAO dao = new favDAO();
		TableModelChange_FA modelCh = new TableModelChange_FA(dao.select_nn(dto.getId()));
		Object[][] data = modelCh.FavList();
		DefaultTableModel myModel = new DefaultTableModel(data, colName) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(myModel);

		table.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				
				// e.getButton()==1
				if (e.getClickCount() == 2) {
					// 더블클릭이 되어야 하는 부분 
						int index = table.getSelectedRow();
						TableModel model = table.getModel();
						String f = (String) model.getValueAt(index, 1);
						FavReview mrl = new FavReview(f, dto);
						frame.dispose();
				} else if (e.getButton() == 3) {
					int result = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", 0);
					if (result == 0) {
						favDAO fav = new favDAO();
						int row = table.getSelectedRow();
						
						nickname = (String) table.getValueAt(row, 1);

						dao.favListDel(nickname);
						JOptionPane.showMessageDialog(null, "즐겨찾기 삭제 성공");
						jTableRefresh();

					}

				}
			}
		});
		table.setBackground(SystemColor.text);
		scrollPane.setViewportView(table);
//		RemoveAction rmaction = new RemoveAction(table);

		JButton btn_back = new JButton("\uB2EB\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();

			}
		});
		btn_back.setBackground(SystemColor.inactiveCaptionBorder);
		btn_back.setBounds(494, 10, 97, 29);
		frame.getContentPane().add(btn_back);

//        btn_Del.addActionListener( new ActionListener(){
//        	public void actionPerformed(ActionEvent e) {
//        		rmaction.actionPerformed(e);            
//        	}
	}

	public void jTableRefresh() {
		favDAO dao = new favDAO();
		String[] colName = { "TITLE", "NICKNAME", "REVIEWS" };
		TableModelChange_FA modelCh = new TableModelChange_FA(dao.select());
		Object[][] data = modelCh.FavList();
		DefaultTableModel model = new DefaultTableModel(data, colName) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
	}

}
