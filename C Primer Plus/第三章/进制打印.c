/* 各种进制的打印输出 */
#include <stdio.h>
#include <inttypes.h>
int main(void)
{
    int octal =020;
    printf("%d\n",octal);
    int hex =0x20; //16进制
    printf("%d\n",hex);
    /* 不带前缀的形式打印数字16 */
    printf("16的十进制：%d,八进制：%o,十六进制：%x\n",16,16,16);
    /* 带前缀的形式打印数字16 */
    printf("16的十进制：%d,八进制：%#o,十六进制：%#x\n",16,16,16);
}



