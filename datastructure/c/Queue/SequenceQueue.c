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
#include "SequenceQueue.h"


Queue InitQueue(Queue Q)
{
    Q = malloc(sizeof(struct SeqQueue));
    if (!Q)
        exit(OVERFLOW);
    //成员初始化
    Q->data = malloc(sizeof(Generics) * MAXSIZE);
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

bool Q_IsFull(Queue Q)
{
    return (Q->rear + 1) %Q->StackSize == Q->front;
}

bool Q_IsEmpty(Queue Q)
{
    return (Q->front == Q->rear);
}

bool EnQueue(Queue Q, Generics e)
{
    if (Q_IsFull(Q))
        return false;
    else
    {
        Q->data[Q->rear] = e;
        Q->rear = (Q->rear + 1) %Q->StackSize;
        return true;
    }
}

bool DeQueue(Queue Q, Generics *PtrToData)
{
    if (Q_IsEmpty(Q))
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
    if (Q_IsEmpty(Q))
        return false;
    Q->front = Q->rear = 0;
    return true;
}