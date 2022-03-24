/*
 * file BiTree.c
 * author sanjin (sanjin@sanjin.com)
 * brief A file about the data structure of BiTree's implementing.
 * version 0.1
 * date 2022-03-21
 * 
 * copyright Copyright (c) 2022  opensource
 * 
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <stdio.h>
#include "BiTree.h"
#include "../Stack/LinkedStack.h"
#include "../Queue/SequenceQueue.h"


int main(void)
{
    BiTree t;
    t = createBiTree(t);
    showBiTree(t, preOrderMethod);
    showBiTree(t, inOrderMethod);
    showBiTree(t, levelOrderMethod);

}

BiTree createBiTree(BiTree t)
{
    char data;
    scanf("%c", &data);
    if (data == '#'){
        return NULL;
    }

    if (t == NULL){
        t = malloc(sizeof(BiTree));
    }

    t->lChild = createBiTree(t->lChild);
    t->data = data;
    t->rChild = createBiTree(t->rChild);
    return t;
}

void showBiTree(const BiTree t, int method)
{
    switch (method)
    {
    case 0:
        puts("先序遍历：");
        preOrder(t);
        break;
    case 1:
        puts("中序遍历：");
        inOrder(t);
        break;
    case 2:
        puts("后序遍历：");
        postOrder(t);
        break;
    case 3:
        puts("中序遍历的非递归算法：");
        inOrderByStack(t);
        break;
    case 4:
        puts("层次遍历的非递归算法：");
        levelOrder(t);
        break;
    default:
        printf("请输入正确的遍历方式");
    }
    printf("\n");
}

bool preOrder(BiTree t)
{
    if (t != NULL)
    {
        printf("%c ",t->data);
        preOrder(t->lChild);
        preOrder(t->rChild);
    }

    return false;
}

bool inOrder(BiTree t)
{
    if (t != NULL)
    {
        inOrder(t->lChild);
        printf("%c ",t->data);
        inOrder(t->rChild);
    }

    return false;
}

bool postOrder(BiTree t)
{
    if (t != NULL)
    {
        postOrder(t->lChild);
        postOrder(t->rChild);
        printf("%c ",t->data);
    }

    return false;
}

bool inOrderByStack(BiTree t)
{
    Stack s;
    s = InitStack(s);

    while (t || !IsEmpty(s))
    {
        if (t == NULL)
        {
            Pop(s, &t);
            printf("%c ", t->data);
            t = t->rChild;
        } else {
            Push(s, t);
            t = t->lChild;
        }
        
    }
    
}

bool levelOrder(BiTree t)
{
    Queue q;
    q = InitQueue(q);
    BiNode * temp;
    
    if (t != NULL)
    {
        EnQueue(q, t);
        while (!Q_IsEmpty(q))
        {
            DeQueue(q, &temp);
            printf("%c ", temp->data);
            if(temp->lChild && EnQueue(q, temp->lChild));
            if(temp->rChild && EnQueue(q, temp->rChild));
        }    
    }
    
}