import java.io.*;

public class pert7_3 {
    public static void main(String[] args) {
        String path = "./file 9/";
        File f = new File(path, "jay.txt");

        try {
            BufferedReader baca = new BufferedReader(new FileReader(f));
            String isifile;

            while ((isifile = baca.readLine()) != null) {
                System.out.println(isifile);
            }
            baca.close();
        } catch (IOException err) {
            System.out.println("Error Messege : " + err.getMessage());
        }
    }
}
