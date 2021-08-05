/* limits头文件，该头文件中是一些关于整数类型的宏
 *
 * 可以参考学习 http://c.biancheng.net/ref/limits_h/ 
 *
 * 本文件是对头文件中宏的输出查看
 */
#include <stdio.h>
#include <limits.h>

int main(void)
{
    /* 注意类型转换说明符 */
    /* 当常量是unsinged类型时，使用%d打印并不会报错，但会导致结果不正确 */
    printf("char类型的位数：%d\n", CHAR_BIT);
    printf("char类型的最大值：%d\n", CHAR_MAX);
    printf("char类型的最小值：%d\n", CHAR_MIN);
    printf("signed char类型的最大值：%d\n", SCHAR_MAX);
    printf("signed char类型的最小值：%d\n", SCHAR_MIN);
    printf("unsigned char类型的最大值：%d\n", UCHAR_MAX);
    printf("short类型的最大值：%d\n", SHRT_MAX);
    printf("short类型的最小值：%d\n", SHRT_MIN);
    printf("unsigned short类型的最小值：%d\n", USHRT_MAX);
    printf("int类型的最大值：%d\n", INT_MAX);
    printf("int类型的最小值：%d\n", INT_MIN);
    printf("unsigned int类型的最大值：%u\n", UINT_MAX);
    printf("long类型的最大值：%ld\n", LONG_MAX);
    printf("long类型的最小值：%ld\n", LONG_MIN);
    printf("unsigned long类型的最大值：%lu\n", ULONG_MAX);
    printf("long long类型的最大值：%lld\n", LLONG_MAX);
    printf("long long类型的最小值：%lld\n", LLONG_MIN);
    printf("unsigned long long类型的最大值：%llu\n", ULLONG_MAX);
    return 0;
}