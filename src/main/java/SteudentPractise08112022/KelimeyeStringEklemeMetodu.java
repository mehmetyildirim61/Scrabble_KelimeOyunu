package SteudentPractise08112022;

import java.util.Scanner;

public class KelimeyeStringEklemeMetodu {
    static String sonKelime;

    static String sonKelime(String ilkKelime, String ek) {

        Scanner scan = new Scanner(System.in);
        System.out.println(ek + " ekini kelimenin bas kismina mi, yoksa son kismina mi ekleyeceksiniz?\nBas kisim icin 'B', son kisim icin 'S' yazin");
        char basMiSonMu = scan.next().toUpperCase().charAt(0);
        if (basMiSonMu == 'B') {
            sonKelime = ek + ilkKelime;

        } else if (basMiSonMu == 'S') {
            sonKelime = ilkKelime + ek;

        } else {
            System.out.println("Cevabinizi 'B' veya 'S' olarak giriniz");
            sonKelime(ilkKelime, ek);
        }
        return sonKelime;
    }
}

