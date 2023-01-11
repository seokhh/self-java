public class A {
    class B{}
    static class C {}

    B field1 = new B();
    C field2 = new C();

    void method1(){
        B var1 = new B();
        C var2 = new C();
    }

    //static B field3 = new B(); //컴파일 오류 static 선언은 A가 필요없이 쓸 수 있다는 것이지만
    // B는 A가 있어야해서 오류 발생
    static C field4 = new C();

    static void method2(){
        //B var1 = new B(); //method2는 A가 없이 호출되는데 B는 A가 있어야됨
        C var2 = new C();
    }
}