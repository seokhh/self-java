import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array={{95,86},{83,92,96},{78,83,93,87,88}};
        int sum= 0;
        double avg=0.0;

        int count = 0;
        for (int a=0; a<array.length; a++) {
            for (int b = 0; b < array[a].length; b++){
                sum += array[a][b];
                count++;


            }
        }
        avg = (double) sum/count;

        System.out.println("sum: "+ sum);
        System.out.println("avg: "+ avg);
    }
}