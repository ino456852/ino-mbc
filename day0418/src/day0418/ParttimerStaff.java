package day0418;

public class ParttimerStaff extends Staff {
	private int 시급;
	private int 근로시간;
	
	public ParttimerStaff() {
		// TODO Auto-generated constructor stub
	}

	public ParttimerStaff(String 사번, String 이름, String 부서, String 직위, int 시급, int 근로시간) {
		super(사번, 이름, 부서, 직위);
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
