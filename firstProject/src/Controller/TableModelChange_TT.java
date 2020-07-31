package Controller;

import java.util.ArrayList;

import title.titleDTO;

public class TableModelChange_TT {

	ArrayList<titleDTO> titleList;

	public TableModelChange_TT(ArrayList<titleDTO> titleList) {
		this.titleList = titleList;
	}

	public Object[][] titleList() {
		Object[][] data = new Object[titleList.size()][3];
		for (int i = 0; i < data.length; i++) {
			data[i][0] = titleList.get(i).getGenre();
			data[i][1] = titleList.get(i).getMem_id();
			data[i][2] = titleList.get(i).getTitle();
		}
		return data;
	}

}
