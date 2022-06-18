#ifndef _LINKEDSTACK_H
#define _LINKEDSTACK_H

#define OVERFLOW -2

// #include "../Tree/BiTree.h" //通过notdefined 来去掉include

#if !defined(_GENERICS_) //实现了多态
#define _GENERICS_
typedef int Generics;


#endif // _GENERICS_


typedef struct SNode{
    Generics data;
    struct SNode *next;
} SNode, *Stack; //一个节点类型， 一个指向栈的指针

Stack InitStack(Stack S);
bool IsEmpty(Stack S);
bool ClearStack(Stack S);
bool Push(Stack S, Generics e);
bool Pop(Stack S, Generics *PtrToData);

#endif