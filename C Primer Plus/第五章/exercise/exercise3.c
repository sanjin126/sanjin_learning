#include <stdio.h>

int main(void)
{
    int days;
    const int DAYS_PER_WEEK = 7;

    printf("Enter a day num:");
    scanf("%d", &days);
    while(days > 0){
        printf("%d days are %d weeks, %d days.\n",
                days,
                days/DAYS_PER_WEEK,
                days % DAYS_PER_WEEK);
        printf("Enter a day num:");
        scanf("%d", &days);
    }
    return 0;
}