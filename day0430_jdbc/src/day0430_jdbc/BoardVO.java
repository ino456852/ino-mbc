package day0430_jdbc;

import java.util.Date;

public class BoardVO {
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date reg_date;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int no, String title, String writer, String content, Date reg_date) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.reg_date = reg_date;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", reg_date="
				+ reg_date;
	}
	
	
}
