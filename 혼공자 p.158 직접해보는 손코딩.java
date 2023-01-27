import java.util.*;

public class Main {
    public static void main(String[] args) {
        Outter:
        for(char upper='A'; upper<='z'; upper++){
            for (char lower ='a'; lower<='z'; lower++){
                System.out.println(upper + "-" + lower);
                if(lower=='g'){
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}

