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
    (*L) = (LinkList)malloc(sizeof(LNode));
    (*L)->next = NULL;
    return OK;
}

//判断空表
int List_Empty(LinkList L){
    if(L->next)
        return 0;
    else
        return 1;
}

//销毁单链表
Status Destroy_List(LinkList *Q){
    LNode *p; 
    while (*Q){
        p = (*Q);
        (*Q) = (*Q)->next;
        free(p);
    }
    return OK;
}

//清空单链表
Status Clear_List(LinkList L){
    LNode *p,*q;
    p = L->next;
    while(p){
        q = p->next;
        free(p);
        p = q;
    }
    L->next = NULL;
    return OK;
}

//求单链表的表长
int List_length(LinkList L){
    LNode *p;
    p = L->next;
    int len = 0;
    while (p)
    {
        len++;
        p = p->next;
    }
    return len;
}

//取第i个元素的值
Status Get_Elem(LinkList L, int i, ElemType *e){
    LNode *p;
    p = L->next;
    int j = 1;
    while (p&&j<i)
    {
        p = p->next;
        j++;
    }
    if(!p||j>i) //或if(j!=i)
        return ERROR;
    *e = p->data;
    return OK;   
}

//按值查找
int Locate_Elem(LinkList L, ElemType e){
    LNode *p = L->next;
    int j=1;
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
int Insert_List(LinkList L, int i, ElemType e){ 
    LNode *p;
    p = L;
    int j = 0;
    while (p && j<i-1)
    {
        p = p->next;
        j++;
    }
    if(j == i-1){
        LNode *q = (LNode *)malloc(sizeof(LNode));
        q->data = e;
        q->next = p->next;
        p->next = q;
        return OK;
    }
    else
        return ERROR;
}

//删除节点
int Delete_Elem(LinkList L, int i, ElemType *e){
    LNode *p;
    p = L;
    int j = 0;

    while(p->next && j<i-1){ //p->next为了防止i=length+1情况
        p = p->next;
        j++;
    }

    if(j == i-1){
        LNode *q;
        q = p->next;
        p->next = q->next;
        e = q->data;
        free(q);
        return OK;
    }
    else{
        return ERROR;
    }
    
}

int main(){
    LinkList L;
    int len;
    ElemType elem;
    List_init(&L);
    if(List_Empty(L))
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
    Insert_List(L,1,'e');
    Get_Elem(L, 1, &elem);
    printf("the first elem is %c\n",elem);
    printf("deleting-------\n");
    Delete_Elem(L, 1, &elem);
    Get_Elem(L, 1, &elem);
    printf("the first elem is %c",elem);

    Clear_List(L);
    Destroy_List(&L);
    return 0;
}
