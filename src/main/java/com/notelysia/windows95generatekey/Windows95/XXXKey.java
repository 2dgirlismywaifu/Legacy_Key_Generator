
package com.notelysia.windows95generatekey.Windows95;

public class XXXKey {
    //Generate random number with 3 digits. Start from 001 to 366
    public String generateKey() {
        int random = (int) (Math.random() * 366) + 1;
        String key = String.valueOf(random);
        if (key.length() == 1) {
            key = "00" + key;
        } else if (key.length() == 2) {
            key = "0" + key;
        }
        return key;
    }
}
