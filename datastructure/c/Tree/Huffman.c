#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "Huffman.h"

int main(void)
{
    Hf hf = init();
    fillData(hf);
    show(hf);
    create(hf);
    show(hf);
    
}

Hf init(){
    Hf hf = malloc(sizeof(HfNode) * N);
    for (int i = 0; i < N; i++)
    {
        hf[i].parent = hf[i].lch = hf[i].rch = hf[i].weight = 0;
    }
    return hf;
}

void fillData(Hf hf){
    for (int i = 0; i < dataNum; i++)
    {
        hf[i].data=i+97;
        hf[i].weight=weight[i];
    }
    
}

void show(const Hf hf)
{
    Hf temp = hf;
    for (int i = 0; i < N; i++)
    {
        printf("数据：%c,权重：%d,双亲：%d，左孩子：%d，右孩子：%d\n",(*temp).data,(*temp).weight,(*temp).parent,(*temp).lch,(*temp).rch);
        temp++;
    }
}

bool findLowTwoNode(int *lest_index, int *sec_lest_index,Hf hf,int range)
{
    int lowest, sec_lowest;

    lowest = sec_lowest = (1<<31)-1;
    *lest_index = *sec_lest_index = 0;
    for (int i = 0; i < range; i++)
    {
        if (hf[i].parent != 0)
        {
            continue;
        }
        
        if (hf[i].weight<lowest)
        {
            lowest = hf[i].weight;
            *lest_index = i;
        } else if (hf[i].weight<sec_lowest)
        {
            sec_lowest = hf[i].weight;
            *sec_lest_index = i;
        }      
    }
    if (*lest_index == *sec_lest_index)
        return false;
    else
        return true;
    
}

void create(Hf hf)
{
    int lest_index,sec_lest_index;
    int i = dataNum;

    while (i < N)
    {
        findLowTwoNode(&lest_index,&sec_lest_index,hf,i);
        hf[i].weight = hf[lest_index].weight + hf[sec_lest_index].weight;
        hf[i].lch = lest_index;
        hf[i].rch = sec_lest_index;
        hf[lest_index].parent = hf[sec_lest_index].parent = i;
        ++i;
    }
    
    
}