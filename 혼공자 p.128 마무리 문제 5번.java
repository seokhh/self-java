import java.util.*;
/*주석 처리된 코드의 값은 4이다. 값이 5가 나오게 바꿔보시오
public class Main {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        double var3 = var1 / var2;
        int var4 = (int) (var3*var2);
        System.out.println(var4);
    }
}*/
public class Main {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 / var2; //5 나누기 2는 2.5지만 자바에선 실수형으로 표현해주지 않으면 소수점 뒷자리는 없어지기 때문에 실수형으로 만들어줘야 함.
        int var4 = (int) (var3*var2);
        System.out.println(var4);
    }
}