/**
 * 
 */
package kr.inamatrix.danguscore.server.gamer;

import kr.inamatrix.danguscore.client.gamer.ManagementGamerI;
import kr.inamatrix.danguscore.shared.common.ResultI;
import kr.inamatrix.danguscore.shared.models.GamerInfoModel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Title: RegistGamerC.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public class ManagementGamerC extends RemoteServiceServlet implements ManagementGamerI {
    /**
     * 
     */
    private static final long serialVersionUID = -8016915057318304835L;

    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.client.gamer.ManagementGamerI#checkIdDuplicate(java.lang.String)
     */
    @Override
    public ResultI checkIdDuplicate(String id) {
        GWT.log("checkIdDuplicate() Start : id = " + id);
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.client.gamer.ManagementGamerI#regiestGamer(kr.inamatrix.danguscore.shared.models.GamerInfoModel)
     */
    @Override
    public ResultI regiestGamer(GamerInfoModel model) {
        GWT.log("regiestGamer() Start : id = " + model);
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.client.gamer.ManagementGamerI#updateGamer(kr.inamatrix.danguscore.shared.models.GamerInfoModel)
     */
    @Override
    public ResultI updateGamer(GamerInfoModel model) {
        GWT.log("updateGamer() Start : id = " + model);
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.client.gamer.ManagementGamerI#deleteGamer(kr.inamatrix.danguscore.shared.models.GamerInfoModel)
     */
    @Override
    public ResultI deleteGamer(GamerInfoModel model) {
        GWT.log("deleteGamer() Start : id = " + model);
        // TODO Auto-generated method stub
        return null;
    }

}
