import java.util.*;
/* 알파벳을 입력받아 회원등급을 출력하는 코드를 짜보시오 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하시오: ");
        String a = sc.nextLine();

        switch (a){
            case "A": System.out.println("VVIP 혜택을 받으실 수 있습니다.");
            break;
            case "a": System.out.println("VVIP 혜택을 받으실 수 있습니다.");
            break;

            case "B": System.out.println("VIP 혜택을 받으실 수 있습니다.");
                break;
            case "b": System.out.println("VIP 혜택을 받으실 수 있습니다.");
            break;

            case "C": System.out.println("우수 혜택을 받으실 수 있습니다.");
                break;
            case "c": System.out.println("우수 혜택을 받으실 수 있습니다.");
            break;

            case "D": System.out.println("일반 혜택을 받으실 수 있습니다.");
                break;
            case "d": System.out.println("일반 혜택을 받으실 수 있습니다.");
            break;

            default: System.out.println("혜택이 없습니다.");
        }
        System.out.println("감사합니다.");
    }
}


