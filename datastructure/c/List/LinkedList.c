/* 
 *    THis is a file contained the defination of LinkedList and kinds of method.
 *    
 *    
 * 
 * 
 * 
 * 
 */
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define OVERFLOW -2
#define ERROR -1

typedef int ElemType;
/* 单链表结点的定义 */
typedef struct LNode
{
    ElemType data;
    struct LNode *next;
} LNode, *LinkedList;

/* method */

/* you must use the address of Head pointer as the param */
bool initLinkedList(LinkedList *PtrToL)
{
    // LinkedList L = *PtrToL; ERROR!
    (*PtrToL) = (LinkedList)malloc(sizeof(LNode)); //create a Head node

    // if (!L) ERROE!
    if (!(*PtrToL))
        exit(OVERFLOW);
    // L->next =NULL; ERROR!
    (*PtrToL)->next = NULL; // set null list

    return true;
} //initLinkedList

/* if null return true */
bool isListNull(const LinkedList L)
{
    if (!L)
    { //in case that L havn't been initialized
        printf("链表仍未初始化\n");
        return true;
    }
    if (L->next == NULL)
        return true;
    else
        return false;
} //isListNUll

/* you must use the address of Head pointer as the param. */
/* The LinkedList will be destroed only left a null Head pointer. */
bool destroyLinkedList(LinkedList *PtrToL)
{
    LNode *p;

    while (*PtrToL != NULL)
    {
        p = *PtrToL;
        *PtrToL = (*PtrToL)->next;
        free(p);
    }

    return true;
} //destroyLinkedList

/* clear the List, the Head node is still alive but the next point to the null */
bool clearLinkedList(LinkedList L)
{
    LNode *p, *q;

    if (isListNull(L)) //in case of L == NULL, and then L->next would be error
        return false;

    p = L->next;
    while (p != NULL)
    {
        q = p->next;
        free(p);
        p = q;
    }
    L->next = NULL;

    return true;
} //clearLinkedList

int getListLength(const LinkedList L)
{
    LNode *p;
    int length = 0;

    if (L == NULL)
        return ERROR; //

    p = L->next;
    while (p != NULL)
    {
        p = p->next;
        length++;
    }

    /* 
    int length = -1;
    p = L->next;
    while(p != NULL){
        p = p->next;
        length++;
    }
     */

    return length;
} //getListLength

/* find the data through the index(1<=index<=ListLength) */
ElemType getNodeData(const LinkedList L, int index)
{
    int ThisIndex = 1;
    LNode *p = L->next;

    while (p != NULL && ThisIndex < index) //
    {
        p = p->next;
        ThisIndex++;
    }
    if (p == NULL || ThisIndex > index)
    {
        printf(" index输入错误，请重新输入 ");
        exit(ERROR); //
    }

    return L->data;
}

/*  */
LNode* findNodePosition(const LinkedList L, ElemType value)
{
    LNode *p = L->next;

    while (p != NULL && value != p->data) //
    {
        p = p->next;
    }

    return p;
}

/*  */
int findNodeIndex(const LinkedList L, ElemType value)
{
    int index = 1;
    LNode *p = L->next;

    while (p != NULL && value != p->data) //
    {
        p = p->next;
        index ++;
    }
    if (p == NULL)
        return ERROR;

    return index;
}

/* 1 <= index <= n+1 */
bool inseartNode(LinkedList L, int index, ElemType value)
{
    LNode *p = L; //start from Head pointer
    LNode *q;
    int ThisIndex = 0;

    while (p != NULL && ThisIndex < (index - 1))
    {
        p = p->next;
        ThisIndex++;
    }
    if(p == NULL || ThisIndex > (index -1)){
        printf("插入失败");
        return false;
    }

    q->data = value;
    q->next = p->next;
    p->next = q;

    return true;  
}

/* 1 <= index <= n */
bool deleteNode(const LinkedList L, int index)
{
    LNode *p = L, *TemPtr;
    int ThisIndex = 0;

    while (p->next != NULL && ThisIndex < (index - 1))
    {
        p = p->next;
        ThisIndex++;
    }
    if(p->next == NULL || ThisIndex > (index -1)){
        printf("删除失败");
        return false;
    }

    TemPtr = p->next;
    p->next = p->next->next;
    free (TemPtr);

    return true;
}

/* n is the number of Node insearted */
bool createList_H(const LinkedList L, unsigned int n)
{
    // LNode *p; ERROR! If definate the p outside the while loop, every loop will operate one Node!
    
    if(L == NULL){
        printf("未初始化\n");
        return false;
    }
    while (n > 0)
    {
        LNode *p = (LNode *)malloc(sizeof(LNode));
        scanf("%d",&(p->data)); // & is need
        p->next = L->next;
        L->next = p;
        n--;    
    }
    return true;
}

/* n is the number of Node insearted */
bool createList_R(const LinkedList L, unsigned int n)
{
    
    if(L == NULL){
        printf("未初始化\n");
        return false;
    }
    LinkedList rear = L;

    while (n > 0)
    {
        LNode *p = (LNode *)malloc(sizeof(LNode));
        p->next = NULL;
        scanf("%d", &(p->data));
        rear->next = p;
        rear = p;
        n--;
    }
}


int main(void)
{
    LinkedList L;
    initLinkedList(&L);
    // createList_H(L, 4);
    createList_R(L, 4);
    return 0;
}