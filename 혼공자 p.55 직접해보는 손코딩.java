public class Main {
    public static void main(String[] args){
        int v1 = 15;
        if(v1>10){
            int v2;
            v2 = v1 - 10;
        }
        int total = v1 + v2 + 5; //로컬변수로 선언된 v2는 if 중괄호 안에만 있을 수 있기 때문에
        //메모리 삭제가 되어 오류 발생
    }
}
