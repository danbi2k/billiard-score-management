/**
 * 
 */
package kr.inamatrix.danguscore.shared.exceptions;

/**
 * Title: PasswordDoesNotConfirmException.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 2. 3.
 * @modified 2012. 2. 3.
 */
public class PasswordDoesNotConfirmException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public PasswordDoesNotConfirmException() {
        super("Password and password confirm are not same.");
    }
}
