#include <stdio.h>
#include <float.h>

int main(void)
{
    // double num1 = 1.0/3.0;
    // float num2 = 1.0/3.0;
    // printf("double is %f, float is %f\n", num1, num2);
    // printf("double is %.12f, float is %.12f\n", num1, num2);
    // printf("double is %.16f, float is %.16f\n", num1, num2);
    // printf("FLT_DIG is %d, DBL_DIG is %d\n", FLT_DIG, DBL_DIG);

    double db_one_third = 1.0 / 3.0;
	float ft_one_third = 1.0 / 3.0;

	printf("Float                Double              \n");
	printf("-------------------- --------------------\n");
	printf("%-20.4f %-20.4f\n", ft_one_third, db_one_third); // show 4 digits
	printf("%-20.12f %-20.12f\n", ft_one_third, db_one_third); // show 12 digits
	printf("%-20.16f %-20.16f\n", ft_one_third, db_one_third);
	printf("\n");
	printf("FLT_DIG: %d\n", FLT_DIG);
	printf("DBL_DIG: %d\n", DBL_DIG);

	/* results: both float and double are accurate to at least the amount of sig
	figs specified by FLT_DIG and DBL_DIG */

	return 0;
}