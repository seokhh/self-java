package selfjava.Chap10.sec02.exam05;

public class ThrowsExample {
    public static void main(String[] args) throws ClassNotFoundException {
        findClass();
    }

    public static void findClass() throws ClassNotFoundException{
        Class clazz = Class.forName("java.lang.String2");
    }
}
