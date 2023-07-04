def menu():
     print("================================================")
     print("                      menu pilihan")
     print("================================================")
     print("1. Nilai")
     print("2. perulangan")
     print("3. keluar")

def perulangan():
    print('============= perulangan =====================')
    mulai = int(input('masukan awal       : '))
    akhir = int(input('masukan akhir      : '))
    kelipatan = int(input('masukan kelipatan  : '))
    for a in range(mulai, akhir, kelipatan):
        print (a)
    menu()

def nilai():
     print("================================================")
     print("                Nilai Mahasiswa           ")
     print("================================================")
     input("Masukan Nama   : ")
     input("Masukan Kelas  : ")
     input("Masukan NPM    : ")
     uts = int (input("Nilai UTS      : "))
     uas = int (input("Nilai UAS      : "))
     total = (uts+uas)/2
     print("Rata-Rata Nilai", total)
     if total >= 90:
        print("Grade A")
     elif total >= 80:
        print("Grade B")
     elif total >= 70:
        print("Grade C")
     else :
        print("Remidial")
     menu()
menu()

while 1:

    print()
    pilih =int (input("Masukan pilihan = "))

    if pilih == 1:
        nilai()
    elif pilih == 2 :
        perulangan()
    elif pilih == 3:
        print("================================================")
        print("TERIMA KASIH")
        break
    else:
        print ("Maaf pilihan tidak terdaftar")
        print ("coba lagi ? [Y/N]")
        coba = input().upper()
        if coba == "Y":
            menu()
        else:
            print("")
            break

            


        