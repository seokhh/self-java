import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 정수의 개수를 정하시오: ");
        int n = sc.nextInt();
        int a;
        int sum = 0;
        double avg = 0;

        for(int i = 0; i<n; i++){
            a = sc.nextInt();
            sum += a;
        }
        avg = (double) sum / (double) n;

        System.out.println("입력한 수의 총합:" + sum);
        System.out.println("총합의 평균: " + avg);
    }
}
