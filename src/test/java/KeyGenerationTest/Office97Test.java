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

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.BeforeClass;
import org.junit.Test;

public class Office97Test {
    private static String input;
    
     @BeforeClass 
     public static void onlyOnce() {
       DemoKeyTesting demoKeyTesting = new DemoKeyTesting();
       demoKeyTesting.setOffice97();
       input = demoKeyTesting.getOffice97();
       System.out.println("Microsoft Office 97 Key: " + input);
    }
    
    @Test
    public void testDivision() {
        System.out.println("This is test Office 97 key XXXXXXX part division by 7 or NOT!!!!!");
        String[] parts = input.split("-");
        int sum = 0;
        for (char c : parts[1].toCharArray()) {
            sum += Character.getNumericValue(c);
        }        
        int result = sum % 7;
        if (result == 0) {
            assertTrue(result == 0);
            System.out.println("Microsoft Office 97 Key: " + input + " (PASSED)");
        }
        else {
            assertFalse(result != 0);
            System.out.println("Microsoft Office 97 Key: " + input + " (FAILED)");            
        }                       
    }  
    
    @Test
    public void testKeyStart() {
        System.out.println("This is test Office 97 key start PASS or NOT!!!!!");       
        boolean result = false;

        if (input.matches("\\d{4}-\\d{7}")) {
            int thirdDigit = Character.getNumericValue(input.charAt(2));
            int lastDigit = Character.getNumericValue(input.charAt(3));

            if (lastDigit == thirdDigit + 1 || lastDigit == thirdDigit + 2) {
                result = true;
            } else if (thirdDigit + 1 > 9 && lastDigit == 0) {
                result = true;
            } else result = thirdDigit + 2 > 9 && lastDigit == 1;
        }

        if (result == true) {
            assertTrue(result);
            System.out.println("Microsoft Office 97 Key: " + input + " (PASSED)");
        }
        else {
            assertFalse(result);
            System.out.println("Microsoft Office 97 Key: " + input + " (FAILED)");            
        }                  
    }
}

