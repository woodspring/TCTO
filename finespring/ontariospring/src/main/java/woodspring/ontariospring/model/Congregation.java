package woodspring.ontariospring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CONGREGATION")
public class Congregation {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name="INSIDE_ID")
	@NotNull
	private long insideId;
	
	@Column(name="NAME")
	@NotNull
	private String name;
	
	@Column(name="HOME_NUM")
	private String homeNum;
	
	@Column(name="CELL_NUM")
	private String cellNum;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TEAM")
	private String team;


	@Column(name="UPDATED_TS")
	private Date updatedTS;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getInsideId() {
		return insideId;
	}


	public void setInsideId(long insideId) {
		this.insideId = insideId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHomeNum() {
		return homeNum;
	}


	public void setHomeNum(String homeNum) {
		this.homeNum = homeNum;
	}


	public String getCellNum() {
		return cellNum;
	}


	public void setCellNum(String cellNum) {
		this.cellNum = cellNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public Date getUpdatedTS() {
		return updatedTS;
	}


	public void setUpdatedTS(Date updatedTS) {
		this.updatedTS = updatedTS;
	}


 
	@Override
	public String toString() {
		return "Congregation [id=" + id + ", insideId=" + insideId + ", name=" + name + ", homeNum=" + homeNum
				+ ", cellNum=" + cellNum + ", email=" + email + ", team=" + team + ", updatedTS=" + updatedTS + "]";
	}



}
