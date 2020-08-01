package Admin;

import title.titleDAO;

public class 中之予元之中予之元予 {
	
	public static void main(String[] args) {
		
		titleDAO dao = new titleDAO();
		System.out.println(dao.countReview("wldnd"));
		System.out.println(dao.countReview_Genre("ACTION", "wldnd"));
	}

}
