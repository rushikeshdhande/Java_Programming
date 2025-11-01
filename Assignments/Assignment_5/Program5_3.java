///////////////////////////////////////////////////////////
//
// Function Name : checkPerfect
// Description :   Checks if a number is a perfect number
// Input :         int (num)
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int num)
    {
        // Write logic here
        int sumOfFactors = 0;

        // A perfect number must be positive
        if (num < 1)
        {
            System.out.println(num + " is not a perfect number (must be positive).");
            return;
        }

        // Find sum of proper divisors
        // We only need to check up to num / 2
        for (int i = 1; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                sumOfFactors = sumOfFactors + i;
            }
        }

        // Check if sum of factors equals the number
        if (sumOfFactors == num)
        {
            System.out.println(num + " is a perfect number.");
        }
        else
        {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
class Program5_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}

