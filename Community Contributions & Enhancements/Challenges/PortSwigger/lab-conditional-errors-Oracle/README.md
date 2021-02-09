Multithreaded solution for the boolean based blind Oracle sql injection [challange](https://portswigger.net/web-security/sql-injection/blind/lab-conditional-errors) of portswigger labs.

Since the OSWE exam focuses on sqli exploitation also I thought this would be good practice to make a multithreaded script for it. 

Script works by first calling `login()` function which gets the session cookies since thats the injectino point. 

Rather then writing a parser for the response headers and using the cookies from there a better way is to use `s = requests.Session()` and then access cookies using `s.cookies['cookieName']` 


### How to use
Just give the challange URL to the script and you'll be given the administrator's password

```python

python lab-conditional-errors.py https://acaf1fc01f0db1fe803635d900bc00f1.web-security-academy.net/
[*] Got Tracking Cookie: Ikc52pc6L4r7Xxi4
--------------------

Result :: et45s2ytyprf8ncumahu
``` 

#### Links
- https://portswigger.net/web-security/sql-injection/blind/lab-conditional-errors