///////////////////////////////////////////////////////////
//
// Function Name : sumEvenNumbers
// Description :   Calculates the sum of even numbers up to N
// Input :         int (n)
// Output :        void (Prints the sum)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers(int n)
    { 
        int sum = 0;
        
        if (n < 2)
        {
            System.out.println("No even numbers to sum.");
            return;
        }

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers up to " + n + " is: " + sum);
    }
}
class Program5_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}

