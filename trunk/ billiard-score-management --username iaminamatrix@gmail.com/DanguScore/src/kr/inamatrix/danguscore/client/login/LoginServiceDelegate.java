/**
 * 
 */
package kr.inamatrix.danguscore.client.login;


import java.util.logging.Logger;

import kr.inamatrix.danguscore.shared.common.ResultI;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Title: LoginServiceDelegate.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 26.
 * @modified 2012. 1. 26.
 */
public class LoginServiceDelegate {
    private static final Logger logger = Logger.getLogger(LoginServiceDelegate.class.getName());
    
    private LoginServiceIAsync _loginService = GWT.create(LoginServiceI.class);
    
    void login(String name, String password) {
        _loginService.login(name, password, new AsyncCallback<ResultI>() {
            
            @Override
            public void onSuccess(ResultI result) {
                logger.finest("onSuucess() : status = " + result.status() + ", result message = " + result.getResult());
                if (result.status()) {
                    LoginServiceForm.getInstance().processLoginSuccess();                    
                } else {
                    LoginServiceForm.getInstance().showLoginFailed();
                }
            }
            
            @Override
            public void onFailure(Throwable caught) {
                GWT.log(getClass() + ": onFailure() = " + caught);
                LoginServiceForm.getInstance().showLoginErrorMessage(caught);
            }
        });
    }
}
