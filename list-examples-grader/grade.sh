# Create your grading script here

JU=".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar"

rm -rf student-submission
git clone $1 student-submission

# Create your grading script here
 
 
rm -rf student-submission
git clone $1 student-submission
 

file=student-submission/ListExamples.java
if test -f "$file";
    then 
        echo "file exist!"
    else
        echo "file not exist!"
        exit 1
fi

cp -r lib student-submission
echo "Junit copied"

cp TestListExamples.java student-submission/
cd student-submission
echo "In student-submission"

javac -cp $JU *.java 2> compileError.txt
cat compileError.txt
set -e
echo "Compiled"
if test "$?" -eq 1;
    then
    echo "Your submitted file compiled in error"
    echo "Tests failed"
else
    echo "running succefully"
    echo "TESTS PASS!!"
fi
