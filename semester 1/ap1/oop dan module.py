class lingkaran():
    def luasling (self, jari):
        return 3.14*(jari**2)
    
class segitiga:
    def seg (self):
        self.a = int (input("Masukan alas : "))
        self.t = int(input("Masukan tinggi : "))

    def luasseg(self):
        self.hasilseg = (self.a * self.t)/2

class trapesium:
    def intra(coba):
        coba.sisi1 = int(input("Masukan sisi 1 : "))
        coba.sisi2 = int(input("Masukan sisi 2 : "))
        coba.t = int(input("Masukan tinggi : "))

    def luastra(coba):
        coba.hasiltra = ((coba.sisi1+coba.sisi2)*coba.t)/2

class jajar(segitiga):
    def luasjar(self):
        self.hasiljar = self.a * self.t
def menu ():
    print(" ")
    print("========================")
    print("* 1. lingkaran")
    print("* 2. segitiga")
    print("* 3. trapesium")
    print("* 4. jajargenjang")
    print("*************************")

pilih = int(input("masukan pilihan anda : "))
print(" ")
while 1 :
    if pilih == 1:
        print("======menghitung luas lingkaran======")
        hasil1 = lingkaran()
        jari = int(input("masukan jari jari : "))
        print
        print("Luas lingkaran adalah : ", hasil1.luasling(jari))
        menu()
    elif pilih == 2:
        print("======menghitung luas segitiga======")
        hasil2 = segitiga()
        hasil2.seg()
        hasil2.luasseg()
        print
        print("Luas segitiga adalah : ", hasil2.hasilseg)
        menu()
    elif pilih== 3:
        print("======menghitung luas trapesium======")
        hasil3 = trapesium()
        hasil3.intra()
        hasil3.luastra()
        print
        print("Luas trapesium adalah : ",hasil3.hasiltra)
        menu()
    elif pilih == 4:
        print("======menghitung luas jajargenjang======")
        hasil4 = jajar()
        hasil4.seg()
        hasil4.luasjar()
        print
        print("Luas trapesium adalah : ",hasil4.hasiljar)
        menu()
    else:
        print("!!!!!! masukan pilihan yang benar !!!!!!!")
        menu()

nama = input("masukan nama anda : ")
print("hai saya ",nama)
menu()
