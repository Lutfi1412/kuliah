def pertanyaan():
    nanya = input("Apakah Kamu Anime? [Y/N] : ").upper()
    print(nanya)
    nanya2 = input("Apakah Suka Haibara? [Y/N] : ").upper()
    print(nanya2)
    return nanya, nanya2

def main():
    nanya, nanya2 = pertanyaan()
    if nanya == "Y" and nanya2 == "Y":
        print("Kita Temen Banget")
    elif nanya == "Y" and nanya2 == "N" or nanya == "N" and nanya2 == "Y":
        print("Kita Masih Temen Cuy")
    elif nanya == "N" and nanya2 == "N":
        print("G Dulu Bro")
    else:
        print("Masukan Huruf Yang Benar !!!")
        print()
        pertanyaan()
main()
