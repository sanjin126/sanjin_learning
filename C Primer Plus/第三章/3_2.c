/* 输入一个ASCII码，输出其字符 */
#include <stdio.h>

int main(void)
{
    int in; /* 如果改为char，则会报warning */
    printf("请输入一个ASCII码：");
    scanf("%d",&in);
    printf("%c\n",in);
}