
package com.notelysia.windows95generatekey.Windows95;

import java.util.Random;
public class SSSSSKey {
    //Generate random number with 5 digits. Sum of digits in it is divisible by 7. If not, generate again until it is divisible by 7
    public String generateKey() {
        Random rand = new Random();
        int num = rand.nextInt(90000) + 10000;
        int sum = 0;
        while (sum % 7 != 0) {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = rand.nextInt(90000) + 10000;
        }
        return String.valueOf(num);
    
    }

}
