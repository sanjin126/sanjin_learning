#include <stdio.h>

int main(void)
{
    char uppercase_letter;
    char c1, c2;

    printf("Enter a uppercase_letter:");
    scanf("%c", &uppercase_letter);
    
    for (c1 = 'A'; c1 <= uppercase_letter; c1++)
    {
        for (int i = uppercase_letter - c1; i > 0; i--)
        {
            printf(" ");
        }
        for (c2 = 'A'; c1 - c2 >= 0; c2++)
        {
                printf("%c", c2);
        }
        for (char c =c1-1; c >='A'; c--)
        {
            printf("%c", c);
        }
        
        printf("\n");
    }
    return 0;
}

// #include <stdio.h>

// void print_spaces(unsigned int n);

// int main(void)
// {
// 	char uppercase_letter;
// 	char c1, c2;

// 	do // get uppercase letter from user
// 	{
// 		printf("Enter an uppercase letter: ");
// 		scanf(" %c", &uppercase_letter);
// 	} while (uppercase_letter < 'A' || 'Z' < uppercase_letter);

// 	for(c1 = 'A'; c1 <= uppercase_letter; c1++)
// 	{
// 		// print opening spaces
// 		print_spaces(uppercase_letter - c1);

// 		// print letters
// 		// ascending
// 		for (c2 = 'A'; c2 < c1; c2++)
// 		{
// 			printf("%c", c2);

// 		}
// 		// descending
// 		for (; 'A' <= c2; c2--)
// 		{
// 			printf("%c", c2);
// 		}

// 		// print closing spaces
// 		print_spaces(uppercase_letter - c1);
// 		printf("\n");
// 	}

// 	return 0;
// }

// void print_spaces(unsigned int n)
// {
// 	for (int i = 0; i < n; i++)
// 	{
// 		printf(" ");
// 	}
// }