import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String positon;
        positon = sc.nextLine();

        switch (positon){
            case "부장":
                System.out.println("월급은 700만원입니다.");
                break;
            case "과장":
                System.out.println("월급은 500만원입니다.");
                break;
            default:
                System.out.println("월급은 300만원입니다.");
        }
    }
}

