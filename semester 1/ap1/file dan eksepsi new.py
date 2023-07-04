def menulisdata():
    file = open ('lutfi.txt', 'w')

    print('-----menulis data-----')
    nama = input('masukan nama : ')
    kelas = input('masukan kelas : ')
    npm = int(input('masukan NPM : '))
    hobi = input('masukan hobby : ')
    makan = input('masukan makanan kesukaan : ')
    cita = input('masukan cita - cita : ')

    file.write(nama + '\n')
    file.write(kelas + '\n')
    file.write(str(npm) + '\n')
    file.write(hobi + '\n')
    file.write(makan + '\n')
    file.write(cita + '\n')

    file.close()
    print('\n')
    print('data berhasil ditulis  ')
    print('----------------------------\n')

def bacadata():
    file = open('lutfi.txt', 'r')

    isi = file.read()
    print('-----baca data-----')
    print (isi)
    file.close()
    print('data berhasil dibaca\n')

def tambahan():
    file = open('lutfi.txt', 'a')

    print('---Tambah data---')
    angka1 = int(input('masukan angka 1 : '))
    angka2 = int(input('masukan angka 2 : '))
    angka3 = int(input('masukan angka 3 : '))
    angka4 = int(input('masukan angka 4 : '))
    angka5 = int(input('masukan angka 5 : '))

    file.write(str(angka1) + '\n')
    file.write(str(angka2) + '\n')
    file.write(str(angka3) + '\n')
    file.write(str(angka4) + '\n')
    file.write(str(angka5) + '\n')

    file.close()
    print('\n')
    print('data berhasil ditambahkan\n')

def main():
    menulisdata()
    tambahan()
    bacadata()

main()
