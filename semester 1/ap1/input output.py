def biodata():
    print ("    PROGRAM BIODTA MAHASISWA       ")
    print("------------------------------")
    nama = input("Masukan nama : ")
    kelas = input("Masukan kelas : ")
    npm = int(input("Inputkan NPM anda : "))
    print("------------------------------")
    print("Nama anda adalah : ",nama)
    print("kelas anda adalah : ",kelas)
    print("NPM anda adalah : ",npm)

def lingkaran():
    print("PROGRAM MENGHITUNG LUAS LINGKARAN")
    print("------------------------------")
    phi = 3.14
    jari = int(input("Masukan jari jari lingkaran : "))
    luas = phi * jari * jari
    print("------------------------------")
    print(f'Luas lingkaran adalah : {luas:.2f} cm2')

def main ():
    print("------------------------------")
    print("          ACTIVITY 2")
    print("------------------------------")
    biodata()
    print("------------------------------")
    lingkaran()

main()