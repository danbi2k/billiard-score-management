/**
 * 
 */
package kr.inamatrix.danguscore.client.login;


import kr.inamatrix.danguscore.shared.common.ResultI;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Title: LoginService.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 26.
 * @modified 2012. 1. 26.
 */
@RemoteServiceRelativePath("login")
public interface LoginServiceI extends RemoteService {
    ResultI login(String name, String password);
}
