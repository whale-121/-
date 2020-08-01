import java.util.ArrayList;

import Login_model.MemberDAO;
import Login_model.MemberDTO;
import title.titleDAO;
import title.titleDTO;

public class test2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		titleDAO dao = new titleDAO();
		ArrayList<titleDTO> titleList = new ArrayList<titleDTO>();

//		int cnt = dao.duplicateTitle(tdto.getTitle(), dto);
//		if (cnt=0) {
//			titleList.add(tdto);
//	
//		}
		MemberDTO dto = new MemberDTO("wldnd", "pw", "앙팡", "name", 61, "sex", "likeGenre", "title");
		MemberDTO dto1 = new MemberDTO("admin", "pw", "앙팡", "name", 61, "sex", "likeGenre", "title");

		if (dao.countReview(dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("전체장르", "작성리뷰 10개 ", "리뷰 10개로 영화를 바라볼 순 없어요", dto.getId());
			titleList.add(tdto);
		}
		if (10 < dao.countReview(dto.getId()) && dao.countReview(dto.getId()) >= 30) {
			titleDTO tdto = new titleDTO("전체장르", "작성리뷰 30개 ", "동작 그만 리뷰 30개냐", dto.getId());
			titleList.add(tdto);
		}
		if (30 < dao.countReview(dto.getId()) && dao.countReview(dto.getId()) >= 50) {
			titleDTO tdto = new titleDTO("전체장르", "작성리뷰 50개 ", "리뷰 50개 드루와", dto.getId());
			titleList.add(tdto);
		}
		if (50 < dao.countReview(dto.getId()) && dao.countReview(dto.getId()) >= 100) {
			titleDTO tdto = new titleDTO("전체장르", "작성리뷰 100개 ", "나 리뷰 100개 쓴 사람이야", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("ACTION", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("액션", "한 장르 10개", "ACTION BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("액션", "한 장르 20개", "ACTION SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("액션", "한 장르 30개", "ACTION GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("액션", "한 장르 40개", "ACTION PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("액션", "한 장르 50개", "ACTION DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("ACTION", dto.getId())) {
			titleDTO tdto = new titleDTO("액션", "한 장르 100개", "ACTION LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("DRAMA", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("드라마", "한 장르 10개", "DRAMA BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("드라마", "한 장르 20개", "DRAMA SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("드라마", "한 장르 30개", "DRAMA GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("드라마", "한 장르 40개", "DRAMA PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("드라마", "한 장르 50개", "DRAMA DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("DRAMA", dto.getId())) {
			titleDTO tdto = new titleDTO("드라마", "한 장르 100개", "DRAMA LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("ROMANCE", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("로맨스", "한 장르 10개", "ROMANCE BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("로맨스", "한 장르 20개", "ROMANCE SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("로맨스", "한 장르 30개", "ROMANCE GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("로맨스", "한 장르 40개", "ROMANCE PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("로맨스", "한 장르 50개", "ROMANCE DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("ROMANCE", dto.getId())) {
			titleDTO tdto = new titleDTO("로맨스", "한 장르 100개", "ROMANCE LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("COMEDY", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("코미디", "한 장르 10개", "COMEDY BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("코미디", "한 장르 20개", "COMEDY SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("코미디", "한 장르 30개", "COMEDY GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("코미디", "한 장르 40개", "COMEDY PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("코미디", "한 장르 50개", "COMEDY DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("COMEDY", dto.getId())) {
			titleDTO tdto = new titleDTO("코미디", "한 장르 100개", "COMEDY LEGEND", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Genre("ANIMATION", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("애니메이션", "한 장르 10개", "ANIMATION BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("애니메이션", "한 장르 20개", "ANIMATION SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("애니메이션", "한 장르 30개", "ANIMATION GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("애니메이션", "한 장르 40개", "ANIMATION PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("애니메이션", "한 장르 50개", "ANIMATION DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("ANIMATION", dto.getId())) {
			titleDTO tdto = new titleDTO("애니메이션", "한 장르 100개", "ANIMATION LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("SFFANTASY", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("SF/판타지", "한 장르 10개", "SFFANTASY BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("SF/판타지", "한 장르 20개", "SFFANTASY SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("SF/판타지", "한 장르 30개", "SFFANTASY GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("SF/판타지", "한 장르 40개", "SFFANTASY PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("SF/판타지", "한 장르 50개", "SFFANTASY DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("SFFANTASY", dto.getId())) {
			titleDTO tdto = new titleDTO("SF/판타지", "한 장르 100개", "SFFANTASY LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("HORRORTHRILLER", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 10개", "HORRORTHRILLER BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 20개", "HORRORTHRILLER SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 30개", "HORRORTHRILLER GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 40개", "HORRORTHRILLER PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 50개", "HORRORTHRILLER DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId())) {
			titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 100개", "HORRORTHRILLER LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Point(5, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("전체장르", "평점 5점 10개 이상", "5점 Assemble", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(4, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("전체장르", "평점 4점 10개 이상", "4점 묻고 더블로 가", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(3, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("전체장르", "평점 3점 10개 이상", "3점 어이가 없네", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(2, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("전체장르", "평점 2점 10개 이상", "2점 너무한 거 아니냐고", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(1, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("전체장르", "평점 1점 10개 이상", "1점은 평점인가 숫자인가", dto.getId());
			titleList.add(tdto);
		}

		titleDAO dao1 = new titleDAO();
		ArrayList<titleDTO> test = new ArrayList<titleDTO>(); // 빈 배열
		ArrayList<String> myTitle = dao1.duplicateTitle(dto); // 내가 가진 타이틀 리스트

		// titleList = 조건 충족한 타이틀이 담긴 리스트
		for (int i = 0; i < titleList.size(); i++) { 

			for (int j = 0; j < myTitle.size(); j++) { // 뉴비 

				if (titleList.get(i).getTitle().equals(myTitle.get(j))) {

					System.out.println("중복");

				} else if (titleList.get(i).getTitle().equals(myTitle.get(j)) == false) {

					System.out.println("중복없음");
					test.add(titleList.get(i));
				}
			}
		}
		System.out.println("조건충족개수" + titleList.size());
		System.out.println("내가 가진 타이틀 개수 " + myTitle.size());
		System.out.println("중복없는 타이틀" + test.size());
		
		System.out.println(titleList.get(3).getTitle());
		System.out.println(myTitle.get(1));
		for (int i = 0; i < test.size(); i++) {
			dao1.newTitle(test.get(i));
//			dao1.newTitle(titleList.get(i));
		}
	}

}
