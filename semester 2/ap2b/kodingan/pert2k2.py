import json

datajason =  {
    "profiles":[
    {
        "Nama": "Lutfi Robbani",
        "NPM": "50422818",
        "Kelas": "1IA24",
        "Fakultas": "Teknik Industri",
        "Jurusan": "Teknik Informatika"
    },
    {
        "Nama": "Dhimas febrianto",
        "NPM": "6969969",
        "Kelas": "1IA24",
        "Fakultas": "Teknik Industri",
        "Jurusan": "Teknik Informatika"
    },
    {
        "Nama": "Julius cesar butar butar",
        "NPM": "3102420",
        "Kelas": "1IA24",
        "Fakultas": "Teknik Industri",
        "Jurusan": "Teknik Informatika"
    }
]
    }

result = json.dumps(datajason, indent=3)
print(result)