package OOP_Pommitamine2;
// fori tekita kordamine

public class Meri {

    // private objekti siseselt kasutada
   private int lauaServaPikkus;
   private Laev[] laevastik = new Laev[5];

    public Meri (int pikkus){
        System.out.println("Konstruktor made");
        lauaServaPikkus = pikkus;
        tekitaLaevastik();

    }

    private void tekitaLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(i+1, lauaServaPikkus);
        }

    }


}
