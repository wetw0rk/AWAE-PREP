# XSS and MySQL (NO SQLMAP ALLOWED)

This exercise details the exploitation of an XSS vulnerability in a PHP based application and how an attacker can leverage it to gain access to administrative pages; from there leveraging a SQL injection vulnerability to gain full code execution.

## Personal Note

It's important you understand how this attack works and the importance of weaponization, in a real scenarion many companies may be running this application and you want to have an exploit you can just launch. In the AWAE we will likely be chaining bugs to get Pre-auth RCE this is a perfect example to practice this skill. I went ahead and used JavaScript, but the exploit can be automated further using python to POST the comment. Feel free to use my POC however I reccomend you don't cheat and develop it on your own. Best of luck 😄!

## Links

- https://pentesterlab.com/exercises/xss_and_mysql_file/course
- https://pentesterlab.com/exercises/xss_and_mysql_file/iso
