package day04181;

public class Student extends Member {
	private String jungonh;
	private String haknyun;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String id, String jungonh, String haknyun) {
		super(id, name);
		this.jungonh = jungonh;
		this.haknyun = haknyun;
	}

	public String getJungonh() {
		return jungonh;
	}

	public void setJungonh(String jungonh) {
		this.jungonh = jungonh;
	}

	public String gethaknyun() {
		return haknyun;
	}

	public void sethaknyun(String haknyun) {
		this.haknyun = haknyun;
	}

	@Override
	public String toString() {
		return super.toString() + ", jungonh=" + jungonh + ", haknyun=" + haknyun;
	}

}
