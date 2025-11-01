///////////////////////////////////////////////////////////
//
// Function Name : findMax
// Description :   Finds the maximum of two numbers
// Input :         int, int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void findMax(int a, int b)
    { 
        if (a > b)
        {
            System.out.println("Maximum number is: " + a);
        }
        else if (b > a)
        {
            System.out.println("Maximum number is: " + b);
        }
        else
        {
            System.out.println("Both numbers are equal: " + a);
        }
    }
}
class Program2_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}

