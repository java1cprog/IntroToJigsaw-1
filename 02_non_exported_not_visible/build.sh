#!/bin/bash

rm -rf out/lib

mkdir -p out/lib

rm -rf out/greetings.out
javac -d out/greetings.out `find com.greetings -name "*.java"`
jar  -c -f out/lib/greetings.jar -C out/greetings.out .

rm -rf out/user.out
javac -p out/lib -d out/user.out `find greetings.user -name "*.java"`
jar  -c -f out/lib/user.jar --main-class=com.greetings.user.User -C out/user.out .


java -p out/lib -m greetings.user
java -p out/lib -m greetings.user/com.greetings.user.User