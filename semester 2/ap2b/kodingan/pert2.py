import json

jsonfile = open("pert2.json")

data = json.loads(jsonfile.read())

print ("----------------------")

for i in range(len(data)):
    print(f"Nama       : {data[i]['Nama']}")
    print(f"NPM        : {data[i]['NPM']}")
    print(f"Kelas      : {data[i]['Kelas']}")
    print(f"Fakultas   : {data[i]['Fakultas']}")
    print(f"Jurusan    : {data[i]['Jurusan']}")
    print()