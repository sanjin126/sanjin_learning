/* 



 */
#include <stdio.h>


int main(void)
{
    char c = 127;
    short s = 32767;
    // short a = 32768;
    // printf("%d\n", a);
    printf("%d\n", c + c);
    printf("%d\n", c * c);
    printf("%d\n", s + s);
    printf("%d\n", s * s);

    return 0;
}
