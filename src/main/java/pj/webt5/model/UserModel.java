package pj.webt5.model;


public class UserModel {
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String phone;
	private String email;
	private String description;
	private String createdate;
	private String updatetime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public UserModel(int id, String firstname, String lastname, String username, String password, String phone,
			String email, String description, String createdate, String updatetime) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.description = description;
		this.createdate = createdate;
		this.updatetime = updatetime;
	}
	public UserModel() {
		super();
	}
	public UserModel(String firstname, String lastname, String username, String password, String phone, String email,
			String description, String createdate, String updatetime) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.description = description;
		this.createdate = createdate;
		this.updatetime = updatetime;
	}
	public UserModel(int id, String firstname, String lastname, String phone, String description, String updatetime) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.description = description;
		this.updatetime = updatetime;
	}
	
	
}
