///////////////////////////////////////////////////////////
//
// Function Name : checkLeapYear
// Description :   Checks if a given year is a leap year
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void checkLeapYear(int year) {
        // It is divisible by 4 AND not divisible by 100

        // It is divisible by 400

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

class Program4_1 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}
