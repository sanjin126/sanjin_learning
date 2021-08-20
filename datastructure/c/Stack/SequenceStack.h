
#include <stdbool.h>

#define MAXSIZE 100
#define OVERFLOW -2

struct SequenceStack;
typedef int ElemType;
typedef struct SequenceStack *SqStack;

SqStack InitStack(SqStack S);
bool DestroyStack(SqStack S);
bool ClearStack(SqStack S);
bool IsEmpty(SqStack S);
bool IsFull(SqStack S);
int GetStackLength(SqStack S);
bool Push(SqStack S, ElemType e);
bool Pop(SqStack S, ElemType *PtrToData);
bool GetStackTop(SqStack S, ElemType *PtrToData) ;