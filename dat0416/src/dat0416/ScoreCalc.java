package dat0416;

import java.util.Scanner;

public class ScoreCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[3];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번째 학생 점수: ");
            sum += (scores[i] = sc.nextInt());
        }

        double avg = sum / (double) scores.length;
        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}
