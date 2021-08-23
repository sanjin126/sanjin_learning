#make an own textditor 
[toc]
------
## step 1
- echo $?   查看上一个命令执行后的退出状态

## step 2 compiling with make
- how to build a Makefile
	- first, ==makedir Makefile==
	- sec, ==kilo:kilo.c== kilo is what we want to build, and that kilo.c is what’s required to build it.
	- thr, ==    $(CC) kilo.c -o kilo -Wall -Wextra -pedantic -std=c99==
		- -Wall "all warnings"
		- -Wextra and -pedantic turn on even more warnings.

## step 3
- #include<unistd.h>
