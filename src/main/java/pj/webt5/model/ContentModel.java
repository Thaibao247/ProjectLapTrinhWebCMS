package pj.webt5.model;



public class ContentModel {
	private int cid;
	private String tittle;
	private String brief1;
	private String content1;
	private String createdate1;
	private String updatetime1;
	private int userid;
	
	

	


	public ContentModel(String tittle, String brief1, String content1, String createdate1, String updatetime1,
			int userid) {
		super();
		this.tittle = tittle;
		this.brief1 = brief1;
		this.content1 = content1;
		this.createdate1 = createdate1;
		this.updatetime1 = updatetime1;
		this.userid = userid;
	}






	public ContentModel(int cid, String tittle, String brief1, String content1, String createdate1, String updatetime1,
			int userid) {
		super();
		this.cid = cid;
		this.tittle = tittle;
		this.brief1 = brief1;
		this.content1 = content1;
		this.createdate1 = createdate1;
		this.updatetime1 = updatetime1;
		this.userid = userid;
	}






	public int getCid() {
		return cid;
	}






	public void setCid(int cid) {
		this.cid = cid;
	}






	public String getTittle() {
		return tittle;
	}






	public void setTittle(String tittle) {
		this.tittle = tittle;
	}






	public String getBrief1() {
		return brief1;
	}






	public void setBrief1(String brief1) {
		this.brief1 = brief1;
	}






	public String getContent1() {
		return content1;
	}






	public void setContent1(String content1) {
		this.content1 = content1;
	}






	public String getCreatedate1() {
		return createdate1;
	}






	public void setCreatedate1(String createdate1) {
		this.createdate1 = createdate1;
	}






	public String getUpdatetime1() {
		return updatetime1;
	}






	public void setUpdatetime1(String updatetime1) {
		this.updatetime1 = updatetime1;
	}






	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}

	public ContentModel() {
		super();
	}
	
	
	
}
