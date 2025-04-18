package day0418;

public class Professor {
	private String 교번;
	private String name;
	private String 학과;
	private String 직급;
	
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}


	public Professor(String 교번, String name, String 학과, String 직급) {
		super();
		this.교번 = 교번;
		this.name = name;
		this.학과 = 학과;
		this.직급 = 직급;
	}


	public String get교번() {
		return 교번;
	}


	public void set교번(String 교번) {
		this.교번 = 교번;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		return "교번=" + 교번 + ", name=" + name + ", 학과=" + 학과 + ", 직급=" + 직급;
	}

	
}
