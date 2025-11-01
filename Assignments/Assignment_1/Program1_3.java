///////////////////////////////////////////////////////////
//
// Function Name : findFactorial
// Description :   Calculates the factorial of a given number
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void findFactorial(int num)
    {
         long fact = 1; // Use long to handle larger factorials
        
        if (num < 0)
        {
            System.out.println("Factorial of a negative number is not defined.");
            return;
        }

        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
class Program1_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}

