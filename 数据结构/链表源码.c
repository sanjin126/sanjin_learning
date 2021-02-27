#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0
#define OK 1
#define ERROR 0
#define INFEASIBLE -1
#define OVERFLOW -2

typedef char ElemType;
typedef int Status;

typedef struct ListNode{
    ElemType data;
    struct ListNode *next;
}LNode, *LinkList;

//初始化单链表
Status List_init(LinkList *L){
    (*L)=(LinkList)malloc(sizeof(LNode));
    (*L)->next = NULL;
    return OK;
}

//判断空表
int List_empty(LinkList L){
    if(L->next == NULL)
        return 1;
    else
        return 0;
}

//销毁单链表
void Destroy_List(LinkList *Q){
    LNode *p; 
    while (*Q)
    {
        p = (*Q);
        (*Q) = (*Q)->next;
        free(p);
    }
}

//清空单链表
void Clear_List(LinkList L){
    LNode *p,*q;
    p = L->next;
    while(p){
        q = p->next;
        free(p);
        p = q;
    }
    L->next = NULL;
}

//求单链表的表长
int List_length(LinkList L){
    LNode *p;
    int len = 0;
    p = L->next;
    while (p)
    {
        len++;
        p = p->next;
    }
    return len;
}

//取第i个元素的值
Status Get_Elem(LinkList L, int i, ElemType *e){
    int j = 0;
    LNode *p;
    p = L;
    while (p&&j!=i)
    {
        p = p->next;
        j++;
    }
    if(j!=i)
        return ERROR;
    *e = p->data;
    return OK;   
}

//按值查找
int Locate_Elem(LinkList L, ElemType e){
    LNode *p = L;
    int j=0;
    while (p && (p->data)!= e)
    {
        p = p->next;
        j++;
    }
    if(!p)
        return 0;
    else
        return j;
}

//插入节点
int Insert_List(LinkList *Q, int i, ElemType e){ 
    LNode *p;
    LNode *q = (LNode *)malloc(sizeof(LNode));
    int j = 0;
    p = *Q;
     while (p && j!=i-1)
    {
        p = p->next;
        j++;
    }
    if(j == i-1){
        q->data = e;
        q->next = p->next;
        p->next = q;
    }
    else
        return ERROR;
}

int main(){
    LinkList L;
    int len;
    ElemType elem;
    List_init(&L);
    if(List_empty(L))
        printf("This is an empty list\n");
    LNode *p = (LNode *)malloc(sizeof(LNode));
    p->data = 'c';
    p->next = NULL;
    L->next = p;
    LNode *q = (LNode *)malloc(sizeof(LNode));
    q->data = 'd';
    q->next = NULL;
    p->next = q;
    printf("List length is:%d\n",len =List_length(L));
    
    Get_Elem(L, 1, &elem);
    printf("the first elem is:%c\n",elem);
    Get_Elem(L, 2, &elem);
    printf("the sec elem is:%c\n",elem);

    int index;
    index = Locate_Elem(L, 'c');
    printf("the 'c' is in %d\n",index);
    index = Locate_Elem(L,'3');
    printf("the index is %d\n",index);
    Insert_List(&L,1,'e');
    Get_Elem(L, 1, &elem);
    printf("the new insert elem is %c\n",elem);

    Clear_List(L);
    Destroy_List(&L);
    return 0;
}
