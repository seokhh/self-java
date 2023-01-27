import java.util.*;
/* 반지름을 입력받아 원의 넓이를 구하는데 "."를 이용하여 원주율을 얻어 결과를 입력하는 코드를 짜보시오 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1 = 0;
        System.out.print("반지름의 길이: ");
        var1 = sc.nextInt();

        String var2 = "3";
        String var3 = "14";
        double var4 = var1 * var1 * (Double.parseDouble(var2 + "." + var3));
        System.out.println("원의 넓이: "+ var4);
    }
}