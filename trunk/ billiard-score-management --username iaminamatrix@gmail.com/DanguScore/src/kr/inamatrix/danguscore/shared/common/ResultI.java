/**
 * 
 */
package kr.inamatrix.danguscore.shared.common;

import java.io.Serializable;


/**
 * Title: ResultI.java<br>
 * Description: Result를 반환하는 Interface<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 30.
 * @modified 2012. 1. 30.
 */
public interface ResultI extends Serializable {
    public boolean status();
    public Object getResult();
}
