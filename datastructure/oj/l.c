#include <stdio.h>
#include <stdlib.h>
int *a,*tr;
void build(int rt,int l,int r){

    if(l==r){tr[rt]=a[l];return ;}

    int mid=(l+r)>>1;
    int ls = rt <<1;
    int rs = rt<<1|1;
    build(ls,l,mid);

    build(rs,mid+1,r);

    tr[rt]=tr[ls]+tr[rs];

}

void update(int rt,int l,int r,int q,int v){

    if(l==r){tr[rt]+=v;return;}

    int mid=(l+r)>>1;
    int ls = rt <<1;
    int rs = rt<<1|1;

    if(q<=mid)update(ls,l,mid,q,v);

    else update(rs,mid+1,r,q,v);

}

int main(void){
    int n, m,i=0;
    scanf("%d %d", &n, &m);
    a = malloc(sizeof(int)*n);
    tr = malloc(sizeof(int)*(n<<2));
    while (i<n)
    {
        scanf("%d",&a[i]);
        i++;
    }

    build(1,1,n);

    while (m--)
    {
        int l,r,x;
        scanf("%d %d %d", &l,&r,&x);

        for(int i=l;i<=m;i++)

        update(1,l,r,i,x);

    }
    

    


}
