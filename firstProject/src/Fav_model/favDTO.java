package Fav_model;

public class favDTO {
	String title;
	String nickname;
	int reviews;
	
	public favDTO(String title, String nickname, int reviews) {
		this.title = title;
		this.nickname = nickname;
		this.reviews = reviews;
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
	
	
}
