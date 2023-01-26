import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int sum = 0;
        for(int a = 1; a<=b; a++){
            sum += a;
        }
        System.out.println("1~" + b + " 까지의 합은: " + sum);
    }
}

    