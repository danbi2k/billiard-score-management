/**
 * 
 */
package kr.inamatrix.danguscore.shared.exceptions;

/**
 * Title: ValueOutOfBoundException.java<br>
 * Description: 범위가 벗어난 값에 대해 exception을 던진다.<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public class ValueIsOutOfRangeException extends Exception{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public ValueIsOutOfRangeException(int min) {
        super("The minimum must be over " + min);
    }
    
    public ValueIsOutOfRangeException(int min, int max) {
        super("The value must be within the range. " + min + "<= value <=" + max);
    }
}
