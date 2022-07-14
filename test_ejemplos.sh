#!/bin/bash
#A script to test all the files in the ejemplos directory.
#Where given a file, it will run it and compare the output with the expected output.
#A the end have a summary of the tests.

#To excute the programm it runs with "java swift <file>", it will print the output to a file called ".txt"
#The expected output is named as the input file case to test, but with added "_salida" to the name and with the extension ".txt"
#For example:
# Input file: 0_base_case.SwiftPL
# Expected output: 0_base_case_salida.txt   

make 
SUCCESS=0
FAIL=0
for file in $(ls ejemplos/*.SwiftPL)
do
    echo "Testing $file"
    java swift $file 2> /dev/null
    #if cmp -s $file.txt ${file%.SwiftPL}_salida.txt
    diff -w $file.txt ${file%.SwiftPL}_salida.txt 
    if [ $? -eq 0 ]
    then
        echo "Test passed"
        SUCCESS=$((SUCCESS+1))
    else
        echo "Test failed"
        FAIL=$((FAIL+1))
    fi 
done

echo "Tests passed: $SUCCESS"
echo "Tests failed: $FAIL"

$SHELL
