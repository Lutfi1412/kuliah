import requests


class ResponseData():
    def __init__(self, response):
        self.lema = response["lema"]
        self.arti = response["arti"]

while True:
    key = input("Input keyword: ")
    response = requests.get("https://kbbi-api-zhirrr.vercel.app/api/kbbi?text=" + key)
    print(response.json())    
    if response.status_code == 200:

        data = ResponseData(response.json())
        print(data.lema)
        for arti in data.arti:
            print(arti)
    else:
        print("No data")