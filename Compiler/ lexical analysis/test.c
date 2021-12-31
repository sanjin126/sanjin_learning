#include <stdio.h>
#include <stdbool.h>
#include <ctype.h>
#include <string.h>
#include "baseChar.h"
#include "identifierChar.h"

bool read();
void getBC(); 
void concact(char c);
bool isDigit(char c);
bool isLetter(char c);
void retract();
void setLexRst(int code, void *p);

char ch;
typedef struct
{
    char str[10];
    int size;
} str;
str strToken;
typedef struct
{
    int code;
    void *value;
} lexResult;
lexResult lexRst;


int main(void)
{
    //init
    // strToken.size = 0;
    // //
    // read();
    // getBC();
    // // printf("%c", ch);
    // while (ch != '#')
    // {
    //     concact(ch);
    //     read();
    //     getBC();
    // }
    
    // printf("%s",strToken.strToken);
    // init();
    // printf("%d\n", reserve("DIM"));
    // read();
    // retract();
    // printf("%c--",ch);
    // ch = getchar();
    // putchar(ch);


    int code;
    int value;
    init();
    initIdentifierChar();
    while (1)
    {    
        memset(strToken.str, 0x00, sizeof (char) * 10); //字符数组清空函数
        strToken.size = 0;
        read();
        getBC();
        if (isLetter(ch))
        {
            while (isLetter(ch) || isDigit(ch))
            {
                concact(ch);
                read();
            }
            retract();
            code = reserve(strToken.str);
            if (code != 0)
            {
                setLexRst(code, NULL);
                printf("%d------%p\n",lexRst.code,lexRst.value);
            } else {
                void *value = insertId(strToken.str);
                setLexRst($ID, value);
                printf("%d------%p\n",lexRst.code,lexRst.value);
            }
        } else if (isDigit(ch)){
            while (isDigit(ch))
            {
                concact(ch);
                read();
            }
            retract();
            setLexRst($INT, &ch);
            printf("%d------%p\n",lexRst.code,lexRst.value);
        } else if (ch == '='){
            setLexRst($ASSIGN, NULL);
            printf("%c----%d------%p\n",ch,lexRst.code,lexRst.value);
        } else if (ch == '+'){
            setLexRst($PLUS, NULL);
            printf("%d------%p\n",lexRst.code,lexRst.value);
        } else if (ch == '*'){
            read();
            if (ch == '*'){
                setLexRst($POWER, NULL);
                printf("%d------%p\n",lexRst.code,lexRst.value);
            } else {
                retract();
                setLexRst($STAR, NULL);
                printf("%d------%p\n",lexRst.code,lexRst.value);
            }
            
        } else if (ch == ';'){
            setLexRst($SEMICOLON, NULL);
            printf("%d------%p\n",lexRst.code,lexRst.value);
        } else if (ch == '('){
            setLexRst($LPAR, NULL);
            printf("%d------%p\n",lexRst.code,lexRst.value);
        } else if (ch == ')'){
            setLexRst($RPAR, NULL);
            printf("%d------%p\n",lexRst.code,lexRst.value);
        }  else if (ch == ','){
            setLexRst($COMMA, NULL);
            printf("%d------%p\n",lexRst.code,lexRst.value);
        } else {
            printf("不能识别");
        }
    
    }
}

bool read()
{
    ch = getchar();
    return true;
}

void getBC()
{
    while (ch == ' ' || ch == '\n')
    {
        ch = getchar();
    }
    
}

void concact(char c)
{
    strToken.str[strToken.size] = c;
    strToken.size++;
}

bool isDigit(char c)
{
    if ('1' <= c && c <= '9'){
        return true;
    }
    return false;
}

bool isLetter(char c)
{
    c = tolower(c);
    if ('a' <= c && c <= 'z'){
        return true;
    }
    return false;
}

void retract()
{
    ungetc(ch, stdin);
    ch = ' ';
}

void setLexRst(int code, void *p)
{
    lexRst.code = code;
    lexRst.value = p;
}




