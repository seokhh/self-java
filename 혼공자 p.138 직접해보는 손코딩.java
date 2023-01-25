import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score>=90){
            System.out.println("점수는 " + score + "입니다.");
            System.out.println("등급은 A입니다.");
        }

        else if (score >=80){
            System.out.println("점수는 " + score + "입니다.");
            System.out.println("등급은 B입니다.");
            
        } else if (score>=70) {
            System.out.println("점수는 " + score + "입니다.");
            System.out.println("등급은 C입니다.");
        }
        else  {
            System.out.println("점수는 " + score + "입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}

