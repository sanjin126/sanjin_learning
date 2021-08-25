#include <stdio.h>
#include <string.h>

int main(void)
{
    char name[10];

    printf("Please enter your name:");
    scanf("%s", name); //needn't use sign '&'

    printf("\"%s\"\n", name);
    printf("\"%20s\"\n", name);
    printf("\"%-20s\"\n", name);
    printf("%*s\n", (int)strlen(name)+3, name);

    return 0;
}