#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

//定义多项式数据结构----链表形式
typedef struct polyNode
{
    int coef;
    int expon;
    struct polyNode *next;
}polyNode;
typedef struct poly
{
    struct polyNode *head;
    struct polyNode *rear;
} *ptrToPoly;


bool isNum(int c);
void readPoly(ptrToPoly ptrToA);
void attach(int c,int e,polyNode **ptrToRear);
void showPoly(ptrToPoly ptrToA);


int main(void){
    // ptrToPoly a, b;
    polyNode *a;
    a->next = malloc(100);
    // readPoly(a);
    // showPoly(a);

    return 0;
}

void showPoly(ptrToPoly ptrToA){
    polyNode *head = ptrToA->head;
    while (head != NULL)
    {
        printf("%d %d", head->coef,head->expon);
        head = head->next;
    }
    
}

void readPoly(ptrToPoly ptrToA){
    int N;
    char c,e;
    polyNode* temp = malloc(sizeof(polyNode));

    ptrToA->head = temp;
    // ptrToA->rear = ptrToA->head;
    scanf("%d", &N);
    while (N--)
    {
        scanf("%c %c", &c,&e);
        if (isNum(c) && isNum(e))
        {
            
            attach(c, e, &(ptrToA->rear));
        }
        
    }


}

void attach(int c,int e,polyNode **ptrToRear){
    polyNode* temp = (polyNode*)malloc(sizeof(polyNode));
    temp->coef = c;
    temp->expon = e;
    temp->next = NULL;
    (*ptrToRear)->next = temp;
    *ptrToRear = temp;
}

bool isNum(int c){
    return (c-49)>=0 && (57-c)>=0;
}