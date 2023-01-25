import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String grade; // 예제와 다르게 문자열로 입력 받을 수 있게 바꿨습니다.
        grade = sc.nextLine();

        switch (grade){
            case "A":
            case "a":
                System.out.println("우수 회원입니다.");
                break;
            case "B":
            case "b":
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}

