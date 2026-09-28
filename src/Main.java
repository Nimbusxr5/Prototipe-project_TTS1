import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat 5 objek soal bertema Java dan memasukkannya ke dalam Array
        SoalTebakan[] daftarSoal = {
                new SoalTebakan(
                        "scanner",
                        "s...n..r",
                        "Class bawaan Java untuk menerima input dari keyboard"
                ),
                new SoalTebakan(
                        "public",
                        "p....c",
                        "Access modifier agar class atau method bisa diakses dari mana saja"
                ),
                new SoalTebakan(
                        "string",
                        "s....g",
                        "Tipe data yang digunakan untuk menyimpan teks atau kalimat"
                ),
                new SoalTebakan(
                        "boolean",
                        "b.....n",
                        "Tipe data yang hanya memiliki dua nilai: true atau false"
                ),
                new SoalTebakan(
                        "method",
                        "m....d",
                        "Blok kode yang menjalankan tugas tertentu, biasa disebut juga fungsi"
                )
        };

        System.out.println("=== KUIS TEBAK KATA: PEMROGRAMAN JAVA ===");

        // Looping (perulangan) untuk memunculkan soal satu per satu
        for (int i = 0; i < daftarSoal.length; i++) {
            System.out.println("\n===== SOAL " + (i + 1) + " =====");

            // Menampilkan petunjuk dan kata rumpang
            daftarSoal[i].tampilkanSoal();

            // Meminta input user
            System.out.print("Masukkan jawaban: ");
            String jawaban = input.nextLine();

            // Mengecek jawaban
            if (daftarSoal[i].cekTebakan(jawaban)) {
                System.out.println("Jawaban benar!");
            } else {
                daftarSoal[i].bukaHuruf();
            }
        }

        System.out.println("\n=== KUIS SELESAI! ===");
        input.close();
    }
}