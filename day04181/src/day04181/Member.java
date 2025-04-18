package day04181;

/** 학생,교수,직원의 공통 속성 */
public class Member {
	/** 사번,학번,교번 */
	private String id;
	/** 이름 */
	private String name;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String id) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}


}
