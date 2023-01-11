public class A {
    int field1;
    void method1(){}
    
    static int field2;
    static void method2(){}
    
    class  B{
        void method(){
            field1 = 10;
            method1();
            
            field2 = 10;
            method2();
        }
    }
    
    static class C{
        void method(){
            //field1 = 10; //A 객체 없이 C 호출을 할 수 있지만 
            //인스턴스 필드는 A가 있어야해서 오류 발생
           //method1(); //위와 동일하게 인스턴스 메서드는 A가 있어야해서 오류 발생

            field2 = 10;
            method2();
        }
    }
}