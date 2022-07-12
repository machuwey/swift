default: scanner parser

	javac *.java

default_tree: 
	javac *.java

scanner:
	jflex swift.flex

parser:
	java java_cup.Main -parser parser swift.cup

parser_tree: 
	java java_cup.MainDrawTree -parser parser swift.cup

clean:

	rm -fr parser.java Yylex.java sym.java
	rm -vfr *.class
	rm -vfr *.*~

init:
	mkdir source build

run:
	java swift example.txt

new: default run

tree: scanner parser_tree default_tree run


