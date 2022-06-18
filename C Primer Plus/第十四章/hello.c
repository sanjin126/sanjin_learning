#include <stdio.h>
#include "typedefine.h"

extern struct world nation;
extern int age;
int main(void){
	printf("hello %s\n", nation.name);
	printf("hello %d\n", age);

	return 0;
}
