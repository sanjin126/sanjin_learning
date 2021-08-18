
#include <stdio.h>

int main(void)
{
    int x= 3, y = 4;
    int a = x*(y++);
    int b = x*(y++);
    printf("%d\n", a);
    printf("%d\n", b);
    // 结论：圆括号不影响递增递减运算符的优先性
    return 0;
}