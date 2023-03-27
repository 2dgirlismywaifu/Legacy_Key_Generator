
package com.notelysia.windows95generatekey.Windows95;

public class YYKey {
    //Generate random number with 2 digits. Start from 03 to 95
    public String generateKey() {
        int random = (int) (Math.random() * 93) + 3;
        String key = String.valueOf(random);
        if (key.length() == 1) {
            key = "0" + key;
        }
        return key;
    }
}
