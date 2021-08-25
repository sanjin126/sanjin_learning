#include <stdio.h>
#include <string.h>

int main(void)
{
    char first_name[10];
    char last_name[10];

    printf("Enter your first name:");
    scanf("%s", first_name);
    printf("Enter your last name:");
    scanf("%s", last_name);
    printf("%s %s\n", first_name, last_name);
    printf("%*zd %*zd\n", 
            (int)strlen(first_name), strlen(first_name), 
            (int)strlen(last_name), strlen(last_name));
    printf("%s %s\n", first_name, last_name);
    printf("%-*zd %-*zd\n", 
            (int)strlen(first_name), strlen(first_name), 
            (int)strlen(last_name), strlen(last_name));

    return 0;

}