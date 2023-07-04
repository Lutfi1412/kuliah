import random
print('interger acak : ',random.randint(10, 20))
print('interger acak : ',random.random())
print('interger acak : ',random.randrange(10, 90, 5))
a = 30
b = 'umur saya'
c = 'lutfi'
print(b, a)
print('a','b' , 'c' , sep = ', ' ,end=' 3')
print()
print('asep berkata \"hobby saya bermain bola di hari jum\'at besok\"')
print("satu\tdua\ntiga\tempat \\\tlima")
print(f'hallo, saya {c} berumur {a} tahun sekarang dan tahun 2030 umur nya {a + 8} tahun')
harga = 1478900000
print(f'harga barang tersebut adalah : {harga:1,.2f}')
print(f'harga barang tersebut adalah : {harga * 1.1 :20,.2f}')
def sum (no1):
    coba = no1
    return coba
def jay (no2, no3):
    han = no2 + no3
    return han
def main ():
    umur1 = input("masukan nama kamu : ")
    umur2 = int(input("masukan uang kamu : "))
    umur3 = int(input("masukan uang teman kamu : "))
    total = sum(umur1)
    coca = jay(umur2, umur3)
    print('nama kamu adalah',total,'jumlah uang kalian adalah :',coca, 'ribu.')
main()
