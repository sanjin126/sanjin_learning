/*把年龄转化为天数,不考虑闰年*/
#include <stdio.h>

int main(void)
{
    int age,myagedays;
    age = 20;
    myagedays = age * 365;
    printf("age=%d\nagedays=%d\n",age,myagedays);
    return 0;
}

