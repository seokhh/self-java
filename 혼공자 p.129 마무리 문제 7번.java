import java.util.*;
/* 주석 코드 안에서 10%가 아닙니다가 출력되었다. 10%입니다를 출력하기위해 고쳐보시오*/
/*public class Main {
    public static void main(String[] args) {
        float var1 = 10f;
        float var2 = var1 / 100;
        if(var2 == 0.1){
            System.out.println("10%입니다.");
        } else {
            System.out.println("10%가 아닙니다.")
        }
    }
}
*/
//float은 0.1이 정확히 아니기 때문에 double형으로 바꿔준다.
public class Main {
    public static void main(String[] args) {
        double var1 = 10;
        double var2 = var1 / 100;
        if(var2 == 0.1){
            System.out.println("10%입니다.");
        } else {
            System.out.println("10%가 아닙니다.");
        }
    }
}