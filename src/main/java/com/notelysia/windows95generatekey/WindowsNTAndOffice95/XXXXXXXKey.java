
package com.notelysia.windows95generatekey.WindowsNTAndOffice95;


import java.util.Random;

public class XXXXXXXKey {
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
