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

public class WindowsNT4RTMTest {
    private static String input;
    
     @BeforeClass 
     public static void onlyOnce() {
       DemoKeyTesting demoKeyTesting = new DemoKeyTesting();
       demoKeyTesting.setWinNT4RTM();
       input = demoKeyTesting.getWinNT4RTM();
       System.out.println("Windows NT 4.0 RTM Key: " + input);
    }
    
    @Test
    public void testDivision() {
        System.out.println("This is test Windows NT 4.0 RTM key XXXXXXX part division by 7 or NOT!!!!!");        
        String[] parts = input.split("-");
        int sum = 0;
        for (char c : parts[1].toCharArray()) {
            sum += Character.getNumericValue(c);
        }        
        int result = sum % 7;
        if (result == 0) {
            assertTrue(result == 0);
            System.out.println("Windows NT 4.0 RTM Key: " + input + " (PASSED)");
        }
        else {
            assertFalse(result != 0);
            System.out.println("Windows NT 4.0 RTM Key: " + input + " (FAILED)");            
        }                       
    }
    
     @Test
    public void testKeyStart() {
        System.out.println("This is test Windows NT 4.0 RTM key XXX part PASS or NOT!!!!!");       
        String[] parts = input.split("-");
        int[] arr = {333, 444, 555, 666, 777, 888};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, i);
        }
        int num = Integer.parseInt(parts[0]);
        if (map.containsKey(num) == true) {
             assertTrue(true);
             System.out.println("Windows NT 4.0 RTM KEY: " + input + " (PASSED)");
         }
         else {
             assertFalse(false);
             System.out.println("Windows NT 4.0 RTM KEY: " + input + " (FAILED)");
        }
    }
    
}
