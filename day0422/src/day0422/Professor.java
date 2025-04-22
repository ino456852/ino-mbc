package day0422;

public class Professor extends Member {
	private String hakgwa;
	private String jikgup;

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String id, String name, String hakgwa, String jikgup) {
		super(id, name);
		this.hakgwa = hakgwa;
		this.jikgup = jikgup;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

	public String getJikgup() {
		return jikgup;
	}

	public void setJikgup(String jikgup) {
		this.jikgup = jikgup;
	}

	@Override
	public String toString() {
		return super.toString() + ", hakgwa=" + hakgwa + ", jikgup=" + jikgup;
	}

}
