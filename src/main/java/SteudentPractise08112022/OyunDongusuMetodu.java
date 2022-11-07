package SteudentPractise08112022;

import java.util.Scanner;

import static SteudentPractise08112022.KelimeyeStringEklemeMetodu.sonKelime;

public class OyunDongusuMetodu {

    static int puan1 = 0;
    static int puan2 = 0;

    static void oyunDongusu(String name1, String name2, String kelime) {

        System.out.println(name2 + ", " + kelime + " kelimesini kabul ediyor musun? Evet icin 'E'ye, hayir icin herhangi bir tusa basin");
        Scanner scan = new Scanner(System.in);
        char kelimeKabulMu = scan.next().toUpperCase().charAt(0);

        if (kelimeKabulMu == 'E') {
            puan1 += kelime.length();
            System.out.println(name1 + " icin guncel puan: " + puan1);
            System.out.println(name2 + ", oyuna devam etmek istiyor musunuz? Evet icin 'E'ye, hayir icin herhangi bir tusa basin");
            char devamMi = scan.next().toUpperCase().charAt(0);
            if (devamMi == 'E') {
                System.out.println(kelime + " kelimesine ekleyeceginiz eki yaziniz");
                String ek = scan.next().toUpperCase();

                String yeniKelime = sonKelime(kelime, ek);
                System.out.println(name1 + ", " + yeniKelime + " kelimesini kabul ediyor musun? Evet icin 'E'ye, hayir icin herhangi bir tusa basin");
                kelimeKabulMu = scan.next().toUpperCase().charAt(0);
                if (kelimeKabulMu == 'E') {
                    kelime = yeniKelime;
                    puan2 += kelime.length();
                    System.out.println(name2 + " icin guncel puan: " + puan2);
                    System.out.println(name1 + ", oyuna devam etmek istiyor musunuz? Evet icin 'E'ye, hayir icin herhangi bir tusa basin");
                    devamMi = scan.next().toUpperCase().charAt(0);
                    if (devamMi == 'E') {
                        System.out.println(kelime + " kelimesine ekleyeceginiz eki yaziniz");
                        ek = scan.next().toUpperCase();

                        kelime = sonKelime(kelime, ek);
                        oyunDongusu(name1, name2, kelime);
                    }
                }
            }
        }


    }
}
