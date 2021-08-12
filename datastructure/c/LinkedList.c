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
        return ERROR;
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
    LinkedList L = *PtrToL;
    LNode *p;

    while (L != NULL)
    {
        p = L;
        L = L->next;
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

int main(void)
{
    LinkedList L = NULL;
    initLinkedList(&L);
    // L->next = (LNode *)malloc(sizeof(LNode));
    isListNull(L); //测试函数isListNull
    destroyLinkedList(&L);
    printf ("%d\n", getListLength(L));
    return 0;
}