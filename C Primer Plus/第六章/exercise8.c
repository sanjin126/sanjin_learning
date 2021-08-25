#include <stdio.h>

int main(void)
{
    float f1,f2;
    printf("Enter two number:");
    while (scanf("%f %f", &f1, &f2) == 2){
        printf("sub:%f mlt:%f\n", f1-f2, f1*f2);
        printf("Enter two number:");
    }
        
    printf("%f %f", f1, f2);

    return 0;
}