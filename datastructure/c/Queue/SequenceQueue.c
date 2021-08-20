/* 
 * Target:This is a file contain the defination of SequenceQueue for individual learning.
 * 
 * Date:2021/8/19
 * 
 * Author:sanjin
 * 
 * 
 *
 */
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAXSIZE 100
#define OVERFLOW -2

typedef int ElemType;
typedef struct SeqQueue{
    int front; //头指针
    int rear; //尾指针
    ElemType *data;
    int StackSize;
} *Queue;

Queue InitQueue(Queue Q)
{
    Q = malloc(sizeof(struct SeqQueue));
    if (!Q)
        exit(OVERFLOW);
    //成员初始化
    Q->data = malloc(sizeof(ElemType) * MAXSIZE);
    if (!Q->data)
        exit(OVERFLOW);
    Q->StackSize = MAXSIZE;
    Q->front = Q->rear = 0; //将队列置为空
    return Q;
}

int GetQLength(Queue Q)
{
    return (Q->rear+Q->StackSize-Q->front)%Q->StackSize; //注意rear越过队列末尾到front前面的情况
}

bool IsFull(Queue Q)
{
    return (Q->rear + 1) %Q->StackSize == Q->front;
}

bool IsEmpty(Queue Q)
{
    return (Q->front == Q->rear);
}

bool EnQueue(Queue Q, ElemType e)
{
    if (IsFull(Q))
        return false;
    else
    {
        Q->data[Q->rear] = e;
        Q->rear = (Q->rear + 1) %Q->StackSize;
        return true;
    }
}

bool DeQueue(Queue Q, ElemType *PtrToData)
{
    if (IsEmpty(Q))
        return false;
    else
    {
        *PtrToData = Q->data[Q->front];
        Q->front = (Q->front + 1) %Q->StackSize;
        return true;
    }
}

bool ClearQueue(Queue Q)
{
    if (IsEmpty(Q))
        return false;
    Q->front = Q->rear = 0;
    return true;
}