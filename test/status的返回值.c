#include <stdio.h>

int main(void)
{
    int a;
    int status;
    status = scanf("%d", &a); 
    while ( status == 1 )
    {
        status = scanf("%d", &a);
        printf("%d\n", status);
    }
    
    return 0;
}