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
    
    public static final boolean isEquals(String str1, String str2) {
        if (isEmptyString(str1) == isEmptyString(str2)) {
            return true;
        }
        
        if (!isEmptyString(str1)) {
            return str1.equals(str2);
        }
        
        if (!isEmptyString(str2)) {
            return str2.equals(str1); 
        }
        
        return str1.equals(str2);
    }
}
