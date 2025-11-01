///////////////////////////////////////////////////////////
//
// Function Name : findMin
// Description :   Finds the minimum of three numbers
// Input :         int, int, int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void findMin(int a, int b, int c)
    {
        // Write logic here
        if (a <= b && a <= c)
        {
            System.out.println("Minimum number is: " + a);
        }
        else if (b <= a && b <= c)
        {
            System.out.println("Minimum number is: " + b);
        }
        else
        {
            System.out.println("Minimum number is: " + c);
        }
    }
}
class Program2_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}

