#include <stdio.h>
#include "SequenceStack.h"
void Converse(long N, int H);

int main(void)
{
    long N;
    int S = 8;
    // for(printf("请输入一个正整数(退出输入q)："); scanf("%d", &N) == 1; printf("请输入一个正整数(退出输入q)：")){
    //     ;
    // }
    printf("请输入一个进制数(2,8)：");
    scanf("%d", &S);
    printf("请输入一个正整数(退出输入q)：");
    while(scanf("%ld", &N) == 1)
    {
        Converse(N, S);
        printf("请输入一个正整数(退出输入q)：");
    }
    return 0;

}

void Converse(long N, int H)
{
    SqStack S;
    int e;
    
    S = InitStack(S);

    while(N){
        Push(S, N%H);
        N /= H;
    }
    printf("进制转换后为： ");
    while( !IsEmpty(S) ){
        Pop(S, &e);
        printf("%d", e);       
    }
    printf("\n");
}