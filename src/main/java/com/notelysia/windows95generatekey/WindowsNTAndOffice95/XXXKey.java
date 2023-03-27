
package com.notelysia.windows95generatekey.WindowsNTAndOffice95;

import java.util.Random;

public class XXXKey {
    //generates a random number with 3 digits 
    public String generateKey() {
        Random rand = new Random();
        int num = rand.nextInt(900) + 100;
        return String.valueOf(num);
    }
}
