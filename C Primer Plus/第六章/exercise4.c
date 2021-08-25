#include <stdio.h>
int main(void)
{
    char c = 'A';
    for (int i = 1; i <= 6; i++){
        for (int j = 1; j <= i; j++, c++){
            printf("%c", c);
        }
        printf("\n");
    }
}