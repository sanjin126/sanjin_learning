/* 01-复杂度3 二分查找 */
#include <stdio.h>
#include <stdlib.h>

#define MAXSIZE 10
#define NotFound 0
typedef int ElementType;

typedef int Position;
typedef struct LNode *List;
struct LNode {
    ElementType Data[MAXSIZE];
    Position Last; /* 保存线性表中最后一个元素的位置 */
};

List ReadInput(); /* 裁判实现，细节不表。元素从下标1开始存储 */
Position BinarySearch( List L, ElementType X );

int main()
{
    List L;
    ElementType X;
    Position P;
	L = (List)malloc(sizeof(struct LNode)*10);
    scanf("%d", &L->Data[1]);
    scanf("%d", &L->Data[2]);
    scanf("%d", &L->Data[3]);
    L->Last = 3;
    scanf("%d", &X);
    P = BinarySearch( L, X );
    printf("%d\n", P);

    return 0;
}

/* 你的代码将被嵌在这里 */
Position BinarySearch( List L, ElementType X )
{
    int low, high, M;
    low = 1; high = L->Last; M = (high + low)/2;
    while(X != L->Data[M] && high > low){
        if (L->Data[M] > X)  {high = M-1; M =  (high + low)/2; }
        else {low = M+1; M = (high + low)/2; } 
    }
    return ((X != L->Data[M])? NotFound:M);
}

// Position BinarySearch( List L, ElementType X )
// {
//     int low, high, M;
//     low = 1; high = L->Last; M = (high + low)/2;
//     while( X != L->Data[M]){
//         if (L->Data[M] > X)  {high = M-1; M =  (high + low)/2; }
//         else {low = M+1; M = (high + low)/2; }
//         if (high <= low && X != L->Data[M]) { M = NotFound;  break;} 
//     }
//     return M;
// }