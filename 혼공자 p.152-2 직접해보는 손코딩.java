import java.util.*;

public class Main {
    public static void main(String[] args) {
        for(float a = 0.1f; a<=1.0f; a+=0.1f){
            System.out.println(a);
        }//a에 0.1이 정확히 추가되는것이 아니라 1.0이 나오질 않음 (부동소수점 방식 때문)
    }
}

