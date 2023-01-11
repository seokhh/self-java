public class Outter {
    public void method(int arg){
        int localVariable = 1;

        //arg = 100;// final 특성을 가지는 매개변수를 바꿀려해서 오류 발생
        //localVariable = 100; // 위와 똑같은 이유
        class Inner{
            void method(){
                int reuslt = arg + localVariable;
            }
        }
    }
}