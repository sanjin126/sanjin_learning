#include "sequence_find.h"
#include "seq_table.h"

int main(void)
{
    search_table table;

    init_serch_table(table);
    printn("------数据展示--------");
    for (int i = 1; i <= table.length; i++)
    {
        printf("%d ", table.data[i]);
    }
    printn("\n-------------------");
    total_time(seq_find, table, "顺序查找");
    total_time(binary_find, table, "二分查找");
    
}



int seq_find(ElemType item, search_table table)
{
    int i;

    table.data[0] = item;
    for (i = table.length; table.data[i] != item; i--);
    return i;
}

int binary_find(ElemType item, search_table table)
{
    int low=1, mid, high=table.length;
    mid = (high+low)/2;

    while (low <= high)
    {
        if (table.data[mid] > item)
            high = mid - 1;
        else if (table.data[mid] < item)
            low = mid + 1;
        else
            return mid;
        mid = (high+low) / 2;
    }
    return 0;
    

}




