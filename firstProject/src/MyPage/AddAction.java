package MyPage;

import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddAction  {
	
	JTable table;
	JTextField tfName;
	JTextField tfAge;
	JTextField tfSex;
	
	public AddAction (JTable table, JTextField tfName, JTextField tfAge, JTextField tfSex) {
		this.table = table;
		this.tfName = tfName;
		this.tfAge = tfAge;
		this.tfSex = tfSex;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String[] str = new String[3];
		str[0] = tfName.getText();
		str[1] = tfAge.getText();
		str[2] = tfSex.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(str);
	}
	
	
}
