public class Main {
    public static void main(String[] args){
        int hour = 3;
        int minute = 5;

        System.out.println("현재 시간은 " + hour + "시간" + minute + "분 입니다");

        int totalminute = (hour*60) + minute;
        System.out.println("현재 경과된 시간은 총 " + totalminute + "분 입니다.");
    }
}
