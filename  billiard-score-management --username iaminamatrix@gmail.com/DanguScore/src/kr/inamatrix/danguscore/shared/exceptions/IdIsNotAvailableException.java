/**
 * 
 */
package kr.inamatrix.danguscore.shared.exceptions;

/**
 * Title: IdIsNotAvailableException.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 2. 6.
 * @modified 2012. 2. 6.
 */
public class IdIsNotAvailableException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public IdIsNotAvailableException() {
        super("ID is not available.");
    }
}
