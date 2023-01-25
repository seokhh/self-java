import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score>=90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다."); /*만약 중괄호를 넣지 않는다면 true false
            상관없이 실행되어 중괄호는 붙이는게 좋다.*/
        }
    }
}

