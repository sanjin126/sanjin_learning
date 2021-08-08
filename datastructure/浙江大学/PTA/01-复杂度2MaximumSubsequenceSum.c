/* 题目地址
https://pintia.cn/problem-sets/1399202744970727424 */

#include <stdio.h>
#include <stdlib.h>

void f(int a[], int N);

int bgn, Thisbgn, last, MaxSum = 0;

int main(void)
{
    int N, i;
    int *a;

    scanf("%d", &N);
    a = (int *)malloc(sizeof(int) * N);
    for (i = 0; i < N; i++)
    {
        scanf("%d", a + i);
    }
    // for (i = 0; i < N; i++){
    //     printf("% 4d", a[i]);
    // }
    f(a, N);

    printf("%d %d %d", MaxSum, bgn, last);

    return 0;
}

void f(int a[], int N)
{
    int i, ThisSum = 0, Thisbgn = a[0], flag = 0;
    for (i = 0; i < N; i++)
    {
        ThisSum += a[i];
        if (ThisSum > MaxSum)
        {
            MaxSum = ThisSum;
            bgn = Thisbgn;
            last = a[i];
            flag = 1;
        }
        else if (ThisSum < 0)
        {
            ThisSum = 0;
            Thisbgn = a[i + 1];
        }
        if(a[i] == 0) flag = 1;
    }
    if (MaxSum == 0 && flag == 0)
    {   
        bgn = a[0]; 
        last = a[N-1];
    }
}





// #include <stdio.h>
// #include <stdlib.h>

// void f(int a[], int N);

// int bgn, Thisbgn, last, MaxSum = 0;

// int main(void)
// {
//     int N, i;
//     int *a;

//     scanf("%d", &N);
//     a = (int *)malloc(sizeof(int) * N);
//     for (i = 0; i < N; i++)
//     {
//         scanf("%d", a + i);
//     }
//     // for (i = 0; i < N; i++){
//     //     printf("% 4d", a[i]);
//     // }
//     f(a, N);
//     printf ("\n");
//     if (MaxSum == 0)
//     {   bgn = a[0]; 
//         last = a[N-1];
//     }
//     printf("%2d %2d %2d", MaxSum, bgn, last);

//     return 0;
// }

// void f(int a[], int N)
// {
//     int i, ThisSum = 0, Thisbgn = a[0];
//     for (i = 0; i < N; i++)
//     {
//         ThisSum += a[i];
//         if (ThisSum > MaxSum)
//         {
//             MaxSum = ThisSum;
//             bgn = Thisbgn;
//             last = a[i];
//         }
//         else if (ThisSum < 0)
//         {
//             ThisSum = 0;
//             Thisbgn = a[i + 1];
//         }
//     }
// }
