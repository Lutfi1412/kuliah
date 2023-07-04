import java.util.Scanner;
public class himpunan {
    Scanner input = new Scanner(System.in);
    int[] himpunanA = new int[100];
    int[] himpunanB = new int [100];
    int jumlahAnggotaA, jumlahAnggotaB;

    public void dataAnggota(){
        System.out.println("masukan banyak himpunan anggota A : ");
        jumlahAnggotaA = input.nextInt();
        System.out.println("Anggota himpunan A");
        for(int i=1; i<=jumlahAnggotaA; i++){
            System.out.print("Anggota "+i+" : ");
            himpunanA[i] = input.nextInt();
        }
        System.out.print("masukan banyak anggota himpuanan B : ");
        jumlahAnggotaB = input.nextInt();
        System.out.println("Anggota himpunan B");
        for(int i=1; i<=jumlahAnggotaB; i++){
            System.out.print("anggota "+i+" : ");
            himpunanB[i] = input.nextInt();
        }
    }
    public void tampilAnggota(){
        System.out.print("anggota himpunan A = { ");
        for(int i=1; i<=jumlahAnggotaA; i++){
            System.out.print(himpunanA[i]+" ");
        }
        System.out.println("}");
        System.out.print("Anggota himpunan B = { ");
        for(int i=1; i<=jumlahAnggotaB; i++){
            System.out.print(himpunanB[i]+"   ");
        }
        System.out.println("}");
    }
    public void himpunanGabungan(){
        System.out.print("himpunan gabungan A U B : { ");
        for(int i=1; i<=jumlahAnggotaA; i++){
            System.out.print(himpunanA[i]+"       ");
        }
        for(int i=1; i<=jumlahAnggotaB; i++){
            boolean adaSama = false;
            for(int j=1; j<=jumlahAnggotaA; j++){
                if(himpunanB[i]==himpunanA[j])
                adaSama=true;
            }
            if (adaSama==false){
                System.out.print(himpunanB[i]+"     ");
            }
        }
        System.out.println("}");
    }
    public void himpunanIrisan(){
        System.out.print("Himpunan irisan A n B : { ");
        for(int i=1; i<=jumlahAnggotaA; i++){
            boolean adaSama = false;
            for(int j=1; j<=jumlahAnggotaA; j++){
                if(himpunanB[i]==himpunanA[j])
                adaSama=true;
            }
            if(adaSama==true){
                System.out.print(himpunanB[i]+"     ");
            }
        }
        System.out.println(" }");
    }
    public static void main(String args[]) {
    himpunan bilangan = new himpunan();
    bilangan.dataAnggota();
    bilangan.himpunanGabungan();
    bilangan.himpunanIrisan();
   }
}
