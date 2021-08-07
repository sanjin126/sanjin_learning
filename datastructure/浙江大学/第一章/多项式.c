/* 计算在某一定点x处，多项式的值，并比较不同算法运行时间 */
#include <stdio.h>
#include <time.h>
#include <math.h>
clock_t start, stop;
double duration;
#define MAXN 101
double f1(int n, double a[], double x);
double f2( int n, double a[], double x );

int main()
{
    int i;
    double a[MAXN];
    a[0] = 1;
    for ( i = 1; i < MAXN; i++) 
        a[i] = (double)i;
    start = clock();
    f1(MAXN-1, a, 1.1);
    stop = clock();
    duration = ((double)(stop-start))/CLOCKS_PER_SEC;
    printf("ticks1 = %f\n", (double)(stop-start));
    printf("duration1 = %6.2e\n", duration);

    start = clock();
    f2(MAXN-1, a, 1.1);
    stop = clock();
    duration = ((double)(stop-start))/CLOCKS_PER_SEC;
    printf("ticks2 = %f\n", (double)(stop-start));
    printf("duration2 = %6.2e\n", duration);

    return 0;
}

double f1(int n, double a[], double x)
{
    int i;
    double p = a[0];
    for (i = 1; i <= n; i++){
        p += ( pow(x, i) / a[i]);
    }
    return p;
}

double f2( int n, double a[], double x )
{
    int i;
    double p = a[n];
    for ( i = n; i > 0; i--){
        p = 1/a[i-1] + x * (1/p);
    }
    return p;
}