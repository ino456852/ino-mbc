package day0418;

public class Staff {
	private String 사번;
	private String 이름;
	private String 부서;
	private String 직위;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String 사번, String 이름, String 부서, String 직위) {
		super();
		this.사번 = 사번;
		this.이름 = 이름;
		this.부서 = 부서;
		this.직위 = 직위;
	}

	public String get사번() {
		return 사번;
	}

	public void set사번(String 사번) {
		this.사번 = 사번;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get부서() {
		return 부서;
	}

	public void set부서(String 부서) {
		this.부서 = 부서;
	}

	public String get직위() {
		return 직위;
	}

	public void set직위(String 직위) {
		this.직위 = 직위;
	}

	@Override
	public String toString() {
		return "사번=" + 사번 + ", 이름=" + 이름 + ", 부서=" + 부서 + ", 직위=" + 직위;
	}
	
	
}
