package day0430_jdbc;

import java.util.Date;

public class TodoVO {

	private int no, priority;
	private String title, content, status;
	private Date due_dt, reg_dt;

	public TodoVO() {
		// TODO Auto-generated constructor stub
	}

	public TodoVO(int no, int priority, String title, String content, String status, Date due_dt, Date reg_dt) {
		super();
		this.no = no;
		this.priority = priority;
		this.title = title;
		this.content = content;
		this.status = status;
		this.due_dt = due_dt;
		this.reg_dt = reg_dt;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDue_dt() {
		return due_dt;
	}

	public void setDue_dt(Date due_dt) {
		this.due_dt = due_dt;
	}

	public Date getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}

	@Override
	public String toString() {
		return "TodoVO [no=" + no + ", priority=" + priority + ", title=" + title + ", content=" + content + ", status="
				+ status + ", due_dt=" + due_dt + ", reg_dt=" + reg_dt + "]";
	}

}
