package selfjava.Chap10.problem.sec02.no4;
/* 출력결과를 예상하여 작성해보시오
10
숫자로 변환할 수 없음.
10
인덱스를 초과했음.
10
인덱스 0에서 value에 10이 대입이 되고 finally에서 출력이 된 후
인덱스 1로 넘어간 후 숫자로 변환할 수 없음이 출력된 후 value에 원래 있던 10이 출력
인덱스 2로 넘어가면 인덱스를 초과했음이 출력 후 value에 원래 있던 10이 출력 후 종료*/
public class TryCatchFinallyExample {
    public static void main(String[] args){
        String[] strarray = {"10", "2a"};
        int value = 0;
        for (int i =0; i<=2; i++){
            try {
                value = Integer.parseInt(strarray[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스를 초과했음.");
            } catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음.");
            } finally {
                System.out.println(value);
            }
        }
    }
}
