/* 测试各种修饰符的使用方法 */
#include <stdio.h>

int main(void)
{
    
    // 符号： ‘-’
    printf("%10d\n", 12321332);
    printf("%-10d\n", 12321332);
    printf("-----------------\n");
    // 符号： ‘+’
    printf("%+-10d\n", -1010100);
        //// unsigned int a= 11;
        //// printf("%+u\n", a);  warning
        //// printf("%+d\n", a);  maybe feasible, but not true
    // 符号：‘ ’
    printf("-----------------\n");
    printf("% 6.2f\n", -4444133213.44);
    printf("% 6.2f\n", +4444133213.44);
        //// warning: ' ' flag used with ‘%u’
    // 符号：‘#’
    printf("-----------------\n");
    printf("%#o\n", 010);
    printf("%#x\n", 010);
    printf("%#.f\n", 3000000.0);
    printf("%g\n", 3000000.0); //单独使用g 不输出无意义的零
    printf("%#g\n", 3000000.0);
    // 符号：‘0’
    printf("-----------------\n");
    printf("%010d\n",3213213) ;
    printf("%-010d\n",3213213) ; //失效
    printf("%0.2d\n",3213213) ; // 失效
    printf("%hhd\n", 12345);
    return 0;
}