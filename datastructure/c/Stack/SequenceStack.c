/* 
 * Target：This is a file contain the defination of stack for individual learning.
 * 
 * Date: 2021/8/18
 * 
 * Author：sanjin
 * 
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAXSIZE 100
#define OVERFLOW -2
typedef int ElemType;
typedef struct SequenceStack
{
    ElemType *top;
    ElemType *base;
    int StackSize;
} *SqStack; //定义一个栈指针，而非普通数据类型，是因为便于通过指针修改结构体成员
 
/* 初始化，返回一个空栈 */
SqStack InitStack(SqStack S)
{
    S = (SqStack)malloc(sizeof(struct SequenceStack));
    S->base = (ElemType *)malloc(sizeof(ElemType) * MAXSIZE);
    if (!S->base) //内存分配失败，则退出程序
        exit(OVERFLOW);
    S->top = S->base; //将栈置为空
    S->StackSize = MAXSIZE;

    return S;
}

/*  */
bool DestroyStack(SqStack S)
{
    if (S == NULL)
        return false;
    else 
        free(S->base);
    S->base=S->top=NULL;
    S->StackSize = 0;
    return true;
}

bool ClearStack(SqStack S)
{
    if (S == NULL)
        return false;
    else
        S->top = S->base;
    return true;
}

/*  */
bool IsEmpty(SqStack S)
{
    if (S->top == S->base)
        return true;
    else
        return false;
}

/*  */
bool IsFull(SqStack S)
{
    if ((S->top - S->base) == S->StackSize)
        return true;
    else
        return false;
}

int GetStackLength(SqStack S)
{
    if (S == NULL)
        return -1;
    else    
        return (S->top - S->base);
}

bool Push(SqStack S, ElemType e)
{
    if (IsFull(S))
        return false;
    (*S->top) = e;
    S->top++;
    return true;
}

bool Pop(SqStack S, ElemType *PtrToData)
{
    if (IsEmpty(S))
        return false;
    *S->top--;
    *PtrToData = *(S->top);
    return true;
}

bool GetStackTop(SqStack S, ElemType *PtrToData) //要使用数据的指针，否则无法返回其值
{
    if (IsEmpty(S))
        return false;
    *PtrToData = *(S->top-1);
    return true;
}

int main(void)
{
    SqStack S;
    S = InitStack(S);
    Push(S, 10);
    printf("%3d ", GetStackLength(S));
    ElemType e;
    GetStackTop(S, &e);
    printf("%3d ", e);
    Push(S, 22);
    Pop(S, &e);
    printf("%3d ", e);
    printf("\n");
    return 0;
}