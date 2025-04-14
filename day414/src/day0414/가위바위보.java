package day0414;

public class 가위바위보 {
	
	public static void main(String[] args) {
		
		int ran = (int)(Math.random() * 3);
		int r = (int)(Math.random() * 3);
//		System.out.println(ran);
		
		if(ran == 0 ) {
			System.out.println("가위");
		}else if (ran == 1) {
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
		switch (r) {
		case 0 :
			System.out.println("가위");
			break;
		case 1 :
			System.out.println("바위");
			break;
		default :
			System.out.println("보");
			break;
		}
	}
	
	
}