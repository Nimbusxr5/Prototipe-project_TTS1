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

        // --- TAMBAHAN UNTUK SISTEM NILAI ---
        int skorTotal = 0;
        int jumlahBenar = 0;
        int jumlahSalah = 0;
        // -----------------------------------

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

                // --- UPDATE NILAI JIKA BENAR ---
                skorTotal += 20;  // Tambah 20 poin
                jumlahBenar++;    // Tambah 1 ke hitungan jawaban benar

            } else {
                daftarSoal[i].bukaHuruf();

                // --- UPDATE NILAI JIKA SALAH ---
                jumlahSalah++;    // Tambah 1 ke hitungan jawaban salah
            }
        }

        System.out.println("\n===========================");
        System.out.println("===    KUIS SELESAI!    ===");
        System.out.println("===========================");

        // --- MENAMPILKAN HASIL AKHIR ---
        System.out.println("Jawaban Benar : " + jumlahBenar);
        System.out.println("Jawaban Salah : " + jumlahSalah);
        System.out.println("SKOR AKHIR    : " + skorTotal + " / 100");

        // --- TAMBAHAN OPSIONAL: PESAN BERDASARKAN SKOR ---
        if (skorTotal == 100) {
            System.out.println("Pesan: Luar Biasa! Anda sangat menguasai dasar Java!");
        } else if (skorTotal >= 60) {
            System.out.println("Pesan: Kerja bagus! Terus tingkatkan belajar Anda.");
        } else {
            System.out.println("Pesan: Jangan menyerah! Coba pelajari lagi materinya.");
        }

        input.close();
    }
}