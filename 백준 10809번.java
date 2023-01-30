import java.util.*;
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[26];
        for(int i = 0; i<arr.length; i++){
            arr[i] = -1;
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ ch - 'a'] = i;
            }
        }
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}