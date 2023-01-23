public class Main {
    public static void main(String[] args) throws Exception{
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

       /* keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
        원래 엔터는 13과 10이라고 읽혀지지만 인텔리전스에선 10밖에 읽지 못하나봄*/
    }
}

