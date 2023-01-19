public class Main {
    public static void main(String[] args){
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        /*byte var6 = 128;  바이트는 127까지 밖에 저장이 안돼서 오류 발생*/

        long var6 = 10;
        long var7 = 2000000000;
        long var8 = 20000000000L; //자바는 int라고 인식하기 때문에 오류 발생하기때문에 L을 붙여줌으로써
        // long 타입이란걸 알려줌

        System.out.println("var1: "+ var1);
        System.out.println("var2: "+ var2);
        System.out.println("var3: "+ var3);
        System.out.println("var4: "+ var4);
        System.out.println("var5: "+ var5);
        System.out.println("var6: "+ var6);
        System.out.println("var7: "+ var7);
        System.out.println("var8: "+ var8);


    }
}
