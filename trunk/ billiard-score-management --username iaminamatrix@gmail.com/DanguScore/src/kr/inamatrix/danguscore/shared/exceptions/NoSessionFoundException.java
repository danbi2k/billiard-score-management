/**
 * 
 */
package kr.inamatrix.danguscore.shared.exceptions;

/**
 * Title: NoSessionFoundException.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 2. 6.
 * @modified 2012. 2. 6.
 */
public class NoSessionFoundException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public NoSessionFoundException() {
        super("No session found.");
    }
    
}
