package domain;

import java.util.Date;

public class LoginVO {
	private long num;
	private String uname;
	private String schoolname;
	private String gradeclass;
	private String uid;
	private String upw;
	private String route;
	private String boardingplace;
	private Date joindate;
	private int coupon;
	
	
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getGradeclass() {
		return gradeclass;
	}
	public void setGradeclass(String gradeclass) {
		this.gradeclass = gradeclass;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getBoardingplace() {
		return boardingplace;
	}
	public void setBoardingplace(String boardingplace) {
		this.boardingplace = boardingplace;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
	
}
