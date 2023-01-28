import java.util.*;
/* 중첩 for문을 활용하여 4x + 5y = 60 의 모든 해를 구해보시오 x,y는 10이하의 자연수다 */
public class Main {
    public static void main(String[] args) {
        for(int x = 0; x<11; x++){
            for (int y = 0; y<11; y++){
                if (4*x + 5 * y == 60){
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}


