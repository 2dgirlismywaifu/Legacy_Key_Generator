
package com.notelysia.windows95generatekey.WindowsNTAndOffice95;


import java.util.Random;

public class XXXXXXXKey {
    //Generate random number with 7 digits. Sum of digits in it is divisible by 7. 
    //If first digit, second digit and third digit start with 3 ... 9 , generate it again. The last digit must not be 0, 8 and 9. (Windows 95 RTM)
    
    
    
//    This code generates a random number between 1000000 and 9999999 (inclusive), 
//    then checks if its first three digits are equal to 333 ... 999. 
//    If so, it generates another random number until it finds one that satisfies the conditions.
//    It also checks if the sum of digits in the number is divisible by 7. 
//    If not, it generates another random number until it finds one that satisfies all conditions.
    
    public String generateWin95RTMKey() {
         Random rand = new Random();
        int num = rand.nextInt(9000000) + 1000000;
        while (num / 1000000 == 333 || 
               num / 1000000 == 444 ||
               num / 1000000 == 555 ||
               num / 1000000 == 666 ||
               num / 1000000 == 777 ||
               num / 1000000 == 888 ||
               num / 1000000 == 999 ||
              (num / 100000) % 10 == 3 || 
              (num / 100000) % 10 == 4 ||
              (num / 100000) % 10 == 5 ||
              (num / 100000) % 10 == 6 ||
              (num / 100000) % 10 == 7 ||
              (num / 100000) % 10 == 8 ||
              (num / 100000) % 10 == 9 ||
              (num / 10000) % 10 == 3 || 
              (num / 10000) % 10 == 4 || 
              (num % 10 == 0 || num % 10 == 8 || num % 10 == 9) || 
                sumOfDigits(num) % 7 != 0) {
            num = rand.nextInt(9000000) + 1000000;
        }
        return String.valueOf(num);
    }

    
    public String generateKey() {
        Random rand = new Random();
        int num = rand.nextInt(9000000) + 1000000;
        while (sumOfDigits(num) % 7 != 0) {
            num = rand.nextInt(9000000) + 1000000;
        }      
        return String.valueOf(num);
    }
    
    
    public  int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
