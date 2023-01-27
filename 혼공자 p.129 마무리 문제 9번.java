import java.util.*;
/* 두 실수를 입력받아 나누고 두번째 수가 0 혹은 0.0이면 결과:무한대를 출력하는 코드를 짜보시오 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("첫 번째 수: ");
        a = sc.nextDouble();
        double b;
        System.out.print("두 번째 수: ");
        b = sc.nextDouble();

        double result = a / b;
        if(b == 0){
            System.out.println("결과: 무한대");
        } else {
            System.out.println("결과: " + result);
        }
    }
}