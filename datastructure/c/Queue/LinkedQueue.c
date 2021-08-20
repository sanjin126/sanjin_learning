/* 
 * Target:This is a file contain the defination of LinkedQueue for individual learning.
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

#define OVERFLOW -2

typedef int ElemType;
typedef struct QNode{
    ElemType data;
    struct QNode *next;
} QNode; //节点定义
typedef struct Queue{
    QNode *front;
    QNode *rear;
} *Queue; //队列定义

Queue InitQueue(Queue Q)
{
    QNode *TmpCell;
    
    Q = malloc(sizeof(struct Queue)); //注意，是struct Queue 而不是Queue
    TmpCell = malloc(sizeof(QNode)); //头节点，如果不建立头节点，那么每次修改队头队尾时都要传入Queue的二级指针，麻烦
    TmpCell->next = NULL;
    Q->front = Q->rear = TmpCell;
    return true;
}

bool IsEmpty(Queue Q)
{
    return Q->front->next == NULL;
}

ElemType GetQueueFront(Queue Q)
{
    return Q->front->next->data;
}

bool EnQueue(Queue Q, ElemType e)
{
    QNode *TmpCell;

    TmpCell = malloc(sizeof(QNode));
    TmpCell->data = e;
    TmpCell->next = NULL;
    Q->rear->next = TmpCell;
    Q->rear = TmpCell; //更改尾指针到队尾
    return true;
}

bool DeQueue(Queue Q, ElemType *PtrToData)
{
    QNode *TmpCell;
    
    if (IsEmpty(Q))
        return false;
    else
    {
        TmpCell = Q->front->next;
        *PtrToData = TmpCell->data;
        Q->front->next = TmpCell->next;
        if (Q->rear == TmpCell) //考虑删除的是最后一个节点，则需要修改尾指针
            Q->rear = Q->front;
        free(TmpCell);
        return true;
    }
}



