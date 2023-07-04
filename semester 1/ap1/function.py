def koi(nama, akhir):
    print("hello ", nama + akhir)

def gege(fck):
    print(fck + " hallo semua")

def kid(**nama):
    print("helllo " + nama["jay"])

def kaito (macam):
    for i in macam:
        print(i)

def hans(lo):
    if (lo > 0):
        resault = lo + hans(lo - 1)
        print(resault)
    else:
        resault = 0
    return resault

def joy (a, b, c):
    hasil = a+b+c
    kurang = a - b -c
    bagi = a/b
    kali = a*c
    return hasil, kurang, bagi, kali


kita = joy(7382, 33, 1)
print(kita)

def ganteng (banget):
    return banget

print(ganteng("jayyy"))


print("hallo")
hans(4)

hewan = ["ayam", "kuda", "sapi"]
kaito(hewan)
koi(89, 733)
gege("cuy")
kid(jay = "karin")
