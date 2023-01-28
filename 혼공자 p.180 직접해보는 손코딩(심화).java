import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] scores = new int[a];
        for(int b = 0; b<a; b++){
            scores[b] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i< scores.length; i ++){
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균: " + avg);
    }
}

