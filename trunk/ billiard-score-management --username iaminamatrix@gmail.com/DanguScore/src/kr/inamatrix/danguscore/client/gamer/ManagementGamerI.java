/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import kr.inamatrix.danguscore.common.ResultI;
import kr.inamatrix.danguscore.models.GamerInfoModel;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Title: RegistGamerI.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
@RemoteServiceRelativePath("management")
public interface ManagementGamerI extends RemoteService {
    ResultI checkIdDuplicate(String id);
    ResultI regiestGamer(GamerInfoModel model);
    ResultI updateGamer();
}
