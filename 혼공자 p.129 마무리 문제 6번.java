import java.util.*;
/* 입력받은 값에서 십의 자리 이하는 버리는 코드를 작성해보시오.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("입력받은 값: " + a);
        System.out.println("십의 자리 이하를 버린 숫자: " + (a-(a%100)));
    }
}