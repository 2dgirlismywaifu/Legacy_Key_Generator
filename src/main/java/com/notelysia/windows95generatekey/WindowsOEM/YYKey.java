/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.notelysia.windows95generatekey.WindowsOEM;

import java.util.Random;

public class YYKey {
    //Generate random number with 2 digits. Start from 95 to 03 (last key must not be 03 in Windows 95)
    public String generateWin95Key() {
        int[] arr = {95, 96, 97, 98, 99, 0, 1, 2, };
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
    public String generateWinNTKey() {
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
