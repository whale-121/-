package MyPage;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class FavoriteList {

	private JFrame frame;
	private JTable table;
	private JTextField tfId;
	private JTextField tfNickname;
	private JTextField tfCount;

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
	public FavoriteList() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("즐겨찾기 목록");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 619, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(500,400);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 49, 579, 298);
		frame.getContentPane().add(scrollPane);
		
		String[] colName = {"ID", "NICKNAME", "REVIEWS"};
		DefaultTableModel model = new DefaultTableModel(colName,0);
		table = new JTable(model);
		table.setBackground(SystemColor.text);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(12, 357, 584, 33);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("ID");
		panel.add(label);
		
		tfId = new JTextField(10);
		panel.add(tfId);
		
		JLabel label_1 = new JLabel("NICKNAME");
		panel.add(label_1);
		
		tfNickname = new JTextField(10);
		panel.add(tfNickname);
		
		JLabel label_2 = new JLabel("REVIEWS");
		panel.add(label_2);
		
		tfCount = new JTextField(5);
		panel.add(tfCount);
		
		JButton btAdd = new JButton("Add");
		btAdd.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(btAdd);
		
		JButton btDel = new JButton("Del");
		btDel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(btDel);
		
		AddAction adaction = new AddAction(table, tfId, tfNickname, tfCount);
		RemoveAction rmaction = new RemoveAction(table);
		
		JButton btn_back = new JButton("\uB2EB\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				mypage mp = new mypage();
			}
		});
		btn_back.setBackground(SystemColor.inactiveCaptionBorder);
		btn_back.setBounds(494, 10, 97, 29);
		frame.getContentPane().add(btn_back);
		
		btAdd.addActionListener( new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {

                adaction.actionPerformed(e);            
            }
            
        });
        
        btDel.addActionListener( new ActionListener(){
        	
        	public void actionPerformed(ActionEvent e) {
        		
        		rmaction.actionPerformed(e);            
        	}
        	
        });
	}

}
