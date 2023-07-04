import java.util.Scanner;
public class La1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("operator aritmatika dan bitwase");

        System.out.println("masukan bilangan pertama : ");
        int angka1 = input.nextInt();
        
        System.out.println("masukan bilangan kedua : ");
        int angka2 = input.nextInt();

        
        int tambah, kurang, kali, bagi, sisabagi,
        and, or, xor, shiftkanan, shiftkanan2,
        shiftkiri, shiftkiri2, negasi, negasi2, shiftkanansign, shiftkanansign2;

        tambah = angka1 + angka2;
        kurang = angka1 - angka2;
        kali = angka1 * angka2;
        bagi = angka1 / angka2;
        sisabagi = angka1 % angka2;
        and = angka1 & angka2;
        or = angka1 | angka2;
        xor = angka1 ^ angka2;
        shiftkiri = angka1 << 1;
        shiftkiri2 = angka2 << 1;
        shiftkanan  = angka1 >> 1;
        shiftkanan2 = angka2 >> 1;
        negasi = ~angka1;
        negasi2 = ~angka2;
        shiftkanansign = angka1 >>> 3;
        shiftkanansign2 = angka2 >>>3;

        System.out.println(" ");
        System.out.println("ini hasil penjumlahannya : "+ tambah);
        System.out.println("ini hasil pengurangannya : "+ kurang);
        System.out.println("ini hasil perkaliannya : "+ kali);
        System.out.println("ini hasil pembagiannya : "+ bagi);
        System.out.println("ini hasil modulusnya : "+ sisabagi);
        System.out.println("ini hasil bitwase AND nya : "+ and);
        System.out.println("ini hasil bitwase OR nya : "+ or);
        System.out.println("ini hasil bitwase XOR nya : "+ xor);
        System.out.println("ini hasil bitwase negasi angka 1 nya : "+ negasi);
        System.out.println("ini hasil bitwase negasi angka 2 nya : "+ negasi2);
        System.out.println("ini hasil bitwase shift kiri angka 1 nya : "+ shiftkiri);
        System.out.println("ini hasil bitwase shift kiri angka 2 nya nya : "+ shiftkiri2);
        System.out.println("ini hasil bitwase shift kanan angka 1 nya : "+ shiftkanan);
        System.out.println("ini hasil bitwase shift kanan angka 2 nya : "+ shiftkanan2);
        System.out.println("ini hasil bitwase shift kanan sign angka 1 nya : "+ shiftkanansign);
        System.out.println("ini hasil bitwase shift kanan sign angka 2 nya : "+ shiftkanansign2);
        
    }
}
