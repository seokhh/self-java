import java.util.*;
/*입력한 자루의 연필을 입력한 몇명에게 똑같이 나누어줄 때 1인당 갯수와 남는 연필의 개수를 구하는 코드를 짜보시오*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int student = sc.nextInt();

        int devide = pencil / student;
        int last = pencil % student;
        System.out.println("1인당 나누어가진 개수: " + devide);
        System.out.println("나누어주고 남은 개수: " + last);
    }
}