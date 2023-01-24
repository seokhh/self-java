import java.util.*;

public class Main {
    public static void main(String[] args) {
        int v1 = 1;
        double v2 = 1.0;
        System.out.println(v1 == v2);

        double v3 = 0.1;
        float v4 = 0.1f;
        System.out.println(v3 == v4); //flase인 이유는 float은 소수점 아래를 정확히 표현할 수 없어서 완벽한 0.1이 아니라 값이 다르기 때문
        System.out.println((float)v3 == v4);
    }
}

