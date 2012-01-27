/**
 * 
 */
package kr.inamatrix.danguscore.client.login;

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
    private LoginServiceIAsync loginService = GWT.create(LoginServiceI.class);
    
    void login(String name, String password) {
        loginService.login(name, password, new AsyncCallback<Boolean>() {
            
            @Override
            public void onSuccess(Boolean result) {
                if (result.booleanValue()) {
                    LoginServiceForm.getInstance().processLoginSuccess();                    
                } else {
                    LoginServiceForm.getInstance().showLoginFailed();
                }
            }
            
            @Override
            public void onFailure(Throwable caught) {
                LoginServiceForm.getInstance().showLoginErrorMessage(caught);
            }
        });
    }
}
