
package Controller;

	import java.util.ArrayList;

	import Fav_model.favDTO;

	public class TableModelChange_FA {
		
		ArrayList<favDTO> favList;
		
		public TableModelChange_FA(ArrayList<favDTO> favList) {
			this.favList = favList;
		}

		public Object[][] FavList(){
			Object[][] data = new Object[favList.size()][4];
			for(int i = 0; i<data.length; i++) {
				data[i][0] = favList.get(i).getTitle();
				data[i][1] = favList.get(i).getNickname();
				data[i][2] = favList.get(i).getReviews();
				data[i][3] = favList.get(i).getUser_id();
			}
			return data;
		}
	}

