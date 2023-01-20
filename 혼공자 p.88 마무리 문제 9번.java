/* var1~var4까지 더해서 int 결과에 9가 저장되도록 코드를 짜시오 */
public class Main {
    public static void main(String[] args){
        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";
        int result = (int) (var1 + var2 + var3) + (int) Double.parseDouble(var4);
        System.out.println(result);
    }
    }

