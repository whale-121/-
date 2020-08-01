package Controller;

import java.util.ArrayList;

import Fav_model.favDTO;
import Genre_Review_Model.ReviewDTO;
import Login_model.MemberDAO;
import Login_model.MemberDTO;

public class TableModelChange_RV {
	
	ArrayList<ReviewDTO> reviewList;
	ArrayList<favDTO> favList;
	
	public TableModelChange_RV(ArrayList<ReviewDTO> reviewList) {
		
		this.reviewList = reviewList;
		
	}



	public Object[][] listTypeChange_RV(){
		
		MemberDAO dao = new MemberDAO();
		
		Object[][] data = new Object[reviewList.size()][9];
		for(int i = 0; i<data.length; i++) {
			data[i][0] = reviewList.get(i).getReviewNumber();
			data[i][1] = reviewList.get(i).getNickName();
			data[i][2] = dao.titleSelect(i+1);
			data[i][3] = reviewList.get(i).getGenre();
			data[i][4] = reviewList.get(i).getMovieName();
			data[i][5] = reviewList.get(i).getPoint();
			data[i][6] = reviewList.get(i).getReviewName();
			data[i][7] = reviewList.get(i).getReviewCont();
			data[i][8] = reviewList.get(i).getReviewDate();
		}
		
		return data;
	}
}

