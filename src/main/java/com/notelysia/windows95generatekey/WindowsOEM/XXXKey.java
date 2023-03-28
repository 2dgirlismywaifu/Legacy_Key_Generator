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
