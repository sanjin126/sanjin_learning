#include <stdio.h>

int main(void)
{
    float dow_speed, file_size;
    const float BITS_PER_BYTE = 8;

    printf("Enter the speed(Mb/s):");
    scanf("%f", &dow_speed);
    printf("Enter the file size(Mb):");
    scanf("%f", &file_size);
    printf("At %.2f megabits per second, a file of %.2f megabytes\n", dow_speed, file_size);
    printf("downloads in %.2f seconds\n", file_size * BITS_PER_BYTE / dow_speed);

    return 0;
}