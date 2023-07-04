import segitiga
import persegi

def menu():
    print('MENU')
    print('1. Luas Segitaga')
    print('2. Keliling Segitiga')
    print('3. Luas persegi')
    print('4. Keliling Persegi')
    print('5. Keluar')

def main():
    while True:
        menu()
        pilihan = int(input('masukan pilihan anda: '))
        if pilihan == 1:
            alas = float(input('masukan alas segitiga: '))
            tinggi = float(input('masukan tinggi segitiga: '))
            print ('luas segitiga adalah ',segitiga.luas(alas, tinggi))
        elif pilihan == 2:
            sisi = float(input('masukan sisi segitiga: '))
            print ('keliling segitiga adalah ',segitiga.keliling(sisi))
        elif pilihan == 3:
            sisi1 = float(input('masukan sisi persegi: '))
            print ('luas persegi adalah ',persegi.luas(sisi1))
        elif pilihan == 4:
            sisi2 = float(input('masukan sisi persegi: '))
            print ('keliling persegi adalah ',persegi.keliling(sisi2))
        elif pilihan == 5:
            print ('Keluar dari program......')
        else:
            print('error : pilihan tidak valid.')
            break
        print()

main()