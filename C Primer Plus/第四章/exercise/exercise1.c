#include <stdio.h>

int main(void)
{
    char first_name[10];
    char last_name[10];

    printf("Please enter your first name:");
    scanf("%s", first_name); //needn't use sign '&'
    printf("Please enter your last name:");
    scanf("%s", last_name);
    printf("Hello, %s,%s\n", first_name, last_name);

    return 0;

}