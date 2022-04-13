
#define max_vertex_num 100
#define INF (1<<31)-1
typedef char vertex_type;
typedef int edge_weight_type;
typedef struct AMGraph
{
    vertex_type vertexArr[max_vertex_num];
    edge_weight_type AMArr[max_vertex_num][max_vertex_num];
    int vertex_num,edge_num;
}AMGraph;

AMGraph createAMGraph();
int Location(const vertex_type *arr, int length, char vertex);
void show(AMGraph);
