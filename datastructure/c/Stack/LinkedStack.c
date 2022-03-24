/* 
 * Target:This is a file contain the defination of Linkedstack for individual learning.
 * 
 * Date:2021/8/18
 * 
 * Author:sanjin
 * 
 * Tips:this linkedstack contains a HEAD node. 
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "LinkedStack.h"


/* 建立一个带头节点的链栈 */
Stack InitStack(Stack S)
{
    S = malloc(sizeof(SNode)); //不需要强制类型转换， c编译器会进行隐式转换，但c++需要

    if(!S)
        exit(OVERFLOW);
    S->next = NULL; //置为空栈

    return S;
}

bool IsEmpty(Stack S)
{
    return S->next == NULL;
}

bool ClearStack(Stack S)
{
    SNode *p, *q;

    if (IsEmpty(S))
        return false;
    p = S->next;
    while (p != NULL)
    {
        q = p->next;
        free(p);
        p = q;
    }
    S->next = NULL; //!!!在释放所有元素后，最后要将栈置空

    return true;
}

bool Push(Stack S, Generics e)
{
    SNode *TmpCell = malloc(sizeof(SNode));

    TmpCell->data = e;
    TmpCell->next = S->next;
    S->next = TmpCell;
    return true;
}

bool Pop(Stack S, Generics *PtrToData)
{
    SNode *TmpCell;

    if (IsEmpty(S))
        return false;
    *PtrToData = S->next->data;
    TmpCell = S->next;
    S->next = S->next->next;
    free(TmpCell);

    return true;
}