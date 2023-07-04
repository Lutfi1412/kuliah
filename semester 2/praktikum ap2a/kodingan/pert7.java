import java.io.*;;

public class pert7 {
    public static void main(String[] args) {
        // String path = "C:\\Users\\sawal
        // fitah\\Documents\\punyalupi\\file2\\praktikumap2a\\file 7";
        String path = "./file 9/";
        File f = new File(path, "jay.txt");
        try {
            FileWriter tulis = new FileWriter(f);
            tulis.write("Aku GG\n");
            tulis.write("Kamu cupu");
            tulis.close();
        } catch (IOException err) {
            System.out.println("Error messege : " + err.getMessage());
        }
    }
}
