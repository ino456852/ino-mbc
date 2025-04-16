package dat0416;

public class MultiArrayExam {

	public static void main(String[] args) {
		int[][] arr2 =new int [2][3];
		System.out.println(arr2.length); // 행
		System.out.println(arr2[0].length); // 행의 열의 수
		
		arr2[0][0] = 90;
		arr2[1][2] = 70;
		
		// 가변 2차원 배열
		String [][] diary = new String [13][];
		diary[1] = new String [32]; 
		diary[2] = new String [29]; 
		diary[3] = new String [32]; 
		diary[4] = new String [31];
		diary[4][16] = "자바2차원배열공부"; 	
		diary[5] = new String [32]; 
		diary[6] = new String [32]; 
		diary[7] = new String [32]; 
		diary[8] = new String [32]; 
		diary[9] = new String [32]; 
		diary[10] = new String [32]; 
		diary[11] = new String [32]; 
		diary[12] = new String [32]; 
		
	}

}
