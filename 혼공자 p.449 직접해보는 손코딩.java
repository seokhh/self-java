package Chap10.sec01.exam04;

public class NumberFormatExceptionExample {
    public static void main(String[] args){

        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        System.out.println(value1);

        int value2 = Integer.parseInt(data2); //a는 숫자로 변경이 불가해서 오류 발생
        System.out.println(value2);
    }
}
