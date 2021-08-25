#include <stdio.h>

int main(void)
{
    const int MIN_PER_HOUR = 60;
    int time;

    printf("Enter a time(min):");
    scanf("%d", &time);
    while(time > 0)
    {
        printf("Now is %dh%dm.\n", time/MIN_PER_HOUR, time%MIN_PER_HOUR);
        printf("Enter a time(min):");
        scanf("%d", &time);
    }

    return 0;
}