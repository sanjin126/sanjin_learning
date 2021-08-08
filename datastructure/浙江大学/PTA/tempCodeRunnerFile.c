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
    }
    if (MaxSum == 0 && flag == 0 && ThisSum != 0)
    {   
        bgn = a[0]; 
        last = a[N-1];
    }
}