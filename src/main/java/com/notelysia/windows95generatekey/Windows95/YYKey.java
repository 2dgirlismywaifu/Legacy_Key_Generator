
package com.notelysia.windows95generatekey.Windows95;

import java.util.Random;

public class YYKey {
    //Generate random number with 2 digits. Start from 95 to 03 (last key must not be 03)
    public String generateKey() {
        int[] arr = {95, 96, 97, 98, 99, 0, 1, 2, 3};
        Random rand = new Random();
        int randomNum = arr[rand.nextInt(arr.length)];
        String result;
        if (randomNum == 0) {
          result = "00";
        } else {
          result = String.valueOf(randomNum);
          if (result.length() == 1) {
            result = "0" + result;
          }
        }
        return result;
        }
}
