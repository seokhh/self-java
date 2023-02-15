public class Main {
    public static void main(String[] args) {
        int minute3 = 0;

        for(int h = 0; h < 24; h++){
            if(h == 3 || h == 13 || h == 23){
                minute3+=60;
                continue;
            } else for(int m_10 = 0; m_10 < 6; m_10++){
                if(m_10 == 3){
                    minute3+= 10;
                    continue;
                } else minute3++;
            }
        }

        System.out.println(minute3*60);
    }
}
