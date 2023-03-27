
package com.notelysia.windows95generatekey.WindowsNTAndOffice95;

import java.util.Random;

public class XXXKey {
    //generates a random number with 3 digits and checks if it’s equal to 333 or 444. 
    //If it is, it generates another random number until it’s not equal to 333 or 444
    public String generateKey() {
        Random rand = new Random();
        int num = rand.nextInt(900) + 100;
        while (num == 333 || num == 444) {
            num = rand.nextInt(900) + 100;
        }
        return String.valueOf(num);
    }
}
