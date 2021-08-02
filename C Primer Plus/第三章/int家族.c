/* 测试int, long, short, unsigned...存储空间大小 */
#include <stdio.h>

int main(void)
{
    short aShort=128;
    printf("sizeof(aShort)=%zd\n",sizeof(aShort));    
    int aInt;   
    printf("sizeof(aInt)=%zd\n",sizeof(aInt));
    long aLong;
    printf("sizeof(aLong))=%zd\n",sizeof(aLong));
    long long aLongLong;
    printf("sizeof(aLongLong)=%zd\n",sizeof(aLongLong));
    unsigned aUnsigned;
    printf("sizeof(aUnsigned)=%zd\n",sizeof(aUnsigned));    
}