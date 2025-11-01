///////////////////////////////////////////////////////////
//
// Function Name : printOddNumbers
// Description :   Prints all odd numbers up to N
// Input :         int
// Output :        void (Prints the numbers)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void printOddNumbers(int n)
    { 
        System.out.println("Odd numbers up to " + n + ":");
        for (int i = 1; i <= n; i++)
        {
            // Check if the number is odd
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}
class Program3_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}

