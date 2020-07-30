package Fav_model;

public class favDTO {
	String title;
	String nickname;
	int reviews;
	String user_id;
	
	public favDTO(String title, String nickname, int reviews, String user_id) {
		super();
		this.title = title;
		this.nickname = nickname;
		this.reviews = reviews;
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public String getNickname() {
		return nickname;
	}

	public int getReviews() {
		return reviews;
	}

	public String getUser_id() {
		return user_id;
	}
	

	
	
}
