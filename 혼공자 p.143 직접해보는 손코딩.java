import java.util.*;

public class Main {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 4) + 8;
        System.out.println("[현재 시각: " + num + " 시]");

        switch (num){
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            case 12:
                System.out.println("외근을 나갑니다.");
        }
        //break문이 없기때문에 모든 것이 출력됨.
    }
}

