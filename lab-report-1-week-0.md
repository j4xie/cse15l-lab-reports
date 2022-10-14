Tutorial for incoming cse 15L student
---

## 1.downloading visual studio

Before everything starts, we need to download visual studio code 

clink here for downloading *[visual studio](https://code.visualstudio.com/)*


when you open it, you will see this
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/0dcb32d728a285343a7c240e0aa22da008620de6/Screen%20Shot%202022-10-14%20at%202.35.55%20PM.png)


---
## 2.username and password


Log in to *[here](https://sdacs.ucsd.edu/~icc/index.php)* to make sure that we can record the password and username to a stick board. 
	If you forget the password follow the procedure here


---
## 3.OpenSSh(for windows user)
 right now, we are ready to connect to remoting computer. 
 *However,if you are windows system, please go to [here](https://docs.microsoft.com/en-us/windows-server/administration/openssh/openssh_install_firstuse) to download OpenSSH. It is an important program that can connect your computer to other computers that have this kind of account. 
 
*notes: **download OpenSSH client***

And then follow this *[step](https://code.visualstudio.com/docs/remote/ssh#_connect-to-a-remote-host)* to connect to the remote computer using VSCode’s remote option.


![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.24.11%20PM.png)


---
## 4.connect to server
on the top, click terminal and create a new terminal. You can find that a window called terminal pops up where you can type in the code.

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.11%20PM.png)

type in `ssh cse15l`Username`@ieng6.ucsd.edu` where username is the one you record before. And type in your password.

*The Secure Shell(SSH) Protocol is a cryptographic network protocol for operating network services securely over an unsecured network. Its most notable applications are remote login and command-line execution.*


**Attention: your password will be transparent here for security.**

So to copy paste it and press enter is the most convenient and easy way to log in.
If you cannot log in, call ucsd IT or wait for 15-60 minutes and try again or change password again.

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.15%20PM.png)

after log in, you will receive the information like this:
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.24%20PM.png)


*Hint: To log out of the remote server in your terminal, you can use:*

*Ctrl-D*

*Run the command `exit`*


---
## 5. useful codes

Here are some often used code
* `ls`: to list all files  in the current directory
* `cd <directory>`: move the current directory to another one 
* `ls -lat`:lists information about directories and any type of files in the working directory 
* `ls -a`:lists all file including hidden fies
* `mkdir`: used to make a new directory
* `Pwd`: printing the working directory 
* `cp`: used to copy file
If you try to log out, you can type in `exit` or control+D


---
## 6.system read file

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.29%20PM.png)
to run the next step, I firstly create a new java file called "WhereAmI" in visual studio code as above. 

You can copy paste here for convinence

```
class WhereAmI{
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
	}
}
```


---
## 7.filing operating

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.32%20PM.png)

Now, we should naviagte the working directory  and find the directory storing "WhereAMi.java" file

**hint: using the code from step5**

When I found it, I will use `javac WhereAmI.java` and `java WhereAmi` to get the name of my system, my user name, the user’s home directory and the current working directory. 


---
## 8.uploading file

Now, we should upload the file by`scp`

notes:*The scp command copies files or directories between a local and a remote system or between two remote systems.*


to upload this file 

`scp <file name> cs15l<username>2ieng.ucsd.edu:~` 

to get the information of the server by the same coding as on the client.
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.37%20PM.png)
  
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.44%20PM.png)

we can see that the system and username are different from the one we have seen before.why?

because the java file runned and read the information from the server. The system and username belong to the server.


---
## 9.SSH-keygen use
  
To enter the server without typing in a password every time, we can use 
`ssh-keygen`.(only on our computer here)
  
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.50%20PM.png)

follow this step to complete this step

* type in code `ssh-keygen` on your client
* press enter if any questions pop up
* if it asked you if to overwirite, it means you have the file. Type in `y` or `n` will both work
* when all process finished, copy and paste the coding after `your public key has been saved in`, which is the path you will use for uploading

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.51.57%20PM.png)

* now log into the server and type in `mkdir` to create a new directory to store the key file
* exit to your client, and use `scp` + the path you saved before + `cs15lfa22@ieng6.ucsd.edu:~/.ssh/authorized_keys`(to replace your username) to upload the key file to server.
* type in your password **for last time**

*Attention: when log out, the working directory should be the home directory or the uploading will fail.*
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.52.03%20PM.png)
  Now we found that we can log into the server without password
  
---
## 10.better coding use
  
When we edit the local whereAmI.java successfully and try to use one line of command to upload it and run the java, we can use semicolon to separate the command but put it into one command line. Like 

`scp WhereAmI.java cs15lfa22dh@ieng6.ucsd.edu:~/; ssh cs15lfa22dh@ieng6.ucsd.edu javac WhereAmI.java; java WhereAmI`

![Image](https://github.com/j4xie/cse15l-lab-reports/blob/eba007f43174a143ed374857c2c6ea0013e5d8a7/Screen%20Shot%202022-09-30%20at%209.52.14%20PM.png)
  Finally we can run the WhereAmI after uploading it at the same time.

