import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        while (run) {
            System.out.println("-------------------------------------------");
            System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택> ");

            int selectNO = sc.nextInt();

            if (selectNO == 1) {
                System.out.print("학생수> ");
                studentNum = sc.nextInt();
                scores = new int[studentNum];
            }
            if (selectNO == 2) {
                for (int a = 0; a < scores.length; a++) {
                    System.out.print("scores" + "[" + a + "]> ");
                    scores[a] = sc.nextInt();
                }
            }
            if (selectNO == 3) {
                for (int a = 0; a < scores.length; a++) {
                    System.out.print("scores" + "[" + a + "]> ");
                    System.out.println(scores[a]);
                }
            }
            if (selectNO == 4) {
                int max = 0;
                double avg = 0;
                int sum = 0;
                for (int a = 0; a < scores.length; a++) {
                    max = (max < scores[a]) ? scores[a] : max;
                        sum += scores[a];


                    avg = (double) sum / studentNum;

                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            }

                if (selectNO == 5) {
                    run = false;
                }
        }
        System.out.println("프로그램 종료");
    }
}