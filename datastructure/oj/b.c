#include <stdio.h>
#include <math.h>


void update(int b[],int n){
    for (int i = 1; i < n; i++)
    {
        b[i]+=1;
    }
    
}
void create(int b[],int n,int first){
    int i=0;
    while (n--)
    {
        b[i] = first+i;
        i++;
    }
    
}

int find(int n,int a[],int b[],int outerAns,int *innerAns){
    int max=0;
 for (int i = 0; i < n ; i++)
        {
            max = max<abs(a[i]-b[i])?abs(a[i]-b[i]):max;
            if (max>outerAns)
                return 0;
        } //current
        *innerAns=max;
        return 1;
}
int maxElem(int a[],int n){
    int max=0;
for (int i = 0; i < n; i++)
{
    if (max<a[i])
    {
        max = a[i];
    }
    
}
return max;
}


int main(void)
{
    int n,i=0,innerAns,outerAns;

    scanf("%d", &n);int a[n],b[n];
    while (i<n) {
        scanf("%d",&a[i]);
        b[i]=i+1;i++;
    }
    outerAns=maxElem(a,n);

    while (1) {
        if ((abs(a[0]-b[0]))>outerAns)
            break;
        int current=0;

        while(find(n,a,b,outerAns,&innerAns)){
            update(b,n);
        if (outerAns>innerAns)
            outerAns=innerAns;
        };  
        if (outerAns>innerAns)
            outerAns=innerAns;  
        create(b,n,b[0]+1);
        
    }



    printf("%d",outerAns);

}