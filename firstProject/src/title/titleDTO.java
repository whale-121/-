package title;

public class titleDTO {

	
	private String genre;
	private String condition;
	private String mem_id;
	private String title;
	
	
	
	public titleDTO(String genre,String condition, String title, String mem_id) {
		super();
		this.genre = genre;
		this.condition = condition;
		this.mem_id = mem_id;
		this.title = title;
		
	}
	
	
	public String getGenre() {
		return genre;
	}
	public String getCondition() {
		return condition;
	}
	public String getMem_id() {
		return mem_id;
	}
	public String getTitle() {
		return title;
	}
	



}
