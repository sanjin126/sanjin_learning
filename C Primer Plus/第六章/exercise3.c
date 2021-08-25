#include <stdio.h>

int main(void)
{
    char letter;
    int i;

    for (i = 0; i <= 5; i++){
        for (letter = 'F'; 'F'-letter <= i; letter--){
            printf("%c", letter);
        }
        printf("\n");
    }
}