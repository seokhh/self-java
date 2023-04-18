package javaprogramming.week7.project;
//명품자바프로그래밍 p.241 실습문제 1번
class TV{
    String model;
    int year, inch;
    public TV(String model, int year, int inch){
        this.model = model;
        this.year = year;
        this.inch = inch;
    }
    void show(){
        System.out.println(model + "에서 만든 " + year+"년형 " + inch + "인치 TV");
    }
}
public class Practice1 {
    public static void main(String[] args){
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}