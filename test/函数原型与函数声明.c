/* 


 */
#include <stdio.h>

void Print(int);

int main(void)
{
    Print(3.32333f);
    return 0;
}

void Print(int n){
    while (n-->0)
    {
        printf("*");
    }
    printf("\n");
}
    
    