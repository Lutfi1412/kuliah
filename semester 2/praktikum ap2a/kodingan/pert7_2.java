import java.io.*;;

public class pert7_2 {
    public static void main(String[] args) {
        // String path = "C:\\Users\\sawal
        // fitah\\Documents\\punyalupi\\file2\\praktikumap2a\\file 7";
        String path = "./file 9/";
        File f = new File(path, "jay2.txt");
        try {
            PrintWriter tulis = new PrintWriter(f);
            tulis.println("Aku GG");
            // tulis.println();
            tulis.write("Kamu cupu");
            tulis.close();
        } catch (IOException err) {
            System.out.println("Error messege : " + err.getMessage());
        }
    }
}
