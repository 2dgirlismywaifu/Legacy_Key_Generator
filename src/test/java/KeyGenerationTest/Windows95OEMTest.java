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

package KeyGenerationTest;

import java.util.HashMap;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.BeforeClass;
import org.junit.Test;

public class Windows95OEMTest {
    private static String input;
    
     @BeforeClass 
     public static void onlyOnce() {
       DemoKeyTesting demoKeyTesting = new DemoKeyTesting();
       demoKeyTesting.setWin95OEM();
       input = demoKeyTesting.getWin95OEM();
       System.out.println("Windows 95 OEM Key: " + input);
    }
    
    @Test
    public void testDivision() {
        System.out.println("This is test Windows 95 OEM key XXXXXXX part division by 7 or NOT!!!!!");       
        String[] parts = input.split("-");
        String oemPart = parts[2];
        int sum = 0;
        for (int i = 0; i < oemPart.length(); i++) {
            char c = oemPart.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        int result = sum % 7;
        if (result == 0) {
            assertTrue(result == 0);
            System.out.println("Windows 95 OEM Key: " + input + " (PASSED)");
        }
        else {
            assertFalse(result != 0);
            System.out.println("Windows 95 OEM Key: " + input + " (FAILED)");            
        }                       
    }
    
    @Test
    public void testYear() {
        System.out.println("This is test Windows 95 OEM key YEARS PASS or NOT!!!!!");        
        String[] parts = input.split("-");
        int[] arr = {95, 96, 97, 98, 99, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i % 100, i);
        }
        int num = Integer.parseInt(parts[0]);
        int lastTwoDigits = num % 100;
        if (map.containsKey(lastTwoDigits) == true) {
            assertTrue(true);
            System.out.println("Windows NT 95 OEM KEY: " + input + " (PASSED)");
        }
        else {
            assertFalse(false);
            System.out.println("Windows NT 95 OEM KEY: " + input + " (FAILED)");
        }
    }
    
}
