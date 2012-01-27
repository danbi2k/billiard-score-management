/**
 * 
 */
package kr.inamatrix.danguscore.exceptions;

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
public class ValueOutOfBoundException extends Exception{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public ValueOutOfBoundException(int min, int max) {
        super("The value must be within the range. " + min + "<= value <=" + max);
    }
}
