titleDAO dao = new titleDAO();
				ArrayList<titleDTO> titleList = new ArrayList<titleDTO>();
				if(dao.countReview("wldnd") >= 10) {
					titleDTO tdto = new titleDTO("전체장르", "작성리뷰 10개 ", "리뷰 10개로 영화를 바라볼 순 없어요", "wldnd");
					titleList.add(tdto);
				}if (10< dao.countReview("wldnd") && dao.countReview("wldnd")>= 30) {
					titleDTO tdto = new titleDTO("전체장르", "작성리뷰 30개 ", "동작 그만 리뷰 30개냐", "wldnd");
					titleList.add(tdto);
				}if (30 < dao.countReview("wldnd") && dao.countReview("wldnd") >= 50) {
					titleDTO tdto = new titleDTO("전체장르", "작성리뷰 50개 ", "리뷰 50개 드루와", "wldnd");
					titleList.add(tdto);
				}if (50< dao.countReview("wldnd") && dao.countReview("wldnd")>= 100) {
					titleDTO tdto = new titleDTO("전체장르", "작성리뷰 100개 ", "나 리뷰 100개 쓴 사람이야", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("ACTION", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("액션", "한 장르 10개", "ACTION BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("액션", "한 장르 20개", "ACTION SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("액션", "한 장르 30개", "ACTION GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("액션", "한 장르 40개", "ACTION PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("액션", "한 장르 50개", "ACTION DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ACTION", "wldnd")) {
					titleDTO tdto = new titleDTO("액션", "한 장르 100개", "ACTION LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("DRAMA", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("드라마", "한 장르 10개", "DRAMA BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("드라마", "한 장르 20개", "DRAMA SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("드라마", "한 장르 30개", "DRAMA GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("드라마", "한 장르 40개", "DRAMA PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("드라마", "한 장르 50개", "DRAMA DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("DRAMA", "wldnd")) {
					titleDTO tdto = new titleDTO("드라마", "한 장르 100개", "DRAMA LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("ROMANCE", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("로맨스", "한 장르 10개", "ROMANCE BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("로맨스", "한 장르 20개", "ROMANCE SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("로맨스", "한 장르 30개", "ROMANCE GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("로맨스", "한 장르 40개", "ROMANCE PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("로맨스", "한 장르 50개", "ROMANCE DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ROMANCE", "wldnd")) {
					titleDTO tdto = new titleDTO("로맨스", "한 장르 100개", "ROMANCE LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("COMEDY", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("코미디", "한 장르 10개", "COMEDY BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("코미디", "한 장르 20개", "COMEDY SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("코미디", "한 장르 30개", "COMEDY GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("코미디", "한 장르 40개", "COMEDY PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("코미디", "한 장르 50개", "COMEDY DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("COMEDY", "wldnd")) {
					titleDTO tdto = new titleDTO("코미디", "한 장르 100개", "COMEDY LEGEND", "wldnd");
					titleList.add(tdto);
				}
				if(dao.countReview_Genre("ANIMATION", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("애니메이션", "한 장르 10개", "ANIMATION BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("애니메이션", "한 장르 20개", "ANIMATION SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("애니메이션", "한 장르 30개", "ANIMATION GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("애니메이션", "한 장르 40개", "ANIMATION PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("애니메이션", "한 장르 50개", "ANIMATION DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ANIMATION", "wldnd")) {
					titleDTO tdto = new titleDTO("애니메이션", "한 장르 100개", "ANIMATION LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("SFFANTASY", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("SF/판타지", "한 장르 10개", "SFFANTASY BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("SF/판타지", "한 장르 20개", "SFFANTASY SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("SF/판타지", "한 장르 30개", "SFFANTASY GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("SF/판타지", "한 장르 40개", "SFFANTASY PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("SF/판타지", "한 장르 50개", "SFFANTASY DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("SFFANTASY", "wldnd")) {
					titleDTO tdto = new titleDTO("SF/판타지", "한 장르 100개", "SFFANTASY LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("HORRORTHRILLER", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 10개", "HORRORTHRILLER BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 20개", "HORRORTHRILLER SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 30개", "HORRORTHRILLER GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 40개", "HORRORTHRILLER PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 50개", "HORRORTHRILLER DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd")) {
					titleDTO tdto = new titleDTO("공포/스릴러", "한 장르 100개", "HORRORTHRILLER LEGEND", "wldnd");
					titleList.add(tdto);
				}

				if(dao.countReview_Point(5, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("전체장르", "평점 5점 10개 이상", "5점 Assemble", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(4, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("전체장르", "평점 4점 10개 이상", "4점 묻고 더블로 가", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(3, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("전체장르", "평점 3점 10개 이상", "3점 어이가 없네", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(2, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("전체장르", "평점 2점 10개 이상", "2점 너무한 거 아니냐고", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(1, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("전체장르", "평점 1점 10개 이상", "1점은 평점인가 숫자인가", "wldnd");
					titleList.add(tdto);
				}
				for (int i = 0; i < titleList.size(); i++) {
					dao.newTitle(titleList.get(i));
				}