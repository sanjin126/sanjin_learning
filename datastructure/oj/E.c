#include <stdio.h>
#define maxk 50
int main(void)
{
    int k, n,interest;
    scanf("%d %d", &k, &n);
    while (n)
    {
        if (k>maxk)
        {
            interest = 5;
        } else{
            interest = k/10;
        }
        k = k+interest+5;
        
        n--;
    }
    printf("%d",k);
}