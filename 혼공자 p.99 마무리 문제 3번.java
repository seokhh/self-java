import java.util.*;
/* 스캐너를 사용하여 이름 주민번호 전화번호를 입력받아 출력하는 코드를 짜보시오 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        
        System.out.println("1. 이름: " +name);
        System.out.println("2. 주민번호 앞 6자리: " + num1);
        System.out.println("3. 전화번호: " + num2);
    }
}

