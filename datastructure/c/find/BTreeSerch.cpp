#include "BTreeSerch.h"




int main(void){
    BTreeSerch tree = NULL;
    ElemType item;

    inseart(6, tree);
    inseart(2, tree);
    inseart(1, tree);
    inseart(3, tree);
    inseart(5, tree);
    inseart(8, tree);
    cout << "-------中序遍历------" << endl;
    inOrder(tree);
    cout << endl;
    cout << "--------------------" << endl;
    cout << "请输入你要查询的值:" << endl;
    cin >> item;
    BTreeNode * ptrToNode = find(item, tree);
    if (ptrToNode != NULL)
    {
        BTreeNode *lnode =  ptrToNode->lchid;
        BTreeNode *rnode =  ptrToNode->rchild;
        cout << "你要查询的值找到了," << "值为：" << ptrToNode->data << endl
        << "左孩子为" <<  (lnode != NULL ? to_string(lnode->data) : "没有   ") << endl 
        << "右孩子为" << (rnode != NULL ? to_string(rnode->data) : "没有") ;
    } 
    else
        cout << "没找到"; 
    cout << endl;
    
    return 0;
}

BTreeNode* find(ElemType item, const BTreeSerch tree)
{
    if (tree == NULL)
        return NULL;
    if (tree->data == item)
        return tree;
    else if (compareToRight(item, tree->data))
        find(item, tree->rchild);
    else
        find(item, tree->lchid);
    
}


void inseart(ElemType e, BTreeSerch &tree)
{
    if (tree==NULL)
    {
        BTreeNode *node = new BTreeNode;
        node->data=e;
        node->lchid = node->rchild = NULL;
        tree = node;
    } else {
        if (compareToRight(e, tree->data))
            inseart(e, tree->rchild);
        else 
            inseart(e, tree->lchid);
    }
    
}

void inOrder(const BTreeSerch tree)
{
    if (tree == NULL)
        return;
    
    inOrder(tree->lchid);
    cout << " " << tree->data;
    inOrder(tree->rchild);
}


bool compareToRight(ElemType e1, ElemType e2)
{
    return e1 >= e2 ? true : false;
}