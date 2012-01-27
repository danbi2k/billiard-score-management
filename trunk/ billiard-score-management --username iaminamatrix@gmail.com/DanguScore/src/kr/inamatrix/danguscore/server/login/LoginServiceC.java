/**
 * 
 */
package kr.inamatrix.danguscore.server.login;

import kr.inamatrix.danguscore.client.login.LoginServiceI;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Title: LoginServiceC.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 26.
 * @modified 2012. 1. 26.
 */
public class LoginServiceC extends RemoteServiceServlet implements LoginServiceI {
    /**
     * 
     */
    private static final long serialVersionUID = 4630515384434604996L;

    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.client.LoginServiceI#greetServer(java.lang.String)
     */
    @Override
    public String greetServer(String textToServer) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
