/* 读取一个浮点数，打印成不同的格式 */
#include <stdio.h>
int main(void)
{
    float a;
    printf("Enter a floating-point value:");
    scanf("%f",&a);
    printf("fixed-point notation:%f\n",a);
    printf("exponential notation:%e\n",a);
    printf("p notation:%a\n",a);
    return 0;
}