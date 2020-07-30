package Controller;

import java.util.ArrayList;

import Genre_Review_Model.ReviewDTO;
import Login_model.MemberDTO;

public class TableModelChange {
	ArrayList<MemberDTO> memberList;
	ArrayList<ReviewDTO> reviewList;
	
	public TableModelChange(ArrayList<MemberDTO> memberList) {
		this.memberList = memberList;
	
	}
	
	public Object[][] listTypeChange(){
		Object[][] data= new Object[memberList.size()][8];
		
		for(int i = 0; i<data.length; i++) {
			data[i][0] = memberList.get(i).getId();
			data[i][1] = memberList.get(i).getPw();
			data[i][2] = memberList.get(i).getNickName();
			data[i][3] = memberList.get(i).getName();
			data[i][4] = memberList.get(i).getAge();
			data[i][5] = memberList.get(i).getSex();
			if(memberList.get(i).getLikeGenre().equals("ACTION")) {
				data[i][6] = "액션";
			}else if(memberList.get(i).getLikeGenre().equals("COMEDY")){
				data[i][6] = "코미디";
			}else if(memberList.get(i).getLikeGenre().equals("DRAMA")){
				data[i][6] = "드라마";
			}else if(memberList.get(i).getLikeGenre().equals("ROMANCE")){
				data[i][6] = "로맨스";
			}else if(memberList.get(i).getLikeGenre().equals("HORRORTHRILLER")){
				data[i][6] = "공포/스릴러";
			}else if(memberList.get(i).getLikeGenre().equals("SFFANTASY")){
				data[i][6] = "SF/판타지";
			}else if(memberList.get(i).getLikeGenre().equals("ANIMATION")){
				data[i][6] = "애니메이션";
			}
//			data[i][6] = memberList.get(i).getLikeGenre();
			data[i][7] = memberList.get(i).getTitle();
		}
		
		return data;
	}
	public Object[][] listTypeChange_RV(){
		Object[][] data= new Object[reviewList.size()][8];
		for(int i = 0; i<data.length; i++) {
			data[i][0] = reviewList.get(i).getReviewNumber();
			data[i][1] = reviewList.get(i).getNickName();
			data[i][2] = reviewList.get(i).getGenre();
			data[i][3] = reviewList.get(i).getMovieName();
			data[i][4] = reviewList.get(i).getPoint();
			data[i][5] = reviewList.get(i).getReviewName();
			data[i][6] = reviewList.get(i).getReviewCont();
			data[i][7] = reviewList.get(i).getReviewDate();
		}
		
		return data;
	}
	

}
