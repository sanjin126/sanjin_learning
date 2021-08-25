#include <stdio.h>

int main(void)
{
    char name[10];
    float height;

    printf("What's your name:");
    scanf("%s", name);
    printf("Enter your height(cm):");
    scanf("%f", &height);
    printf("%s, your are %.2f m tall.\n", name, height/100.0);

    return 0;
}