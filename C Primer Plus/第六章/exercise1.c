#include <stdio.h>

int main(void)
{
    char letter_arr[27]; 
    int i;

    for (i = 0; i < 26; i++)
    {
        letter_arr[i] = i + 'a';
    }
    for (i = 0; i < 26; i++)
    { 
        printf("%2c", letter_arr[i]);
    }
    printf("\n");
    printf("Hello World!");

    return 0;
}