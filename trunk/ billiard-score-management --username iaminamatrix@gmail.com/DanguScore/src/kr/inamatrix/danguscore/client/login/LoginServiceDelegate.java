/**
 * 
 */
package kr.inamatrix.danguscore.client.login;


import kr.inamatrix.danguscore.common.ResultI;

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
    private LoginServiceIAsync _loginService = GWT.create(LoginServiceI.class);
    
    void login(String name, String password) {
        _loginService.login(name, password, new AsyncCallback<ResultI>() {
            
            @Override
            public void onSuccess(ResultI result) {
                if (result.status()) {
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
