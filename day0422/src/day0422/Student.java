package day0422;

import java.util.Objects;

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
	
	

	@Override
	public int hashCode() {
		return Objects.hash(haknyun, jungonh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return haknyun == other.haknyun && Objects.equals(jungonh, other.jungonh);
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
		return ", jungonh=" + jungonh + ", haknyun=" + haknyun;
	}

}
