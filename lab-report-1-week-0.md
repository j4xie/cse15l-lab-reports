#Tutorial for mac
---

1.First step

Before everything starts, we need to download visual studio code 

[Link](https://code.visualstudio.com/) or open the terminal on the computer.

And the software will be like this

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.24.11%20PM.png)

Log in to [Link](https://sdacs.ucsd.edu/~icc/index.php) to make sure that we can record the password and username to a stick board. 
	If you forget the password follow the procedure here
[Link](https://docs.google.com/document/d/1hs7CyQeh-MdUfM9uv99i8tqfneos6Y8bDU0uhn1wqho/edit)
---
2.Second step

As on mac computer, we do not need to install OpenSSH
on the top, click terminal and create a new terminal. You can find that a window called terminal pops up where you can type in the code.

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.11%20PM.png)

type in `ssh cse15l`Username`@ieng6.ucsd.edu` where username is the one you record before. And type in your password.
*Attention: your password will be transparent here for security. So to copy paste it and press enter is the most convenient and easy way to log in.
If you cannot log in, call ucsd IT or wait for 15-60 minutes and try again or change password again. *

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.15%20PM.png)

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.24%20PM.png)
after log in, you will receive the information like as above
---
3.Third step

Here are some often used code
`ls`: to list all files  in the current directory
`cd <directory>`: move the current directory to another one 
`ls -lat`:lists information about directories and any type of files in the working directory 
`ls -a`:lists all file including hidden fies
`mkdir`: used to make a new directory
`Pwd`: printing the working directory 
`cp`: used to copy file
If you try to log out, you can type in `exit` or control+D
---
4.Fourth step

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.29%20PM.png)
to run the next step, I firstly create a new java file in visual studio code as above. 

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.32%20PM.png)
then I will use “ls” to list all files with my home directory and use “cd” and “ls” together to find the location of WhereAmI.java. 
When I found it, I will use “javac WhereAmI.java” and “java WhereAmi” to get the name of my system, my user name, the user’s home directory and the current working directory. 

to upload this file my scp <file name> cs15l<username>2ieng.ucsd.edu:~ to get the information of the server by the same coding as on the client.
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.37%20PM.png)
  
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.44%20PM.png)
---
5.Fifth step
  
To enter the server without typing in a password every time, we can use 
`ssh-keygen`.(only on our computer here)
  
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.50%20PM.png)
  The step is that we can enter when a new coding pops up and ask a question since pressing enter without an answer will do the default path and answer. And we should copy-paste the path with”id-rsa.pub” here since it is the one we will upload to the server(public key).  When it says “your identification has been saved in <path>. We will need it later.
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.57%20PM.png)
  Now log into the server and use mkdir to make a new directory which we will use to save the key later. And use scp to upload the file to this file. *Attention: when log out, the working directory should be the home directory or the uploading will fail.*
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.52.03%20PM.png)
  Now we found that we can log into the server without password
---
6.Sixth step
  
When we edit the local whereAmI.java successfully and try to use one line of command to upload it and run the java, we can use semicolon to separate the command but put it into one command line. Like `scp WhereAmI.java cs15lfa22dh@ieng6.ucsd.edu:~/; ssh cs15lfa22dh@ieng6.ucsd.edu javac WhereAmI.java; java WhereAmI`
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.52.14%20PM.png)
  Finally we can run the WhereAmI after uploading it at the same time.

