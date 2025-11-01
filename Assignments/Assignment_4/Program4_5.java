////////////////////////////////////////////////////////////////
//
// Function Name : calculatePower
// Description :   Calculates the power of a number using loops
// Input :         int (base), int (exponent)
// Output :        void  
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
//////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int base, int exp)
    { 
        long result = 1;

        if (exp < 0)
        {
            System.out.println("Exponent should be non-negative.");
            return;
        }

        // Handle base cases
        if (exp == 0)
        {
            System.out.println(base + " raised to the power 0 is: 1");
            return;
        }
        
        for (int i = 1; i <= exp; i++)
        {
            result = result * base;
        }
        
        System.out.println(base + " raised to the power " + exp + " is: " + result);
    }
}
class Program4_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}

