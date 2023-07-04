#latihan menulis modul
def modul():
    file = open('lutfi.txt' , 'w')
    nama = input("masukan nama kamu : ")
    kelas = input("masukan kelas kamu : ")
    nomor = int(input("masukan nomor kesukaan kamu : "))
    makan = input("masukan makanan kesukaan kamu : ")

    file.write(nama + '\n')
    file.write(kelas + '\n')
    file.write(str(nomor) + '\n')
    file.write(makan + '\n')
    file.close()
    print("data berhasil ditulis")
    print()
def tambah():
    file = open('lutfi.txt' , 'a')
    ang = int(input("masukan angka 1 : "))
    ang2 = int(input("masukan angka 1 : "))

    file.write(str(ang) + '\n')
    file.write(str(ang2) + '\n')
    print("data di tambah")
    file.close()
def baca():
    file=open ('lutfi.txt','r')
    nt=file.read()
    print(nt)
    file.close()

#tinggal tambahin main

#latihan pertemuan 7
class lingkaran ():
    def ling(self, jari):
        return 3.14*(jari**2)
class persegi ():
    def persegi1(self):
        self.sisi = int(input("masukan sisi 1 : "))
        self.sisi2 = int(input("masukan sisi 2 : "))
    def pers (self):
        self.hasi0 = (self.sisi * self.sisi2)
class perjang (persegi):
    def perjang1 (self):
        self.hasil5 = (self.sisi * self.sisi2 * 0.5)
def menu():
    print("program menghitung")
    print("1. lingkaran")
    print("2. persegi")
    print("3. persegi panjang")
while 1:
    pilih = int (input("masukan pilihan kamu : "))
    if pilih == 1 :
        hasil1 = lingkaran()
        jari = int(input("masukan jari : "))
        print("luas lingkaran adalah : ",hasil1.ling(jari))
    elif pilih == 2:
        hasil2=persegi()
        hasil2.persegi1()
        hasil2.pers()
        print("luas persegi adalah : ",hasil2.hasi0)
    elif pilih == 3:
        hasil3=perjang()
        hasil3.persegi1()
        hasil3.perjang1()
        print("luas persegi panjang adalah : ", hasil3.hasil5)
    else:
        print("pilihan mu tidak ada mau balkk ? [Y/t]")
        coba = input().upper()
        if coba == "Y":
            menu()
        else:
            break

#tambahin menu()
#latihan modul
import persegi
import segitiga

def ayam ():
    print("perhitungan modul")
    print()
    print("1. luas persegi")
    print("2. keliling persegi")
    print("3. luas segitiga")
def ikan ():
    while 1 :
        pilih = int(input("masukan  pilihan : "))
        if pilih == 1:
            sisi1 = int (input(("masukan sisi1 : ")))
            print("luas persegi : ", persegi.luas(sisi1))
            ayam()
        elif pilih == 3:
            alas = float(input("masukan alas : "))
            tinggi = float(input("masukan tinggi : "))
            print("luas segitiga adalah : ", segitiga.luas(alas, tinggi))
            ayam()
        else :
            break
def kucing():
    print ("hay")
kucing()
#list
fulllist = []
genap= []
ganjil= []
data = int(input("masukan jumlah perulangan : "))
for a in range (data):
    lala = int(input("masukan angka angka nya : "))
    fulllist.append(lala)
for j in range(data):
    if (fulllist[j]%2==0):
        genap.append(fulllist[j])
    else:
        ganjil.append(fulllist[j])

print("full list adalah ",fulllist)
print("genap adalah ",genap)
print("ganjil adalah ",ganjil)

