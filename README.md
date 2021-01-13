# AWAE PREP Layout

This repository will serve as the "master" repo containing all trainings and tutorials done in preparation for OSWE in conjunction with the AWAE course. This repo will likely contain custom code by me and various courses. Below you can see in what order I completed these challenges / courses.

## Prep Breakdown

The following table shows notes, courses, challenges, and tutorials taken in preparation for the AWAE.

| Order | Name | Type | Link |
|--- | --- | --- | --- |
| 1 | JavaScript For Pentesters | Course | https://www.pentesteracademy.com/course?id=11 |
| 2 | Edabit (Javascript, Java, PHP) | Challenges | https://edabit.com/ |
| 3 | Simple Object Oriented Language Examples | Notes | N/A (I just wrote simple templates)
| 4 | From SQL Injection to Shell | Tutorial | https://pentesterlab.com/exercises/from_sqli_to_shell/ |
| 5 | XSS and MySQL | Challenge | https://www.vulnhub.com/entry/pentester-lab-xss-and-mysql-file,66/ |
| 6 | Understanding PHP Object Injection | Tutorial | https://securitycafe.ro/2015/01/05/understanding-php-object-injection/ |
| 7 | /dev/random: Pipe | Challenge | https://www.vulnhub.com/entry/devrandom-pipe,124/ |
| 8 | Understanding Java Deserialization | Tutorial | https://nytrosecurity.com/2018/05/30/understanding-java-deserialization/
| 9 | Practicing Java Deserialization Exploits | Challenge/Tutorial | https://diablohorn.com/2017/09/09/understanding-practicing-java-deserialization-exploits/ |
| 10 | SQL Injection Attacks and Defense | Book | https://www.amazon.com/Injection-Attacks-Defense-Justin-Clarke/dp/1597499633 |

## Post Prep Breakdown

Having completed the course, below is everything done in regards to prep before the exam. If you have not taken the AWAE and are considering taking it definitely do everything shown above, and read the source! I have provided README's in each directory and source code so you can see what I did. I cannot share extra miles .... so those will not be within the repository. Best of luck!

- Complete all extra miles! I know some are harder than others but push through (one took me 8 days alone).
- Be comfortable using every debugger shown within the course.
- Understand Object Oriented Languages taught throughout the course. No need to be a master in each language, but be able to code something fast using existing libs.
- Be comfortable crafting a full POC (as done throughout the entire course)
- Look for vulnerabilities ;)

This may not seem like much, but it's what I did for prep. My best advice is DO NOT OVERTHINK things and don't rush through it. It took me 2 attempts when it should have taken one, I was jumping around not documenting enough what I was trying (It's easy to create your own rabbit holes...). Slow down you have 48 hours!

## Report prep

[Offensive Security Exam Report Template in Markdown](https://github.com/noraj/OSCP-Exam-Report-Template-Markdown#available-templates) offers two templates for the OSWE, so we can prepare the common sections before the exam.

## Community Contributions & Enhancements

If you find a new tutorial, challenge, or improve one of the exploits/payloads feel free to submit a pull request! Since Offsec has recently updated the course I may take it at a later date and upload some new challenges myself.

The main things I ask when contributing any challenges or tutorials is:

1. All challenges/tutorials MUST be hands on - no exceptions. If its something where you just look at code snippets try to make it interactive. Re-code the samples and simulate them etc.
2. You yourself must have the challenge completed. This means working through it and having code samples ready to submit.
3. ALL submissions must follow the same structure as the main repository. Meaning:
  - Its own directory
  - A README.md containing:
    - A header describing the submission (e.g XSS and MySQL - NO SQLMAP ALLOWED) along with a description of the challenge.
    - A personal note to either help the challenger or point them in the right direction.
    - Links, always credit the original authors!
  - Code Samples, Working Exploit Code, Working Payloads! I don't wanna hear about the theory of a universal bypass I wanna see it in code!
  - NO WEBM submissions. I don't trust some of you haha, YouTube links are fine though.

For your own safety I recommend adding a header like this to all your code:

```python
#/usr/bin/env python
#
# Exploit Title       : Practicing Java Deserialization Exploits
# Author              : wetw0rk
# Vulnerable Software : https://github.com/NickstaDB/DeserLab
#
# Usage : DeserLab is an intentionally vulnerable server that
#         is vulnerable to java deserialization. This exploit
#         leverages the vulnerability within the application.
#
```

Just to be sure you get as much credit as you deserve.
