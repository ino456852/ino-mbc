package day04211;

/** 학생정보 */
public class Student extends Member {
	/** 전공 */
	private String jungonh;
	/** 학년 */
	private int haknyun;

	public Student() {
	}

	public Student(String id, String name, String jungonh, int haknyun) {
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

	public int getHaknyun() {
		return haknyun;
	}

	public void setHaknyun(int haknyun) {
		this.haknyun = haknyun;
	}

	@Override
	public String toString() {
		return "Student [jungonh=" + jungonh + ", haknyun=" + haknyun + "]";
	}

}
