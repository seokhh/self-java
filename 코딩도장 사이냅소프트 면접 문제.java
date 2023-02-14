import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
        String[] names = input.split(",");

        int count_kim = 0;
        int count_lee = 0;
        int count_ljy = 0;
        ArrayList<String> name_list = new ArrayList<String>();

        for(int i = 0; i < names.length; i++) {
            if(names[i].startsWith("김"))
                count_kim++;
            if(names[i].startsWith("이"))
                count_lee++;
            if(names[i].equals("이재영"))
                count_ljy++;
            if(!name_list.contains(names[i]))
                name_list.add(names[i]);
        }
        String[] name_arr = name_list.toArray(new String[name_list.size()]);

        System.out.println("김 씨: " + count_kim);
        System.out.println("이 씨: " + count_lee);

        System.out.println("이재영 씨: " + count_ljy);

        System.out.println("중복을 제거한 이름: ");
        for(int i = 0; i < name_arr.length; i++)
            System.out.print(name_arr[i] + ((name_arr.length == i + 1)?"\n":", "));

        Arrays.sort(name_arr);
        System.out.println("중복을 제거한 이름을 오름차순으로: ");
        for(int i = 0; i < name_arr.length; i++)
            System.out.print(name_arr[i] + ((name_arr.length == i + 1)?"\n":", "));

    }
}
