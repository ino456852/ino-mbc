package day04181;

public class Professor extends Member {
	private String 학과;
	private String 직급;

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String name, String id, String 학과, String 직급) {
		super(id, name);
		this.학과 = 학과;
		this.직급 = 직급;
	}

	public String get학과() {
		return 학과;
	}

	public void set학과(String 학과) {
		this.학과 = 학과;
	}

	public String get직급() {
		return 직급;
	}

	public void set직급(String 직급) {
		this.직급 = 직급;
	}

	@Override
	public String toString() {
		return super.toString() + ", 학과=" + 학과 + ", 직급=" + 직급;
	}

}
