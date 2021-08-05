/* 输入年龄，显示年龄对应的秒数 */
#include <stdio.h>
#include <string.h>
int main(void)
{
    double scd_age;
    int age;
    printf("Enter your age:");
    scanf("%d", &age);
    scd_age = age * 3.156e7;
    printf("%f\n", scd_age);
    return 0;
}