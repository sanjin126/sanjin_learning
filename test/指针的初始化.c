/* 测试 指针如果不初始化， 系统是否自动为其赋值NULL */

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

typedef struct 
{
    int *p;
    char data;
}List;

int main(void)
{
    int *p = (int *)malloc(sizeof(int));
    // p = NULL;
    printf("%d\n", p == NULL);

    List *l = (List *)malloc(sizeof(List));
    printf("%d\n", l == NULL);
    return 0;
}