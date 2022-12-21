import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int[] array={1,5,3,8,2};

        for (int a=0; a < array.length; a++) {
            if (max < array[a]){
                max = array[a];
            }
        }
        System.out.println("max: "+ max);
    }
}