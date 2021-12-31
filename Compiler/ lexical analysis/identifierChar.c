#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include "identifierChar.h"

idnHead idn_head;
idnHead idn_tail;



void initIdentifierChar()
{
    idn_head = (idnHead)malloc(sizeof(identifierChar));
    idn_tail = idn_head;
    idn_head->next = idn_tail;
    idn_tail->next = NULL;
}

void add(char str[], int code)
{

    idnNode *node = (idnNode *)malloc(sizeof(identifierChar));
    strcpy(node->str, str); //数组之间不能直接赋值
    node->code = code;
    idn_tail->next = node;
    node->next = NULL;
    idn_tail = node;
}

idnHead find(char str[])
{
    idnNode * p = (idnNode *)malloc(sizeof(identifierChar));
    p = idn_head->next;
    while (p != NULL)
    {

        if ( !strcmp(p->str, str) ) //相等返回零
        {
            return p;
        }
        p = p->next;
        
    }
    return NULL;

}

void show()
{
    idnNode *p = (idnNode *)malloc(sizeof(identifierChar));
    p = idn_head->next;
    while (p != NULL)
    {
        printf("%s++%d\n", p->str, p->code);
        p = p->next;
    }
    
}

idnHead insertId(char str[])
{
    idnNode * code;
    if ( (code = find(str)) != NULL)
    {
        return code;
    }
    add(str, $ID);
    return idn_tail;
    
}

// int main(void)
// {
//     initIdentifierChar();
//     add("11",11);
//     add("11",11);
//     add("111",111);
//     idnHead code =  insrtId("11");
//     printf("%p\n", code);
//     show();
// }