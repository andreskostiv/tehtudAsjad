package EksamiKordamine;

import java.util.Scanner;

public class esimene {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mis on sinu nimi");
        String nimi = sc.nextLine();
        System.out.println("Mis on sinu vanus");
        int vanus = sc.nextInt();
        System.out.printf("sinu vanus on %s ja vanus %d", nimi, vanus);

    }
}
