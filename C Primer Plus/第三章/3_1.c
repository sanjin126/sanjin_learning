/* 观察系统如何处理上溢和下溢问题 */
#include <stdio.h>

int main(void)
{
    /* 整数上溢 */
    int over_int = 2147483648;
    printf("%d\n",over_int);
    /* 浮点数上溢 */
    float over_float = 3.4e38*100.0f;
    printf("%e\n",over_float);
    /* 浮点数下溢 */
    float a= 100000000000000000000000000000000000.0f;
    float under_float = 0.1234e-10/a;
    printf("%e\n", under_float);
}