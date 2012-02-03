/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import kr.inamatrix.danguscore.shared.common.ResultI;
import kr.inamatrix.danguscore.shared.models.GamerInfoModel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Title: RegistGamerDelegate.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public class ManagementGamerDelegate {
    private ManagementGamerIAsync _management = GWT.create(ManagementGamerI.class);
    
    void checkIdDuplicate(String id) {
        _management.checkIdDuplicate(id, new AsyncCallback<ResultI>() {
            @Override
            public void onSuccess(ResultI result) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onFailure(Throwable caught) {
                // TODO Auto-generated method stub
                
            }
        });
    }

    void regiestGamer(GamerInfoModel model) {
        _management.regiestGamer(model, new AsyncCallback<ResultI>() {
            @Override
            public void onSuccess(ResultI result) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onFailure(Throwable caught) {
                // TODO Auto-generated method stub
                
            }
        });
    }

    void updateGamer(GamerInfoModel model) {
        _management.updateGamer(model, new AsyncCallback<ResultI>() {
            @Override
            public void onSuccess(ResultI result) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onFailure(Throwable caught) {
                // TODO Auto-generated method stub
                
            }
        });
    }

    void deleteGamer(GamerInfoModel model) {
        _management.deleteGamer(model, new AsyncCallback<ResultI>() {
            @Override
            public void onSuccess(ResultI result) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onFailure(Throwable caught) {
                // TODO Auto-generated method stub
                
            }
        });
    }
}
