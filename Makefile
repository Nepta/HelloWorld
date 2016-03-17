BUILD_DIR=build/
JFLAGS=-Xlint:all -Xdiags:verbose -d ${BUILD_DIR} #-Wall -o build/*.class

all:	hello.jar

hello.jar: class Manifest
	@jar cmf Manifest hello.jar -C build/ .

class:
	@mkdir build/ 2> /dev/null || true
	@javac ${JFLAGS} src/*.java

run: hello.jar
	@java -jar hello.jar

clean:
	@rm build/* 2> /dev/null || true
	@rm hello.jar
