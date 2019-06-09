# How to run

## 1. Bash

Prepare

    apt-get install net-tools

    cd bash
    
Search by PID example

    ./script.sh 111
    
Search by program name example

    ./script.sh dockerd

## 2. Java

Use Netbeans or

Prepare build folder

    cd PingApplication
    mkdir -p build/classes

Build

    javac src/pingapplication/*.java -d build/classes
    
Run app

    java -cp build/classes pingapplication.PingApplication
