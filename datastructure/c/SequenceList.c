/*
 * date:2021/7/22
 * 
 * SequenceList的定义，以后可以用做头文件引入。
 * 
 * 
 */

#include <stdio.h>
#include <stdlib.h> /*malloc函数和free函数*/
#define MAXSIZE 100
#define OVERFLOW -2
#define OK 1
#define ERROR 0

typedef int Elemtype;
typedef int Status;

/*顺序表的定义*/
typedef struct 
{
    Elemtype *data;
    int length;
} SqList;

/*顺序表的初始化*/
Status initSqList(SqList *L)
{

    L->data = (Elemtype *)malloc(sizeof(Elemtype)*MAXSIZE);
    L->length = 0;
    if (!(L->data))
        exit(OVERFLOW);
    return OK;
}

int main(void)
{
    SqList L;
    initSqList(&L);
}

