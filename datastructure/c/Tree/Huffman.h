
typedef char Elemtype;
typedef struct Huffman
{
    Elemtype data;
    int weight;
    int parent, lch, rch;
} HfNode,*Hf;

#define dataNum 6
#define N (dataNum*2-1)

int weight[dataNum]={4,7,1,2,8,3};

Hf init();
void fillData(Hf hf);
void show(Hf);
void findLowTowNode(int *,int *, int*);
void create(Hf);