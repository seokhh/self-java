import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("피보나치 수열을 구할 정수 N을 입력하세요: ");
        int n = scanner.nextInt();

        int i=0;
        while( fibonacci(i)<=n ){
            i++;
        }

        int count = i--;
        for(i=0; i<count; i++){
            System.out.print(fibonacci(i) + ", ");
        }

    }

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }else{
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}

