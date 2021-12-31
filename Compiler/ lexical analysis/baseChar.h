
#define $DIM 1
#define $IF 2
#define $DO 3
#define $STOP 4
#define $END 5

#define $INT 7
#define $ASSIGN 8
#define $PLUS 9
#define $STAR 10
#define $POWER 11
#define $COMMA 12
#define $LPAR 13
#define $RPAR 14
#define $SEMICOLON 15




typedef struct baseChar
{
    char str[10];
    int typeCode;
    struct baseChar *next;
} baseCharNode, * baseCharhead, baseChar;

baseCharhead head;
baseCharhead tail;

void init();

int reserve(char str[]);

void showBaseChar();



