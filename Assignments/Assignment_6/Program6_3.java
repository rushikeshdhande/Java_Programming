///////////////////////////////////////////////////////////
//
// Function Name : displayFactors
// Description :   Displays all factors of a given number
// Input :         int (num)
// Output :        void (Prints the factors)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void displayFactors(int num)
    {
        // logic
        if (num <= 0)
        {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        System.out.print("Factors of " + num + ": ");
         
        for (int i = 1; i <= num; i++)
        {
            // Check if 'i' is a factor
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();  
    }
}
class Program6_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}

