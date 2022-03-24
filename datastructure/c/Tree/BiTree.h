#ifndef _BITREE_H
#define _BITREE_H

typedef char ElemType;
typedef struct BiTree
{
    ElemType data;
    struct BiTree *lChild, *rChild; 
}BiNode, *BiTree;
#if !defined(_GENERICS_)
#define _GENERICS_
typedef BiTree Generics;

#endif // _GENERICS_

#define preOrderMethod 0
#define inOrderMethod 1
#define postOrderMethod 2
#define inOrderByStackMethod 3
#define levelOrderMethod 4


bool preOrder(const BiTree t);
void showBiTree(const BiTree t, int method);
bool inOrder(const BiTree t);
bool postOrder(const BiTree t);
bool inOrderByStack(BiTree t);
BiTree createBiTree(BiTree t);
bool levelOrder(BiTree t);

#endif