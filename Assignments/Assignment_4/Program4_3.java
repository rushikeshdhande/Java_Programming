///////////////////////////////////////////////////////////
//
// Function Name : checkDivisible
// Description :   Checks if a number is divisible by 5 and 11
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int num)
    {
        //logic
         if ((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println(num + " is divisible by 5 and 11.");
        }
        else
        {
            System.out.println(num + " is not divisible by 5 and 11.");
        }
    }
}
class Program4_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}

