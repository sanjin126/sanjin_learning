#include <stdio.h>
#include "AMGraph.h"

int main(void)
{
    AMGraph am = createAMGraph();
    show(am);
}

AMGraph createAMGraph()
{
    AMGraph am;
    char vt1,vt2;
    int weight,index1,index2;

    for (int i = 0; i < max_vertex_num; i++)
        for (int j = 0; j < max_vertex_num; j++)
            am.AMArr[i][j]=INF; 
    

    printf("请输入当前节点数:");
    scanf("%d", &am.vertex_num);
    printf("请输入各个节点值，以空格分隔：");
    getchar();
    for (int i = 0; i < am.vertex_num; i++)
    {
        
        scanf("%c",&(am.vertexArr[i]));
        printf("当前顶点值:%c\n",am.vertexArr[i]);
        getchar();
    }

    
    printf("请输入当前边的数目:");
    scanf("%d", &am.edge_num);
    for (int i = 0; i < am.edge_num; i++)
    {
        getchar();
        printf("请输入两个边，以及边的权重");
        scanf("%c %c %d", &vt1, &vt2, &weight);
        printf("vt1=%c vt2=%c weight=%d\n",vt1,vt2,weight);
        index1=Location(am.vertexArr, am.vertex_num, vt1);
        index2=Location(am.vertexArr, am.vertex_num, vt2);
        printf("index1=%d index2=%d\n",index1,index2);
        am.AMArr[index1][index2]=weight;
        am.AMArr[index2][index1]=weight;
    }
    return am;

}

int Location(const vertex_type *arr, int length, char vertex){
    for (int i = 0; i < length; i++)
    {
        printf("arr[i]=%c\n",arr[i]);
        if (arr[i] == vertex)
        {
            return i;
        }
        
    }
    return -1;  
}

void show(AMGraph am){
    for (int i = 0; i < am.vertex_num; i++)
    {
        for (int j = 0; j < am.vertex_num; j++)
        {
            printf("%d ",am.AMArr[i][j]);
        }
        printf("\n");
    }
    
}