/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 8/10/2020
 *   Time: 5:08 PM
 *   File: NumberToWords.java
 */

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
    }
//program to return number into words.

    //method to return number entered by user in words.
    public static void numberToWords(int number) {
        int digit;
        if (number < 0) {
            System.out.println("invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        int reverseNumber = reverse(number);
        int zeros = getDigitCount(number) - getDigitCount(reverseNumber);
        while (reverseNumber != 0) {
            digit = reverseNumber % 10;
            reverseNumber /= 10;
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            if (number == 0) {
                System.out.print("Zero");
            }
        }
        for (int i = 0; i < zeros; i++) {
            System.out.print("Zero ");
        }


    }

    // method to reverse the number
    public static int reverse(int number) {
        int remainder;
        int newNumber = 0;
        while (number != 0) {
            remainder = number % 10;
            newNumber = newNumber * 10 + remainder;
            number = number / 10;
        }
        return newNumber;

    }

    //method to calculate the digit count.
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        if (number > 0) {
            while (number > 0) {
                int temp = number % 10;
                number /= 10;
                count++;
            }
            return count;
        }
        return 1;
    }
}

