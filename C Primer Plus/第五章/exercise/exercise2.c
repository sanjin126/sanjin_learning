#include <stdio.h>

int main(void)
{
    int num;
    int i;

    printf("Enter a num:");
    scanf("%d", &num);
    for (i = 0; i <= 10; i++,num++)
        printf("%d\t", num);
    printf("\n");
    
    return 0;
}