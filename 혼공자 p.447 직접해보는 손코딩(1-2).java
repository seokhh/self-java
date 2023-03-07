package Chap10.sec01.exam02;

public class ArrayIndexOutofBoundsExceptionExample {
    public static void main(String[] args){
        int[] arr = {1,2,3};

        int result = arr[0] + arr[2];

        String data1 = args[0];
        String data2 = args[1];

        System.out.println(data1);
        System.out.println(data2);
    }
}
