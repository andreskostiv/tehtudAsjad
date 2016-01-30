package OOP_Pommitamine2;

import java.util.Arrays;
import java.util.Random;

public class Laev {
    private int laevaPikkus;
    private int[] kordinaadid;
    // himmikust


    public Laev (int pikkus, int lauaServaPikkus) {
        laevaPikkus = pikkus;
        genereeriKoordinaadid(lauaServaPikkus);

    }

    private void genereeriKoordinaadid(int lauaServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(lauaServaPikkus);
        int y = rand.nextInt(lauaServaPikkus);
        kordinaadid = new int[]{x, y};
        System.out.println(Arrays.toString(kordinaadid));




    }
}
