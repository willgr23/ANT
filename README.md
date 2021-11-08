# ANT
Another Neat Tool

To download git tool follow the below link and download the 64bit file:https://git-scm.com/download/win

To download the ANT repository execute the following command through the command line on your windows system: git clone https://github.com/willgr23/ANT.git

Create directories:
1.	Create a directory on your c drive c:\ssd\ant
2.	Create directory c:\download
3.	Create directory c:\download\Java\J2EE 1.4
4.	Create directory c:\download\ant
5.	Create directory c:\ant
6.	copies all files and directories under course data\ch08\ant to c:\ssd\ant  this includes the following directories and files:
a.	ant\build\*
b.	ant\deploy\*
c.	ant\logs\*
d.	ant\src\*
e.	ant\ buildAndDeployAppName.xml
f.	ant\ PROD_appName.properties
g.	PROD_buildAndDeployAppName.cmd



Install JDK:
1.	Go to http://java.sun.com/j2se/1.4.2/download.html .  	
a.	Click the Download J2SE SDK link
b.	Click the Accept License Agreement option button
c.	Scroll down to middle page and select Windows edition of SDK download.  Download file into c:\download\Java\J2EE 1.4\
(May also consider specifying to select the "Offline Installation" rather than the "Online Installation")
2.	Run the self extracting file and follow the default settings (C:\j2sdk1.4.2_03\)

Install ANT
1.	Go to http://ant.apache.org/ 
2.	Look for the 1.7.0 version of ANT. Download the binary version of the zip file at http://ant.apache.org/bindownload.cgi
3.	Put the zip download software in c:\download\ant.
4.	Extract the zip file into a directory c:\ant
5.	Add the following variables to your environment variables for Windows XP.  
	Go to your desktop and right click your ‘My Computer” icon.
	Click Properties
	Click on the Advanced tab.
	Press “Environment Variables” button on bottom.

For Windows Vista:
	Click the Start button. 
	Right-click Computer, then click Properties. 
	Click Change Settings in the System window. 
	When the User Account Control dialog box appears, click Continue. 
	Click the Advanced tab. Click the Environment Variables button."


Create System Variables – right click My Computer – Properties -Advance Tab – Environment Variables
•	ANT_HOME=C:\ant\apache-ant-1.7.0 {or the version of ANT you downloaded}
•	JAVA_HOME=C:\j2sdk1.4.2_06 or the version of Java you downloaded}

PATH – Make sure you hit your END key to go the end BEFORE you paste this information into your path. Look for semi colon at end of path.
PATH
%ANT_HOME%\bin;.;%JAVA_HOME%\bin;%JAVA_HOME%\lib\tools.jar;

CLASSPATH
%JAVA_HOME%\lib\tools.jar;.;%ANT_HOME%\lib\ant.jar;%ANT_HOME%\lib;




Running the ANT example
1.	After you have downloaded, installed, and configured the software open up a DOS command prompt.  You can find this under Start/Programs/Accessories/Command Prompt.
2.	Change your directory to the ANT example directory.  You can do this by typing in the DOS command “cd c:\ssd\ant\” 
3.	Run the ready made DOS command PROD_buildAndDeployAppName .  You can do this by typing the command in DOS, be careful, it’s case sensitive.
4.	Look at your Log report in cd c:\ ssd \ant\logs for your results
a.	You need to see message Build Successful in log if done sussesfully
 




Explanation of ANT

1.	buildAndDeployAppName.xml is the ANT build file that will be executed from the bottom up.  Notice how each task depends on the task above it.  This is how ANT knows what to execute and when.
 




2.	At the top of the file buildAndDeployAppName.xml are global variables used throughout the build file.  It is a good idea to use global variables instead of hard coded variables just in case the directory structure changes or if you need to reuse on other projects.
 


3.	The first task, copy,  this build does is to copy all java files from one directory to another.  

 

4.	The second task, format, touches each file in the new directory.  Touching every file forces application servers to recompile all files after a successful build.
 


5.	The third task, replace, will turn off debug statements in the source code so that the program does not write to server logs.  Note: if="TURN_OFF_DEBUGS" depends on a passed parameter from file PROD_appName.properties.  It is a good idea for a parameter driven build process for easy reuse and portability.

 

6.	The next task, javac, compiles the source code into binary code

 

7.	The last task, jar, jars up the class files (and source for demo purposes) and moves them into the deploy directory. 

 
	


