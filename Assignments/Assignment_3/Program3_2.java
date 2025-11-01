///////////////////////////////////////////////////////////
//
// Function Name : printEvenNumbers
// Description :   Prints all even numbers up to N
// Input :         int
// Output :        void (Prints the numbers)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void printEvenNumbers(int n)
    {
         System.out.println("Even numbers up to " + n + ":");
        for (int i = 1; i <= n; i++)
        {
            // Check if the number is even
            if (i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}
class Program3_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}

