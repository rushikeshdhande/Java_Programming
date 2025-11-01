///////////////////////////////////////////////////////////
//
// Function Name : checkSign
// Description :   Checks if a number is positive, negative, or zero
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void checkSign(int num)
    { 
        if (num > 0)
        {
            System.out.println(num + " is a positive number.");
        }
        else if (num < 0)
        {
            System.out.println(num + " is a negative number.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
    }
}
class Program3_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}

