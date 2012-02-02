/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import kr.inamatrix.danguscore.shared.common.ResultI;
import kr.inamatrix.danguscore.shared.models.GamerInfoModel;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Title: RegistGamerIAsync.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public interface ManagementGamerIAsync {
    void checkIdDuplicate(String id, AsyncCallback<ResultI> callback);

    void regiestGamer(GamerInfoModel model, AsyncCallback<ResultI> callback);

    void updateGamer(AsyncCallback<ResultI> callback);
    
}
