#include <stdio.h>
#include <string.h>

#define NAME "wang"

int main(void)
{
    printf("%zd,%zd\n", strlen(NAME) ,sizeof NAME);
    // 一行写成多行，只要不跨字母和双引号就行
    printf("dsadasdddasdasdasdas"
    "dasddsa,%zd",
    sizeof (NAME));
}