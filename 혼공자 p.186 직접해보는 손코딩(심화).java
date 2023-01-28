import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int hunderd = 100;
        for(int i = 0; i<arr.length; i++){
            hunderd -= arr[i];
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("배열의 총합은 " + sum + "입니다.");
        System.out.println("100에서 " + sum + "을 뺀 값은 " + hunderd + "입니다.");
    }
}


