package day0418;

/** 학생정보 */
public class Student {
	/** 학번 */
	private String id;
	/** 이름 */
	private String name;
	/** 전공 */
	private String jungong;
	/** 학년 */
	private int haknyun;

	public Student() {

	}

	public Student(String id, String name, String jungong, int haknyun) {
		super();
		this.id = id;
		this.name = name;
		this.jungong = jungong;
		this.haknyun = haknyun;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJungong() {
		return jungong;
	}

	public void setJungong(String jungong) {
		this.jungong = jungong;
	}

	public int getHaknyun() {
		return haknyun;
	}

	public void setHaknyun(int haknyun) {
		this.haknyun = haknyun;
	}

	/** 객체의 현재변수값을 문자열로 반환 */
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", jungong=" + jungong + ", haknyun=" + haknyun;
	}

} // end class
