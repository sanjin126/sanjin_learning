/* float头文件，该头文件中是一些关于浮点数类型的宏
 *
 * 可以参考学习 http://c.biancheng.net/ref/float_h/
 *
 * 本文件是对头文件中宏的输出查看
 */
#include <stdio.h>
#include <float.h>

int main(void)
{
    printf("float类型的尾数位数：%d\n", FLT_MANT_DIG);
    printf("float类型的最少有效数字位数（十进制）：%d\n", FLT_DIG);
    printf("带全部有效数字的float类型的最小负指数（以10为底）：%d\n", FLT_MIN_10_EXP);
    printf("float类型的最大正数：%e\n", FLT_MAX);
    printf("1.00和比1.00大的最小float类型值之间的差值%e\n", FLT_EPSILON);
    // 说明符使用%Le，而不能用%le
    printf("long double float类型的最大正数：%Le\n", LDBL_MAX); 
    
    return 0;
}
