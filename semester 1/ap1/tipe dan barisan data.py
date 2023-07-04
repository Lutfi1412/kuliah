nolist = []
genap = []
ganjil = []

data = int(input("berapa banyak elemen pada list : "))
for i in range (data):
    lupi = int(input("masukan nilai elemen : "))
    nolist.append(lupi)

for j in range (data):
    if (nolist[j]%2 == 0):
        genap.append(nolist[j])
    else:
        ganjil.append(nolist[j])

print()
print("Elemen elemen dalam list : ",nolist)
print("Elemen ganjil dalam list : ",ganjil)
print("Elemen genap dalam list : ",genap)