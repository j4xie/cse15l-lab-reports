# Researching command about `find`

## 1. `-name`

using this option to seach the name 

**first example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/ -name ar68.txt    
./technical//ar68.txt
```
the input is `find ./technical/biomed/ -name ar68.txt`

The output is `./technical//ar68.txt`

as I use find command with `-name`, it will search the file with name ar68.txt under the directory called techinical.

---
**second example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/911report/ -name "*.txt"
./technical/911report//chapter-13.4.txt
./technical/911report//chapter-13.5.txt
./technical/911report//chapter-13.1.txt
./technical/911report//chapter-13.2.txt
./technical/911report//chapter-13.3.txt
./technical/911report//chapter-3.txt
./technical/911report//chapter-2.txt
./technical/911report//chapter-1.txt
./technical/911report//chapter-5.txt
./technical/911report//chapter-6.txt
./technical/911report//chapter-7.txt
./technical/911report//chapter-9.txt
./technical/911report//chapter-8.txt
./technical/911report//preface.txt
./technical/911report//chapter-12.txt
./technical/911report//chapter-10.txt
./technical/911report//chapter-11.txt
```
the input is `find ./technical/911report/ -name "*.txt"`

the output is 
```./technical/911report//chapter-13.4.txt
./technical/911report//chapter-13.5.txt
./technical/911report//chapter-13.1.txt
./technical/911report//chapter-13.2.txt
./technical/911report//chapter-13.3.txt
./technical/911report//chapter-3.txt
./technical/911report//chapter-2.txt
./technical/911report//chapter-1.txt
./technical/911report//chapter-5.txt
./technical/911report//chapter-6.txt
./technical/911report//chapter-7.txt
./technical/911report//chapter-9.txt
./technical/911report//chapter-8.txt
./technical/911report//preface.txt
./technical/911report//chapter-12.txt
./technical/911report//chapter-10.txt
./technical/911report//chapter-11.txt
```

as I used find and `-name` as an option, I searched the file with the end in txt in directory 911report under techinical. The reason I used * and " is that 
using them together can save the work to type all name and only find the file with name "txt.

---

**third example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/biomed/ -name cc2172.txt
./technical/biomed//cc2172.txt
```
the input is `find ./technical/biomed/ -name cc2172.txt`

the output is `./technical/biomed//cc2172.txt`

as I use find command with `-name`, it will search the file with name ccc2172.txt under the directory called biomed which is under direcotry technical

---

## 2. `-type d`

using this command to search the specific directory

---

**first example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/ -type d                            
./technical/
./technical//government
./technical//government/About_LSC
./technical//government/Env_Prot_Agen
./technical//government/Alcohol_Problems
./technical//government/Gen_Account_Office
./technical//government/Post_Rate_Comm
./technical//government/Media
./technical//plos
./technical//biomed
./technical//911report
```

the input is `find ./technical/ -type d `

the output is 
```
./technical/
./technical//government
./technical//government/About_LSC
./technical//government/Env_Prot_Agen
./technical//government/Alcohol_Problems
./technical//government/Gen_Account_Office
./technical//government/Post_Rate_Comm
./technical//government/Media
./technical//plos
./technical//biomed
./technical//911report
```

this command will give all the name of directory and sub-directory under "techinical" if there is no specific name of direcotry is inpout.

---

**second example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/ -type d -name government 
./technical//government
```

the input is `find ./technical/ -type d -name government `

the output is `./technical//government`

this command combine the use of -type and -name to search the specific name of directory under techinical directory

---

**third example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/ -type d -iname media
./technical//government/Media
```

the input is `find ./technical/ -type d -iname media`

the output is `./technical//government/Media`

this command still combine the use of -type and -name. Also, since we search the direcotry name called media but the actual name is Media, I use -iname to search
the capital name. Since Media is a directory under government, the output will give the path from techinical to the closed directory.

## 3. `-size`

search for the file which is some size 
**important notes:
* 'c' for bytes
* 'w' for two-byte words
* 'k' for Kilobytes
* 'M' for Megabytes
* 'G' for Gigabytes

---

**first example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/ -type f -size -1000c 
./technical//plos/pmed.0020191.txt
./technical//plos/pmed.0020226.txt
```

the output is `find ./technical/ -size -1000c`

the output is 
```
./technical//plos/pmed.0020191.txt
./technical//plos/pmed.0020226.txt
```

this command use serach the file by -type f and search the file which is under and 1000 bytes of size. To add a - sign before the digital means smaller than that number.

---

**second example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/ -type f -size +100c -size -2k
./technical//government/Media/Helping_Hands.txt
./technical//government/Media/Campaign_Pays.txt
./technical//government/Media/Fire_Victims_Sue.txt
./technical//government/Media/Court_Keeps_Judge_From.txt
./technical//government/Media/It_Pays_to_Know.txt
./technical//government/Media/Self-Help_Website.txt
./technical//government/Media/Justice_requests.txt
./technical//government/Media/Wilmington_lawyer.txt
./technical//government/Media/Lawyer_Web_Survey.txt
./technical//plos/pmed.0020048.txt
./technical//plos/pmed.0020028.txt
./technical//plos/pmed.0020191.txt
./technical//plos/pmed.0020226.txt
./technical//plos/pmed.0020192.txt
./technical//plos/pmed.0020157.txt
./technical//plos/pmed.0020082.txt
./technical//plos/pmed.0020120.txt
```

the input is `find ./technical/ -type f -size +100c -size -2k`

the output is 
```
./technical//government/Media/Helping_Hands.txt
./technical//government/Media/Campaign_Pays.txt
./technical//government/Media/Fire_Victims_Sue.txt
./technical//government/Media/Court_Keeps_Judge_From.txt
./technical//government/Media/It_Pays_to_Know.txt
./technical//government/Media/Self-Help_Website.txt
./technical//government/Media/Justice_requests.txt
./technical//government/Media/Wilmington_lawyer.txt
./technical//government/Media/Lawyer_Web_Survey.txt
./technical//plos/pmed.0020048.txt
./technical//plos/pmed.0020028.txt
./technical//plos/pmed.0020191.txt
./technical//plos/pmed.0020226.txt
./technical//plos/pmed.0020192.txt
./technical//plos/pmed.0020157.txt
./technical//plos/pmed.0020082.txt
./technical//plos/pmed.0020120.txt
```

this command uses two -size to search the filename (by -type f) which is between 100 bytes and 2 kiobytes. To add a - sign before the number means smaller, to add a + sign means larger than that number.

---

**third example**
```
jietaoxie@JietaodeMBP skill-demo1 % find ./technical/ -type f -size 100c        

```
the input is `find ./technical/ -type f -size 100c        `

the output is nothing found. 

This command will use -size to search the file (-type f) which is exact 100bytes. However, since there is no file has the exact file size of 100c, the system will print nothing.
