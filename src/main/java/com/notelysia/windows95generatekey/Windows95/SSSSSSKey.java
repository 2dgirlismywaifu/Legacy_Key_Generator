
package com.notelysia.windows95generatekey.Windows95;

import java.util.Random;
public class SSSSSSKey {
    //Generate random number with 6 digits. Sum of digits in it is divisible by 7. If not, generate again until it is divisible by 7
    public String generateKey() {
        Random rand = new Random();
        int num = rand.nextInt(900000) + 100000;
        while (sumOfDigits(num) % 7 != 0) {
            num = rand.nextInt(900000) + 100000;
        }
        return String.valueOf(num);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
