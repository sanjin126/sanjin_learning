
#include <iostream>
#include <time.h>
using namespace std;

typedef int ElemType;
typedef struct search_table
{
    ElemType *data;
    int length;
}search_table;

void init_serch_table(search_table &table);
void printn(string s);
void total_time(int (*sort)(ElemType, search_table), search_table table, string fun_name);