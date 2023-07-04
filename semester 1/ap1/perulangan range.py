def ribet():
    data = int(input("masukan jumlah bintang : "))
    data2 = int(input("masukan akhir : "))
    data3 = int(input("masukan keliapatan : "))
    for i in range(data, data2, data3):
        for j in range(i):
            print('*', end = '')
        print()
def piramida ():
     data = int(input("masukan jumlah bintang : "))
     for i in range (data):
        for j in range(i + 1 ):
            print('*', end = '')
        print()
def main ():
    piramida()
main()

