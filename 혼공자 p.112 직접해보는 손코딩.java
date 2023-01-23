import java.util.*;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        int z;

        System.out.println("--------------------");
        x++; // 10 + 1 = 11
        ++x; // 11 + 1 = 12
        System.out.println("x= " + x); // 12

        System.out.println("--------------------");
        y--; // 10 - 1 = 9
        --y; // 9 - 1 = 8
        System.out.println("y= " + y); // 8

        System.out.println("--------------------");
        z = x++;
        System.out.println("z= " + z); // 12 = z
        System.out.println("x= " + x); // 12 + 1 = 13

        System.out.println("--------------------");
        z = ++x;
        System.out.println("z= " + z); // 13 + 1 = 14
        System.out.println("x= " + x); // 13 + 1 = 14

        System.out.println("--------------------");
        z = ++x + y++;
        System.out.println("z= " + z); // 15 + 8 = 23
        System.out.println("x= " + x); // 14 + 1 15
        System.out.println("y= " + y); // 8 + 1 = 9
    }
}

