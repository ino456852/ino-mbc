package day04171;

public class Product {
	private String name;
	private int 용량;

	public Product() {
	}

	public Product(String name, int 용량) {
		super();
		this.name = name;
		this.용량 = 용량;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get용량() {
		return 용량;
	}

	public void set용량(int 용량) {
		this.용량 = 용량;
	}

	void printInfo() {
		System.out.println("name=" + name + ",용량=" + 용량);
	}
}
