package selfjava.Chap10.sec02.exam01;

public class TryCatchFinallyExample {
    public static void main(String[] args){

        /*String str = null;
        System.out.println(str.length());*/

        try {
            Class clazz = Class.forName("java.lang.String2");
            //String2 가 String로 바뀌면 정상 실행이 출력됨.
            System.out.println("정상 실행");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
        //일반예외는 컴파일 오류 발생
    }
}
