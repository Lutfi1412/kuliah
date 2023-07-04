import java.io.*;
import java.util.*;

public class pert7_4 {
    public static void main(String[] args) {
        // DEKLARASI OBJEK
        MyFile fileku = new MyFile();
        Scanner input = new Scanner(System.in);
        // INPUT NAMA FILE
        System.out.println("Nama filenya mau apa? ");
        String namaFile = input.nextLine();
        // PATH FILE
        String path = "./file 9/";
        File f = new File(path, namaFile);
        // MEMANGGIL OBJEK UNTUK MEMBUAT FILE
        fileku.MakeFile(f);
        // LOOPPING ISI FILE
        boolean jalan = true;
        while (jalan) {
            System.out.println("\nMasukan Isi Text : ");
            String isi = input.nextLine();

            fileku.WriteFile(f, isi);

            System.out.println("Mau nambah Text? (y/n) : ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                jalan = false;
                break;
            }
        }
        fileku.ReadFile(f);
    }
}

class MyFile {
    public void MakeFile(File f) {
        try {
            f.createNewFile();
        } catch (IOException err) {
            System.out.println("Gagal membuat : " + err.getMessage());
        }
    }

    public void WriteFile(File f, String isi) {
        try {
            FileWriter tulis = new FileWriter(f, true);
            tulis.write(isi + "\n");
            tulis.close();
        } catch (IOException err) {
            System.out.println("Gagal Menulis : " + err.getMessage());
        }
    }

    public void ReadFile(File f) {
        try {
            BufferedReader baca = new BufferedReader(new FileReader(f));
            String IsiFile;

            while ((IsiFile = baca.readLine()) != null) {
                System.out.println(IsiFile);
            }

            baca.close();
        } catch (IOException err) {
            System.out.println("Gagal membaca : " + err.getMessage());
        }
    }
}