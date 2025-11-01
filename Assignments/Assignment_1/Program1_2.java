///////////////////////////////////////////////////////////
//
// Function Name : checkEvenOdd
// Description :   Checks if a given number is even or odd
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void checkEvenOdd(int num)
    {
        // Write logic here
        if (num % 2 == 0)
        {
            System.out.println(num + " is Even");
        }
        else
        {
            System.out.println(num + " is Odd");
        }
    }
}
class Program1_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}
