///////////////////////////////////////////////////////////
//
// Function Name : calculateSum
// Description :   It is used to calculate the sum of first N natural numbers
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void calculateSum(int n)
    { 
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

class Program1_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}