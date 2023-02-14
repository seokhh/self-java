import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int print1 = 0;

        if(m1 == 0){
            print1 = 0;
        } else if (m1 <= n1){
            print1 = 1;
        } else if(m1 > n1){
            if(m1 % n1 == 0){
                print1 = m1 / n1;
            } else {
                print1 = (m1 /n1) + 1;
            }
        }


        System.out.print(m1 + "\t\t");
        System.out.print(n1 + "\t\t");
        System.out.print(print1);
    }
}