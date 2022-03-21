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
#include "BiTree.h"


int main(void)
{
    BiTree t = malloc(sizeof(BiNode));
    t->data = 1;
    t->lChild = malloc(sizeof(BiNode));
    t->rChild = malloc(sizeof(BiNode));
    t->lChild->data = 2;
    t->lChild->lChild = NULL;
    t->lChild->rChild = NULL;
    t->rChild->data = 3;
    t->rChild->lChild = NULL;
    t->rChild->rChild = NULL;
    
    BiTree tLChild = t->lChild;
    tLChild->lChild = malloc(sizeof(BiNode));
    tLChild->rChild = malloc(sizeof(BiNode));
    tLChild->lChild->data = 2;
    tLChild->lChild->lChild = NULL;
    tLChild->lChild->rChild = NULL;
    tLChild->rChild->data = 3;
    tLChild->rChild->lChild = NULL;
    tLChild->rChild->rChild = NULL;
    showBiTree(t, preOrderMethod);
    showBiTree(t, midOrderMethod);
    showBiTree(t, postOrderMethod);

}

bool createBiTree()
{

}

void showBiTree(const BiTree t, int method)
{
    switch (method)
    {
    case 0:
        preOrder(t);
        break;
    case 1:
        midOrder(t);
        break;
    case 2:
        postOrder(t);
        break;
    
    default:
        printf("请输入正确的遍历方式");
    }
    printf("\n");
}

bool preOrder(const BiTree t)
{
    if (t != NULL)
    {
        preOrder(t->lChild);
        printf("%d ",t->data);
        preOrder(t->rChild);
    }

    return false;
}

bool midOrder(const BiTree t)
{
    if (t != NULL)
    {
        printf("%d ",t->data);
        preOrder(t->lChild);
        preOrder(t->rChild);
    }

    return false;
}

bool postOrder(const BiTree t)
{
    if (t != NULL)
    {
        preOrder(t->lChild);
        preOrder(t->rChild);
        printf("%d ",t->data);
    }

    return false;
}