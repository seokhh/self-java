package javaprogramming.week7.project;

import java.util.Scanner;

//명품자바프로그래밍 p.241 실습문제 2번
class Grade{
    int math, english, science;
    public Grade(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }
    double average(){
        return ((double)math + english + science )/ 3;
    }
}
public class Practice2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수입력>>");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();


        Grade me = new Grade(math, science, english);
        System.out.println("평균은: "+ me.average());
    }
}
