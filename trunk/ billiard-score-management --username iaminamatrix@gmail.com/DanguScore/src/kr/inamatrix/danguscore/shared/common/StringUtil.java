/**
 * 
 */
package kr.inamatrix.danguscore.shared.common;

/**
 * Title: StringUtil.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 13.
 * @modified 2012. 1. 13.
 */
public class StringUtil {
    private StringUtil() {
        
    }
    
    public static final boolean isEmptyString(String str) {
        if (str == null || str.length() == 0 || "".equals(str)) {
            return true;
        }
        
        return false;
    }
}
