import java.util.*;
/* math.ramdom을 이용하여 2개의 주사위를 던졌을때 결과를 출력하고 눈의 합이 5가 아니면 계속 돌리고 5면 멈추는 코드를 작성해보자 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        while (true){
            int num1 = (int) (Math.random() * 6 ) + 1;
            int num2 = (int) (Math.random() * 6 ) + 1;
            System.out.println("주사위의 눈: "+ num1+", " + num2);
            sum = num1 + num2;
            if (sum == 5){
                System.out.println("주사위 눈의 합이 5입니다.");
                break;
            }
        }
        System.out.println("시스템을 종료합니다.");
    }
}


