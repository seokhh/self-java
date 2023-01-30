import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 정수의 개수를 정하시오: ");
        int a = sc.nextInt();
        int[] array = new int[a];
        long sum = 0;
        for(int i = 0; i<a; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("입력한 정수의 합은 " + sum + "입니다.");
    }
}