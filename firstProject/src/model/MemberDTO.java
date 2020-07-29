package model;

public class MemberDTO {
	private String id;
	private String pw;
	private String nickName;
	private String name;
	private int age;
	private String sex;
	private String likeGenre;
	private String title;
	
	
	public MemberDTO(String id, String pw, String nickName, String name, int age, String sex, String likeGenre,
			String title) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.likeGenre = likeGenre;
		this.title = title;
	}


	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public String getNickName() {
		return nickName;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getSex() {
		return sex;
	}


	public String getLikeGenre() {
		return likeGenre;
	}


	public String getTitle() {
		return title;
	}
	
	
	

}