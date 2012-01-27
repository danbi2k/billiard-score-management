/**
 * 
 */
package kr.inamatrix.danguscore.server.login;

import java.util.logging.Level;
import java.util.logging.Logger;

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

    private static final Logger logger = Logger.getLogger(LoginServiceC.class.getName());
    
    private LoginDaoC _loginDao = new LoginDaoC();
    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.client.login.LoginServiceI#login(java.lang.String, java.lang.String)
     */
    @Override
    public boolean login(String name, String password) {
        logger.log(Level.FINE, "login() name = " + name + ", password = " + password);
        return _loginDao.login(name, password);
    }
}
