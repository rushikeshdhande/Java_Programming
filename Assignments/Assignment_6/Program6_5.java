///////////////////////////////////////////////////////////
//
// Function Name : printDivisibleBy2and3
// Description :   Prints numbers from 1 to N divisible by 2 and 3
// Input :         int (n)
// Output :        void (Prints the numbers)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void printDivisibleBy2and3(int n)
    { 
        if (n < 1)
        {
            System.out.println("Invalid range.");
            return;
        }

        System.out.println("Numbers divisible by both 2 and 3 (up to " + n + "):");
        
        // Loop from 1 up to n
        for (int i = 1; i <= n; i++)
        {
            // Check if divisible by 2 AND 3
            if ((i % 2 == 0) && (i % 3 == 0))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();  
    }
}
class Program6_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}

