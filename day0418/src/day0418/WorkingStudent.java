package day0418;

/** 근로장학생 */
public class WorkingStudent extends Student {

	/** 근로시간 */
	private int workingHours;
	/** 시급 */
	private int workingPay;

	public WorkingStudent() {
		// TODO Auto-generated constructor stub
	}

	public WorkingStudent(int workingHours, int workingPay) {
		super();
		this.workingHours = workingHours;
		this.workingPay = workingPay;
	}

	public WorkingStudent(String id, String name, String jungong, int haknyun, int workingHours, int workingPay) {
		super(id, name, jungong, haknyun);
		this.workingHours = workingHours;
		this.workingPay = workingPay;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours; 
	}

	public int getWorkingPay() {
		return workingPay;
	}

	public void setWorkingPay(int workingPay) {
		this.workingPay = workingPay;
	}

	public void printInfo() {
		System.out.println("근로시간="+workingHours+"시급="+workingPay);
	}

	@Override
	public String toString() {
		
		return super.toString() + ", 근로시간=" + workingHours + ", 시급=" + workingPay;
	}
	
}
