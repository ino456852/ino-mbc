package p25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int 물품별가격 = sc.nextInt();
		int 총가격 = sc.nextInt();
		int 물품 = sc.nextInt();
		
		if(총가격 == 260000) {
			물품별가격 = sc.nextInt();
			물품 = sc.nextInt();
			System.out.println("Yes");
		}
		
	}

}
