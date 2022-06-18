#include "seq_table.h"


typedef struct BTree
{
    ElemType data;
    struct BTree *lchid, *rchild;
}*BTreeSerch, BTreeNode;

void inseart(ElemType e, BTreeSerch &tree);
bool compareToRight(ElemType e1, ElemType e2);
void inOrder(const BTreeSerch tree);
BTreeNode* find(ElemType item, const BTreeSerch tree);
