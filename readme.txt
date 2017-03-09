Installation

Clone the repository

$git clone https://github.com/skaanozdemir/Employee-Example-Project.git

1)Change database driver( by default set for MYSQL) and please change your mysql (url,user,password) in 
/src/main/application.properties 

** if own computer has mysql so dont change url but use another computer so write its url
** write your password and username

2)Create a Schema in your mysql

** CREATE SCHEMA  'employees' DEFAULT CHARACTER SET utf8 ;

3) Go to your project directory and then 

under projects folders

cd /src/main/webapp

npm install 
npm install webpack -g

4) $ mvn eclipse:eclipse

5) import project eclipse

6) Test is under /src/test/java