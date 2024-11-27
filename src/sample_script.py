import requests

def get_website():
    response = requests.get('https://www.example.com')
    return response.status_code

print(get_website())
