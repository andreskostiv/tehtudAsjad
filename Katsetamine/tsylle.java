package Katsetamine;

public class tsylle {

    String kana;

    public static void main(String[] args) {

        prindi();

}

    private static void prindi(){

        String[] kana = {"oled vahva mees","kaks"};

        int suurus = kana.length;

        for (int i = 0; i < suurus ; i++) {

            System.out.println(kana[i]);
        }

    }


}

