
typedef int ElemType;

typedef struct BiTree
{
    ElemType data;
    struct BiTree *lChild, *rChild; 
}BiNode, *BiTree;

#define preOrderMethod 0
#define midOrderMethod 1
#define postOrderMethod 2

bool preOrder(const BiTree t);
void showBiTree(const BiTree t, int method);
bool midOrder(const BiTree t);
bool postOrder(const BiTree t);

