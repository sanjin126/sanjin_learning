/* 
    何时使用取地址符&
 */

#include <stdio.h>

int main(void)
{
    char string[10];
    scanf("%s", string);
    // scanf("%s", &string);
    printf("%s\n", string);

    int a[10];
    scanf("%d", &a[0]);
    // scanf("%d", a[0]);
    printf("%d\n", a[0]);

    return 0;
}