titleDAO dao = new titleDAO();
				ArrayList<titleDTO> titleList = new ArrayList<titleDTO>();
				if(dao.countReview("wldnd") >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 10�� ", "���� 10���� ��ȭ�� �ٶ� �� �����", "wldnd");
					titleList.add(tdto);
				}if (10< dao.countReview("wldnd") && dao.countReview("wldnd")>= 30) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 30�� ", "���� �׸� ���� 30����", "wldnd");
					titleList.add(tdto);
				}if (30 < dao.countReview("wldnd") && dao.countReview("wldnd") >= 50) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 50�� ", "���� 50�� ����", "wldnd");
					titleList.add(tdto);
				}if (50< dao.countReview("wldnd") && dao.countReview("wldnd")>= 100) {
					titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 100�� ", "�� ���� 100�� �� ����̾�", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("ACTION", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 10��", "ACTION BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 20��", "ACTION SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 30��", "ACTION GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 40��", "ACTION PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ACTION", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 50��", "ACTION DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ACTION", "wldnd")) {
					titleDTO tdto = new titleDTO("�׼�", "�� �帣 100��", "ACTION LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("DRAMA", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("���", "�� �帣 10��", "DRAMA BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("���", "�� �帣 20��", "DRAMA SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("���", "�� �帣 30��", "DRAMA GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("���", "�� �帣 40��", "DRAMA PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("DRAMA", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("���", "�� �帣 50��", "DRAMA DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("DRAMA", "wldnd")) {
					titleDTO tdto = new titleDTO("���", "�� �帣 100��", "DRAMA LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("ROMANCE", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 10��", "ROMANCE BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 20��", "ROMANCE SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 30��", "ROMANCE GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 40��", "ROMANCE PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ROMANCE", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 50��", "ROMANCE DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ROMANCE", "wldnd")) {
					titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 100��", "ROMANCE LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("COMEDY", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 10��", "COMEDY BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 20��", "COMEDY SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 30��", "COMEDY GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 40��", "COMEDY PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("COMEDY", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 50��", "COMEDY DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("COMEDY", "wldnd")) {
					titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 100��", "COMEDY LEGEND", "wldnd");
					titleList.add(tdto);
				}
				if(dao.countReview_Genre("ANIMATION", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 10��", "ANIMATION BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 20��", "ANIMATION SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 30��", "ANIMATION GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 40��", "ANIMATION PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("ANIMATION", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 50��", "ANIMATION DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("ANIMATION", "wldnd")) {
					titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 100��", "ANIMATION LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("SFFANTASY", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 10��", "SFFANTASY BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 20��", "SFFANTASY SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 30��", "SFFANTASY GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 40��", "SFFANTASY PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("SFFANTASY", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 50��", "SFFANTASY DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("SFFANTASY", "wldnd")) {
					titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 100��", "SFFANTASY LEGEND", "wldnd");
					titleList.add(tdto);
				}
				
				if(dao.countReview_Genre("HORRORTHRILLER", "wldnd") >= 10){
					titleDTO tdto = new titleDTO("����/������", "�� �帣 10��", "HORRORTHRILLER BRONZE", "wldnd");
					titleList.add(tdto);
				}if(20 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 30){
					titleDTO tdto = new titleDTO("����/������", "�� �帣 20��", "HORRORTHRILLER SILVER", "wldnd");
					titleList.add(tdto);
				}
				if (30 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 40) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 30��", "HORRORTHRILLER GOLD", "wldnd");
					titleList.add(tdto);
				}
				if (40 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 50) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 40��", "HORRORTHRILLER PLATINUM", "wldnd");
					titleList.add(tdto);
				}
				if (50 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd") && dao.countReview("wldnd") > 100) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 50��", "HORRORTHRILLER DIAMOND", "wldnd");
					titleList.add(tdto);
				}
				if (100 <= dao.countReview_Genre("HORRORTHRILLER", "wldnd")) {
					titleDTO tdto = new titleDTO("����/������", "�� �帣 100��", "HORRORTHRILLER LEGEND", "wldnd");
					titleList.add(tdto);
				}

				if(dao.countReview_Point(5, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 5�� 10�� �̻�", "5�� Assemble", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(4, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 4�� 10�� �̻�", "4�� ���� ����� ��", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(3, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 3�� 10�� �̻�", "3�� ���̰� ����", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(2, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 2�� 10�� �̻�", "2�� �ʹ��� �� �ƴϳİ�", "wldnd");
					titleList.add(tdto);
				}if(dao.countReview_Point(1, "wldnd") >= 10) {
					titleDTO tdto = new titleDTO("��ü�帣", "���� 1�� 10�� �̻�", "1���� �����ΰ� �����ΰ�", "wldnd");
					titleList.add(tdto);
				}
				for (int i = 0; i < titleList.size(); i++) {
					dao.newTitle(titleList.get(i));
				}