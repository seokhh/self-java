import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] scores = new int[a];
        for(int i = 0; i<a; i++){
            scores[i] = sc.nextInt();
        }



        int sum = 0;
        for(int score : scores){
            sum += score;
        }
        System.out.println("점수 종합 = "+ sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}