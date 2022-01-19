import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int pocetKociek = 0;
    private static int pocetHodov = 0;
    private static ArrayList<Kocka> kocky;
    private static Random random;
    private static int index;
    private static int[][] hody;

    private static void nacitanie(){
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Zadaj pocet kociek");
            pocetKociek = scanner.nextInt();
            if (pocetKociek < 1 || pocetKociek > 1000) System.out.println("zle si zadal");
        } while (pocetKociek < 1 || pocetKociek > 1000);

        for (int i = 0; i < pocetKociek; i++) {
            kocky.add(new Kocka());
        }

        do {
            System.out.println("Zadaj pocet hodov");
            pocetHodov = scanner.nextInt();
            if (pocetHodov < 1 || pocetHodov > 100000) System.out.println("zle si zadal");
        } while (pocetHodov < 1 || pocetHodov > 100000);
    }

    public static void vypis(){
        for (int i = 0; i < pocetKociek; i++) {
            System.out.println("\npocetnost hodov kocky cislo. " + (i+1));
            kocky.get(i).getCount();
        }
    }

    public static void main(String[] args) {
        kocky = new ArrayList<>();
        random = new Random();

        nacitanie();

        hody = new int[pocetHodov][pocetKociek];
        int hod = 0;

        for (int i = 0; i < pocetHodov; i++) {
            for (int j = 0; j < pocetKociek; j++) {
                index = random.nextInt(6);
                hod += index+1;
                kocky.get(j).set(index);
            }
            System.out.print(hod + " ");
            hod = 0;
        }

        vypis();
    }
}
