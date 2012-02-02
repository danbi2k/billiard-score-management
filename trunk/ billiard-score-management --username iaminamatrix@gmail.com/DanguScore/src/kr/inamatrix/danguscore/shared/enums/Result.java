/**
 * 
 */
package kr.inamatrix.danguscore.shared.enums;

/**
 * Title: Result.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 30.
 * @modified 2012. 1. 30.
 */
public enum Result {
    SUCESS(true), FAILURE(false);
    
    boolean _bool;
    Result(boolean b) {
        _bool = b;
    }
    
    public boolean status() {
        return _bool;
    }
}
