#include "seq_table.h"
void total_time(int (*sort)(ElemType, search_table), search_table table, string fun_name)
{
    clock_t start, end;
    int item;
    long int i = 2<<16;
    int index;
    printn("------"+fun_name+"-------");
    printn("请输入你要查找的数据:");
    cin >> item;
    start = clock();
    while (i--)
    {    
        index = sort(item, table);
    }
    end = clock();
    cout << "您要找的数据在:" << index << "位置处" << endl;
    cout << fun_name <<"所花费时间为:" << (end-start) << endl;
    printn("---------------------");

}

void init_serch_table(search_table &table){
    printn("请输入总共数据个数:");
    scanf("%d", &table.length);

    table.data = new ElemType[table.length+1]; //0号位置不使用
        printn("请输入数据:");
    for (int i = 1; i <= table.length; i++)
    {
        scanf("%d", &table.data[i]);
        // table.data[i] = (rand()%1000);
    }
    

}

void printn(string s)
{
    cout<<s<<endl;
}