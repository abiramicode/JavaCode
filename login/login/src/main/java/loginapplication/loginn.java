package loginapplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="login")

public class loginn {

	@Id
	//@GeneratedValue
	
	@Column(name="identification")
	private Integer id;
	
	@Column(name="username")
	private String usernam;
	
	@Column(name="password")
	private String password;

	
	public loginn() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsernam() {
		return usernam;
	}
	public void setUsernam(String usernam) {
		this.usernam = usernam;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}