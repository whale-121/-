package MyPage;

import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveAction {
	
	JTable table;
	
	public RemoveAction(JTable table) {
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if (row >= 0) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.removeRow(row);
		}
	}
}
