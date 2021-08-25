#include <stdio.h>

int main(void)
{
    int num1, num2;

    printf("Enter a num as table_start:");
    scanf("%d", &num1);
    printf("Enter a num as table_end:");
    scanf("%d", &num2);

    printf("num        |num^2      |num^3      \n");
    printf("-----------|-----------|-----------\n");
    for (int i = num1; i <= num2; i++){
        printf(" %-10d| %-10d| %-10d\n", i, i*i, i*i*i);
    }

    return 0;
}