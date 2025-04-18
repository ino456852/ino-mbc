package day0418;

public class ParttimeProfessor extends Professor {
	private int 시급;
	private int 근로시간;

	public ParttimeProfessor() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ParttimeProfessor(int 시급, int 근로시간) {
		super();
		this.시급 = 시급;
		this.근로시간 = 근로시간;
	}



	public ParttimeProfessor(String 교번, String name, String 학과, String 직급, int 시급, int 근로시간) {
		super(교번, name, 학과, 직급);
		this.시급 = 시급;
		this.근로시간 = 근로시간;
	}

	public int get시급() {
		return 시급;
	}

	public void set시급(int 시급) {
		this.시급 = 시급;
	}

	public int get근로시간() {
		return 근로시간;
	}

	public void set근로시간(int 근로시간) {
		this.근로시간 = 근로시간;
	}

	@Override
	public String toString() {
		return super.toString() + ", 시급=" + 시급 + ", 근로시간=" + 근로시간;
	}

}
