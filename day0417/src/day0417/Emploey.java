package day0417;

public class Emploey {
	String name;
	String job;
	String dept;
	int year;

	public Emploey() {
	}

	public Emploey(String name, String job, String dept, int year) {
		super();
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.year = year;
	}

	void printInfo() {
		System.out.println("name=" + name + ",직급=" + job + ",부서=" + dept + ",입사연도=" + year);
	}

}
