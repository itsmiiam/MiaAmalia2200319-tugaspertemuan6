package soal1_pert6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Segitiga> listSegitiga = new ArrayList<>();

        char lanjut;

        do {
            System.out.println("Masukkan nilai alas segitiga:");
            double alas = scanner.nextDouble();

            System.out.println("Masukkan nilai tinggi segitiga:");
            double tinggi = scanner.nextDouble();

            System.out.println("Masukkan nilai sisi segitiga:");
            double sisi = scanner.nextDouble();

            Segitiga segitiga = new Segitiga(alas, tinggi, sisi);
            listSegitiga.add(segitiga);

            System.out.println("Apakah Anda ingin membuat segitiga lain? (y/n)");
            lanjut = scanner.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');

        for (int i = 0; i < listSegitiga.size(); i++) {
            Segitiga segitiga = listSegitiga.get(i);
            System.out.println("Data Segitiga ke-" + (i + 1));
            System.out.println("Alas: " + segitiga.getAlas());
            System.out.println("Tinggi: " + segitiga.getTinggi());
            System.out.println("Sisi: " + segitiga.getSisi());

            segitiga.getLuasSegitiga();

            segitiga.getKelilingSegitiga();
        }

        scanner.close();
    }
}
