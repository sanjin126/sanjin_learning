#include <stdio.h>
#include <ctype.h>
#include <iso646.h>
#include <stdbool.h>

#define STOP '#'

int main(void)
{
    char ch;             //读入字符
    char pre_ch;         //前一个字符
    long ch_count = 0l;  //字符数
    int wrd_count = 0;   //单词数
    int line_count = 0;   //行数
    int p_lines = 0;
    bool inword = false; //如果c在单词中，inword等于true
    
    pre_ch = '\n';
    while((ch = getchar()) != STOP)
    {
        ch_count++;
        if (ch == '\n')
            line_count++;   //统计行
        if (isspace(ch) && inword == 1){
            inword = false;
            // wrd_count++;  //当最后一个单词末尾不是空字符时，就无法统计上
        }
        if (!isspace(ch) && inword == 0){
            inword = true;
            wrd_count++;
        }
        pre_ch = ch;
    }
    if (pre_ch != '\n')
        p_lines = 1;
    printf("data as follow:\n");
    printf("all have %ld chars, %d words, %d lines", 
            ch_count, wrd_count, line_count);
    printf(" ,partial lines = %d\n", p_lines);
    return 0;
}