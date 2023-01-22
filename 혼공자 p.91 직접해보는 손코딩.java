public class Main {
    public static void main(String[] args){
        int value1 = 123;

        System.out.printf("상품의 가격: %d원\n", value1);
        System.out.printf("상품의 가격: %6d원\n", value1);
        System.out.printf("상품의 가격: %-6d원\n", value1);
        System.out.printf("상품의 가격: %06d원\n", value1);

        double area = 3.14159* 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10,area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%1$6d | %2$-10s | %3$10s",1,name,job);
    }
}

