/*
 * date:2021/7/22
 * 
 * SequenceList的定义，以后可以用做头文件引入。
 * 
 * 
 */

#include <stdio.h>
#include <stdlib.h> /*malloc函数和free函数*/
#include <stdbool.h>

#define MAXSIZE 100
#define OVERFLOW -2

typedef int Elemtype;

/*顺序表的定义*/
typedef struct
{
    Elemtype *data;
    int length;
} SqList;

/*顺序表的初始化*/
bool initSqList(SqList *L)
{
    L->data = (Elemtype *)malloc(sizeof(Elemtype) * MAXSIZE);
    if (!(L->data))
        exit(OVERFLOW);
    L->length = 0;
    return true;
}

/* 顺序表的销毁 */
bool destroySqList(SqList *L)
{
    if (L->data == NULL)
        return false;
    free(L->data);
    L->data = NULL;
    L->length = 0;
    return true;
}

/* 清空线性表 */
bool clearSqList(SqList *L)
{
    if (L->data == NULL)
        return false;

    int i;
    for (i = 0; i < MAXSIZE; i++){
        L->data[i] = 0;
    }
    L->length = 0;
    return true;
}

/* 判断线性表是否为空 */
bool isEmpty(const SqList *L)
{
    if (L->length == 0)
        return true;
    else
        return false;
}

/* 获取线性表表长 */
int getSqListLenth(const SqList *L)
{
    if (L->data == NULL)
        return -1;
    else
        return L->length;
}

/* 通过元素下标获取元素 */
bool getElem(const SqList *L, Elemtype *p_elem, int index)
{
    if (L->data == NULL || index < 0 || index > (L->length - 1))
        return false;
    *p_elem = L->data[index];
    return true;
}

/* 查找元素，并返回其下标 */
int locateElem(const SqList *L, Elemtype elem)
{
    int index;
    int i;
    if (L->data == NULL)
        return -1;
    for (i = 0; i <= L->length-1; i++){
        if (elem == L->data[i])
            return i;
        else
            return -1;
    }
}

/* 插入一个元素 */
bool insertElem(SqList *L, Elemtype elem, int index)
{
    int i;
    if (L->data == NULL || index <0 || index > L->length)
        return false;
    for (i = L->length-1; i >= index; i--){
        L->data[i+1] = L->data[i];
    }
    L->data[index] = elem;
    L->length ++;
    return true;
}

/* 删除一个元素 */
bool deleteElem(SqList *L, int index)
{
    int i;
    if (L->data == NULL || index <0 || index > (L->length-1))
        return false;
    for (i = index; i <= L->length-1; i++){
        L->data[i] = L->data[i+1];
    }
    L->length --;
}

/* 打印每一个元素 */
bool showSqList(const SqList *L)
{
    int i;
    Elemtype elem;
    for (i = 0; i <= L->length-1; i++){
        switch (sizeof(Elemtype))
        {
        case sizeof(int):
            getElem(L, &elem, i);
            printf("%d ", elem);
            break;
        case sizeof(char):
            getElem(L, &elem, i);
            printf("%c ", elem);
            break;
        default:
            printf("暂未定义该操作！");
            break;
        }
    }
    printf("\n");
}

int main(void)
{
    SqList L;
    initSqList(&L);
    L.data[0] = 1;
    L.data[1] = 3;
    L.length = 2;
    insertElem(&L, 2, 0);
    showSqList(&L);
    deleteElem(&L, 2);
    showSqList(&L);
    return 0;
}
