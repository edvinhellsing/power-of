all: 
	javac -d classes *.java

run: 
	make all
	java -cp classes newpackage.OopExam

clean:
	rm -rf classes