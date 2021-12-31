/**
 * @file baseChar.c
 * @author sanjin
 * @brief 利用链表构造保留字表
 * @version 0.1
 * @date 2021-11-29
 * 
 * @copyright Copyright (c) 2021
 * 
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "baseChar.h"



void addbaseChar(char str[], int typeCode);


void init()
{
    head = (baseCharhead)malloc(sizeof(baseChar));
    tail = head;
    head->next = tail;
    tail->next = NULL;

    addbaseChar("DIM", $DIM);
    addbaseChar("IF", $IF);
    addbaseChar("DO", $DO);
    addbaseChar("STOP", $STOP);
    addbaseChar("END", $END);

}

void addbaseChar(char str[], int typeCode)
{
    baseCharNode *node = (baseCharNode *)malloc(sizeof(baseChar));
    strcpy(node->str, str); //数组之间不能直接赋值
    node->typeCode = typeCode;
    tail->next = node;
    node->next = NULL;
    tail = node;
}

void showBaseChar()
{
    baseCharNode * p = (baseCharNode *)malloc(sizeof(baseChar));
    p = head->next;
    while (p != NULL)
    {
        printf("%s++%d\n", p->str, p->typeCode);
        p = p->next;
    }
    
}

int reserve(char str[])
{
    baseCharNode * p = (baseCharNode *)malloc(sizeof(baseChar));
    p = head->next;
    while (p != NULL)
    {

        if ( !strcmp(p->str, str) ) //相等返回零
        {
            return p->typeCode;
        }
        p = p->next;
        
    }
    return 0;
    
}

// int main(void)
// {
//     init();

    
//     int code = reserve("DIM");
//     printf("%d\n", code);
//     showBaseChar();

// }
