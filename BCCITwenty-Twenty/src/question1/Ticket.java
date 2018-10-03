package question1;

import java.util.Date;

public class Ticket {

	private int id;
	private String audienceName;
	private String nationality;
	private int age;
	private String cellNo;
	private Date reserveDate;

	public Ticket() {
		super();
	}

	// parameterized constructor for ticket
	public Ticket(int id, String audienceName, String nationality, int age, String cellNo, Date reserveDate) {
		super();
		this.id = id;
		this.audienceName = audienceName;
		this.nationality = nationality;
		this.age = age;
		this.cellNo = cellNo;
		this.reserveDate = reserveDate;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAudienceName() {
		return audienceName;
	}

	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCellNo() {
		return cellNo;
	}

	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	// toString()
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", audienceName=" + audienceName + ", nationality=" + nationality + ", age=" + age
				+ ", cellNo=" + cellNo + ", reserveDate=" + reserveDate + "]";
	}

}// end of class
