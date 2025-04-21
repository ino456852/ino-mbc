package day0421;

/** 학생 정보 */
public class Student {
	/** 학번 */
	private String hakbun;
	/** 이름 */
	private String name;
	/** 전공 */
	private String jungonh;
	/** 학년 */
	private int haknyun;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String hakbun, String name, String jungonh, int haknyun) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.jungonh = jungonh;
		this.haknyun = haknyun;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "hakbun=" + hakbun + ", name=" + name + ", jungonh=" + jungonh + ", haknyun=" + haknyun;
	}

}
