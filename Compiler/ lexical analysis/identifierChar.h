
void add(char str[], int code);
void initIdentifierChar();

#define $ID 6

typedef struct identifierChar
{
    char str[10];
    int code;
    struct identifierChar *next;
} idnNode, * idnHead, identifierChar;

idnHead find(char str[]);
idnHead insertId(char str[]);