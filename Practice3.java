package javaprogramming.week7.project;
//명품자바프로그래밍 p.242 실습문제 3번
class Song{
    String title, artist, country;
    int year;
    Song(String title, String artist, String country, int year){
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }
    Song(){
        this("title","artist", "country",0000);
    }
    void show(){
        System.out.println(year+ "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
}
public class Practice3 {
    public static void main(String[] args){
        Song song = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
        song.show();
    }
}
