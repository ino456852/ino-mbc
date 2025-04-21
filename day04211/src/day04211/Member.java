package day04211;

/** 학생,교수,직원의 공통 속성 */
public class Member {
	/** id - 학번, 교번, 사번 */
	private String id;
	/** 이름 */
	private String name;

	public Member() {
	}

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}

}
