#ifndef _SEQUENCEQUEUE_h
#define _SEQUENCEQUEUE_h



#define MAXSIZE 100
#define OVERFLOW -2

#if !defined(_GENERICS_)
#define _GENERICS_
typedef int Generics;

#endif // _GENERICS_


typedef struct SeqQueue{
    int front; //头指针
    int rear; //尾指针
    Generics *data;
    int StackSize;
} *Queue;

Queue InitQueue(Queue Q);
int GetQLength(Queue Q);
bool Q_IsFull(Queue Q);
bool Q_IsEmpty(Queue Q);
bool EnQueue(Queue Q, Generics e);
bool DeQueue(Queue Q, Generics *PtrToData);
bool ClearQueue(Queue Q);

#endif
