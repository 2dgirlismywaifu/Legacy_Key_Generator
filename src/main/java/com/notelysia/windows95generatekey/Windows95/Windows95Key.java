
package com.notelysia.windows95generatekey.Windows95;


public class Windows95Key {
    
    String XXXKey = new XXXKey().generateKey();
    String YYKey = new YYKey().generateKey();
    String NNKey = new NKey().getNNKeyReturn();
    String SSSSSKey = new SSSSSSKey().generateKey();
    String ZZZZZKey = new ZZZZZKey().generateKey();
    String Windows95Key = XXXKey + YYKey + "-OEM-" + NNKey + SSSSSKey + "-" + ZZZZZKey;

    
     public String getWindows95Key() {
        return Windows95Key;
    }
    
}
