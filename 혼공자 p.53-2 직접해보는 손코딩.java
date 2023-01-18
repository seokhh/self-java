public class Main {
    public static void main(String[] args){
        int x = 5;
        int y = 3;
        System.out.println("x: " + x + ", y: " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + ", y: " + y);
    }
}
