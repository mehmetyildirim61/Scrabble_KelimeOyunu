package SteudentPractise08112022;

import java.util.Scanner;

import static SteudentPractise08112022.OyunDongusuMetodu.*;

public class ScrabbleRunner {

    static String kelime;
    static String name1;
    static String name2;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. Oyuncunun adini giriniz");
        String name1 = input.nextLine().toUpperCase();
        System.out.println("2. Oyuncunun adini giriniz");
        String name2 = input.nextLine().toUpperCase();

        System.out.println(name1 + ", oyunu baslatmak icin bir kelime giriniz");
        kelime = input.next().toUpperCase();
        System.out.println(kelime);

        oyunDongusu(name1, name2, kelime);

        System.out.println(name1 + ": " + puan1);
        System.out.println(name2 + ": " + puan2);
        if (puan1 > puan2) {
            System.out.println(name1 + " oyunu kazandi");
        } else if (puan2 > puan1) {
            System.out.println(name2 + " oyunu kazandi");
        } else {
            System.out.println("oyun berabere bitti");
        }
    }
}




