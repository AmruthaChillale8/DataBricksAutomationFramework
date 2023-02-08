package pojo;

public class tokeninfo {
	private String token_id;
	private long creation_time;
	private long expiry_time;
	private String comment;
	
	
	public String getToken_id() {
		return token_id;
	}
	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}
	public long getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(long creation_time) {
		this.creation_time = creation_time;
	}
	public long getExpiry_time() {
		return expiry_time;
	}
	public void setExpiry_time(long expiry_time) {
		this.expiry_time = expiry_time;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
