import java.util.*;
/* 아이디와 패스워드를 입력받고 아이디는 문자열 패스워드는 정수(int타입으로 변환)
 입력된 아이디가 java 패드워드가 12345면 성공 아니면 실패로 출력하는 코드를 짜보시오 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디: ");
        String name = sc.nextLine();
        System.out.print("패스워드: ");
        String strpassword = sc.nextLine();
        int password = Integer.parseInt(strpassword);

        if((name.equals("java")) & (password == 12345)) {
            System.out.println("로그인 성공");
        } else if((name.equals("java")) & (password != 12345)){
            System.out.println("로그인 실패: 패드워드 틀림");
        }
        else {
            System.out.println("로그인 실패: 아이디가 존재하지 않음");
        }
    }
}


