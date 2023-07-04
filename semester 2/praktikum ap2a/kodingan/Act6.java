public class Act6 {
    public static void main(String[] args) {
        mahasiswa lutfi = new mahasiswa("Lutfi Robbani", "1IA24", " 50422818", 100, 60);

        lutfi.biodata();

        lutfi.nilai();
        lutfi.akhir();
    }

}

class mahasiswa {
    String nama, kelas, npm;
    int uts, uas, hasil;

    mahasiswa(String nama, String kelas, String npm, int uts, int uas) {
        this.nama = nama;
        this.kelas = kelas;
        this.npm = npm;
        this.uts = uts;
        this.uas = uas;
    }

    public void akhir() {
        hasil = (this.uts + this.uas) / 2;
    }

    void biodata() {
        System.out.println("=== Biodata ===");
        System.out.println("Nama : " + this.nama);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("NPM : " + this.npm);
    }

    void nilai() {
        System.out.println("nilai uts : " + this.uts);
        System.out.println("nilai uas : " + this.uas);
        System.out.println("nilai akhir : " + hasil);

    }
}