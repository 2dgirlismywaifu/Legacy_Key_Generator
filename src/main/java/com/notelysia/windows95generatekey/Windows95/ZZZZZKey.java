
package com.notelysia.windows95generatekey.Windows95;

import java.util.Random;

public class ZZZZZKey {
    //Generate random number with 5 digits
    public String generateKey() {
        Random rnd = new Random();
        int number = rnd.nextInt(99999);
        String ZZZZZKeyReturn = String.format("%05d", number);
        return ZZZZZKeyReturn;
    }
}
