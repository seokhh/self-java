import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int k = n; k >= 1; k--){
                if(i<k){
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
