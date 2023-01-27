import java.util.*;
/* 사다리꼴의 넓이를 구하는 코드를 짜보시오. 소수점 자리도 정확히 표현하시오. */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int height = 0;
        int lengthTop = 0;
        int lengthBottom = 0;
        System.out.print("높이를 입력하시오: ");
        height = sc.nextInt(); //높이
        System.out.print("윗변을 입력하시오: ");
        lengthTop= sc.nextInt();  //윗변
        System.out.print("아랫변을 입력하시오: ");
        lengthBottom = sc.nextInt(); //아랫변

        double area = (lengthTop + lengthBottom) * height / 2.0;
        System.out.println("이 사다리꼴의 넓이는 " + area + "입니다.");
    }
}