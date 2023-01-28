import java.util.*;
/* 점수를 입력받아 등급을 출력하는 코드를 짜보시오 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 점수를 입력하시오: ");
        int a = sc.nextInt();

        if (a>=90){
            System.out.println("등급은 A입니다.");
        } else if (a>=80){
            System.out.println("등급은 B입니다.");
        } else if (a>=70) {
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("등급은 D입니다.");
        }
    }
}


