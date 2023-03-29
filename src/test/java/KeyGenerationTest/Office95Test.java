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

import com.notelysia.windows95generatekey.OfficeKey.Office95;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class Office95Test {
    Office95 office95;
    String input;
    @Before
    public void setUp() {
        office95 = new Office95();
        input = office95.getOffice95Key();
    }
    
    @Test
    public void testDivision() {
        System.out.println("This is text Office 95 key XXXXXXX part division by 7 or NOT!!!!!");
        System.out.println(input);
        String[] parts = input.split("-");
        int sum = 0;
        for (char c : parts[1].toCharArray()) {
            sum += Character.getNumericValue(c);
        }        
        int result = sum % 7;
        if (result == 0) {
            assertTrue(result == 0);
            System.out.println("Microsoft Office 95 Key: " + input + " (PASSED)");
        }
        else {
            assertFalse(result != 0);
            System.out.println("Microsoft Office 95 Key: " + input + " (FAILED)");            
        }                       
    }  
}
