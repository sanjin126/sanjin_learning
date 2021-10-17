#include <stdio.h>

int main(void)
{
    char c;

    while (( c = getchar() ) != '#')
    {
        putchar(c);
    }

    return 0;
}