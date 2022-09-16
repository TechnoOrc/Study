package kr.co.ictedu.calendar;

public class CalendarDTO {

	private String to_date;
	private String last_date;
	private String first_day;//(mysql)1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토
	private String for_end;
	private String plan_year;
	private String plan_month;
	private String plan_date;

	private String mno;
	private String mid;

	private String plan_start_time;
	private String plan_end_time;
	private String plan_desc;
	private String plan_expect_price;
	private String plan_contact_price;

	public String toString() {
		return 
				"plan_year : " + plan_year
				+ ", plan_month : " + plan_month
				+ ", plan_date : " + plan_date
				+ ", mno : " + mno
				+ ", plan_start_time : " + plan_start_time
				+ ", plan_end_time : " + plan_end_time
				+ ", plan_desc : " + plan_desc
				+ ", plan_expect_price : " + plan_expect_price
				+ ", plan_contact_price : " + plan_contact_price;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public String getLast_date() {
		return last_date;
	}
	public void setLast_date(String last_date) {
		this.last_date = last_date;
	}
	public String getFirst_day() {
		return first_day;
	}
	public void setFirst_day(String first_day) {
		this.first_day = first_day;
	}
	public String getFor_end() {
		return for_end;
	}
	public void setFor_end(String for_end) {
		this.for_end = for_end;
	}
	public String getPlan_year() {
		return plan_year;
	}
	public void setPlan_year(String plan_year) {
		this.plan_year = plan_year;
	}
	public String getPlan_month() {
		return plan_month;
	}
	public void setPlan_month(String plan_month) {
		this.plan_month = plan_month;
	}
	public String getPlan_date() {
		return plan_date;
	}
	public void setPlan_date(String plan_date) {
		this.plan_date = plan_date;
	}

	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getPlan_start_time() {
		return plan_start_time;
	}
	public void setPlan_start_time(String plan_start_time) {
		this.plan_start_time = plan_start_time;
	}
	public String getPlan_end_time() {
		return plan_end_time;
	}
	public void setPlan_end_time(String plan_end_time) {
		this.plan_end_time = plan_end_time;
	}
	public String getPlan_desc() {
		return plan_desc;
	}
	public void setPlan_desc(String plan_desc) {
		this.plan_desc = plan_desc;
	}
	public String getPlan_expect_price() {
		return plan_expect_price;
	}
	public void setPlan_expect_price(String plan_expect_price) {
		this.plan_expect_price = plan_expect_price;
	}
	public String getPlan_contact_price() {
		return plan_contact_price;
	}
	public void setPlan_contact_price(String plan_contact_price) {
		this.plan_contact_price = plan_contact_price;
	}

}//class
