package Genre_Review_Model;

public class ReviewDTO {

	int reviewNumber;
	String nickName;
	String genre;
	String movieName;
	int point;
	String reviewName;
	String reviewCont;
	String reviewDate;
	
	
	public ReviewDTO() {
		super();
	}

	public ReviewDTO(int reviewNumber, String nickName, String genre, String movieName, int point, String reviewName,
			String reviewCont, String reviewDate) {
		this.reviewNumber = reviewNumber;
		this.nickName = nickName;
		this.genre = genre;
		this.movieName = movieName;
		this.point = point;
		this.reviewName = reviewName;
		this.reviewCont = reviewCont;
		this.reviewDate = reviewDate;
	}

	public int getReviewNumber() {
		return reviewNumber;
	}

	public String getNickName() {
		return nickName;
	}

	public String getGenre() {
		return genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getPoint() {
		return point;
	}

	public String getReviewName() {
		return reviewName;
	}

	public String getReviewCont() {
		return reviewCont;
	}

	public String getReviewDate() {
		return reviewDate;
	}

}
