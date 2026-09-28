public class SoalTebakan {

    // Atribut
    private String kataKunci;
    private String kataTampil;
    private String clueSoal;
    private boolean statusTerjawab;

    // Constructor
    public SoalTebakan(String kunci, String tampil, String clue) {
        this.kataKunci = kunci;
        this.kataTampil = tampil;
        this.clueSoal = clue;
        this.statusTerjawab = false;
    }

    // Menampilkan soal
    public void tampilkanSoal() {
        System.out.println("Clue  : " + clueSoal);
        System.out.println("Kata  : " + kataTampil);
    }

    // Mengecek jawaban
    public boolean cekTebakan(String tebakan) {
        if (tebakan.equalsIgnoreCase(kataKunci)) {
            statusTerjawab = true;
            return true;
        }

        return false;
    }

    // Membuka huruf
    public void bukaHuruf() {
        System.out.println("Salah! Coba perhatikan petunjuknya lagi.");
    }
}