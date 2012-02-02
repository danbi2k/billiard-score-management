/**
 * 
 */
package kr.inamatrix.danguscore.server.login;

import kr.inamatrix.danguscore.shared.common.ResultI;

/**
 * Title: LoginDAO.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public interface LoginDaoI {
    ResultI login(String name, String password);
}
