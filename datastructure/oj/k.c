#include <stdio.h>

int main(void){
    int n, max,temp;
    max = 1<<31;
    scanf("%d", &n);
    while (n)
    {
        scanf("%d", &temp);
        if (max < temp)
        {
            max = temp;
        }
        
        n--;
    }
    printf("%d", max);
}