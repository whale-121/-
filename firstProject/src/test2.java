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
		MemberDTO dto = new MemberDTO("wldnd", "pw", "����", "name", 61, "sex", "likeGenre", "title");
		MemberDTO dto1 = new MemberDTO("admin", "pw", "����", "name", 61, "sex", "likeGenre", "title");

		if (dao.countReview(dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 10�� ", "���� 10���� ��ȭ�� �ٶ� �� �����", dto.getId());
			titleList.add(tdto);
		}
		if (10 < dao.countReview(dto.getId()) && dao.countReview(dto.getId()) >= 30) {
			titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 30�� ", "���� �׸� ���� 30����", dto.getId());
			titleList.add(tdto);
		}
		if (30 < dao.countReview(dto.getId()) && dao.countReview(dto.getId()) >= 50) {
			titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 50�� ", "���� 50�� ����", dto.getId());
			titleList.add(tdto);
		}
		if (50 < dao.countReview(dto.getId()) && dao.countReview(dto.getId()) >= 100) {
			titleDTO tdto = new titleDTO("��ü�帣", "�ۼ����� 100�� ", "�� ���� 100�� �� ����̾�", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("ACTION", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("�׼�", "�� �帣 10��", "ACTION BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("�׼�", "�� �帣 20��", "ACTION SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("�׼�", "�� �帣 30��", "ACTION GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("�׼�", "�� �帣 40��", "ACTION PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("ACTION", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("�׼�", "�� �帣 50��", "ACTION DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("ACTION", dto.getId())) {
			titleDTO tdto = new titleDTO("�׼�", "�� �帣 100��", "ACTION LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("DRAMA", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("���", "�� �帣 10��", "DRAMA BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("���", "�� �帣 20��", "DRAMA SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("���", "�� �帣 30��", "DRAMA GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("���", "�� �帣 40��", "DRAMA PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("DRAMA", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("���", "�� �帣 50��", "DRAMA DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("DRAMA", dto.getId())) {
			titleDTO tdto = new titleDTO("���", "�� �帣 100��", "DRAMA LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("ROMANCE", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 10��", "ROMANCE BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 20��", "ROMANCE SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 30��", "ROMANCE GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 40��", "ROMANCE PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("ROMANCE", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 50��", "ROMANCE DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("ROMANCE", dto.getId())) {
			titleDTO tdto = new titleDTO("�θǽ�", "�� �帣 100��", "ROMANCE LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("COMEDY", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 10��", "COMEDY BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 20��", "COMEDY SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 30��", "COMEDY GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 40��", "COMEDY PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("COMEDY", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 50��", "COMEDY DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("COMEDY", dto.getId())) {
			titleDTO tdto = new titleDTO("�ڹ̵�", "�� �帣 100��", "COMEDY LEGEND", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Genre("ANIMATION", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 10��", "ANIMATION BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 20��", "ANIMATION SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 30��", "ANIMATION GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 40��", "ANIMATION PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("ANIMATION", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 50��", "ANIMATION DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("ANIMATION", dto.getId())) {
			titleDTO tdto = new titleDTO("�ִϸ��̼�", "�� �帣 100��", "ANIMATION LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("SFFANTASY", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 10��", "SFFANTASY BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 20��", "SFFANTASY SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 30��", "SFFANTASY GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 40��", "SFFANTASY PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("SFFANTASY", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 50��", "SFFANTASY DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("SFFANTASY", dto.getId())) {
			titleDTO tdto = new titleDTO("SF/��Ÿ��", "�� �帣 100��", "SFFANTASY LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Genre("HORRORTHRILLER", dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("����/������", "�� �帣 10��", "HORRORTHRILLER BRONZE", dto.getId());
			titleList.add(tdto);
		}
		if (20 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 30) {
			titleDTO tdto = new titleDTO("����/������", "�� �帣 20��", "HORRORTHRILLER SILVER", dto.getId());
			titleList.add(tdto);
		}
		if (30 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 40) {
			titleDTO tdto = new titleDTO("����/������", "�� �帣 30��", "HORRORTHRILLER GOLD", dto.getId());
			titleList.add(tdto);
		}
		if (40 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 50) {
			titleDTO tdto = new titleDTO("����/������", "�� �帣 40��", "HORRORTHRILLER PLATINUM", dto.getId());
			titleList.add(tdto);
		}
		if (50 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId()) && dao.countReview(dto.getId()) > 100) {
			titleDTO tdto = new titleDTO("����/������", "�� �帣 50��", "HORRORTHRILLER DIAMOND", dto.getId());
			titleList.add(tdto);
		}
		if (100 <= dao.countReview_Genre("HORRORTHRILLER", dto.getId())) {
			titleDTO tdto = new titleDTO("����/������", "�� �帣 100��", "HORRORTHRILLER LEGEND", dto.getId());
			titleList.add(tdto);
		}

		if (dao.countReview_Point(5, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("��ü�帣", "���� 5�� 10�� �̻�", "5�� Assemble", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(4, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("��ü�帣", "���� 4�� 10�� �̻�", "4�� ���� ����� ��", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(3, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("��ü�帣", "���� 3�� 10�� �̻�", "3�� ���̰� ����", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(2, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("��ü�帣", "���� 2�� 10�� �̻�", "2�� �ʹ��� �� �ƴϳİ�", dto.getId());
			titleList.add(tdto);
		}
		if (dao.countReview_Point(1, dto.getId()) >= 10) {
			titleDTO tdto = new titleDTO("��ü�帣", "���� 1�� 10�� �̻�", "1���� �����ΰ� �����ΰ�", dto.getId());
			titleList.add(tdto);
		}

		titleDAO dao1 = new titleDAO();
		ArrayList<titleDTO> test = new ArrayList<titleDTO>(); // �� �迭
		ArrayList<String> myTitle = dao1.duplicateTitle(dto); // ���� ���� Ÿ��Ʋ ����Ʈ

		// titleList = ���� ������ Ÿ��Ʋ�� ��� ����Ʈ
		for (int i = 0; i < titleList.size(); i++) { 

			for (int j = 0; j < myTitle.size(); j++) { // ���� 

				if (titleList.get(i).getTitle().equals(myTitle.get(j))) {

					System.out.println("�ߺ�");

				} else if (titleList.get(i).getTitle().equals(myTitle.get(j)) == false) {

					System.out.println("�ߺ�����");
					test.add(titleList.get(i));
				}
			}
		}
		System.out.println("������������" + titleList.size());
		System.out.println("���� ���� Ÿ��Ʋ ���� " + myTitle.size());
		System.out.println("�ߺ����� Ÿ��Ʋ" + test.size());
		
		System.out.println(titleList.get(3).getTitle());
		System.out.println(myTitle.get(1));
		for (int i = 0; i < test.size(); i++) {
			dao1.newTitle(test.get(i));
//			dao1.newTitle(titleList.get(i));
		}
	}

}
