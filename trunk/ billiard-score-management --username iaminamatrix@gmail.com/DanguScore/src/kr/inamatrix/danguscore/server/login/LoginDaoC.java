/**
 * 
 */
package kr.inamatrix.danguscore.server.login;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import kr.inamatrix.danguscore.common.DaoUtil;
import kr.inamatrix.danguscore.models.GamerInfoModel;

/**
 * Title: LoginDaoC.java<br>
 * Description: Login 처리를 하는 클래스<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public class LoginDaoC implements LoginDaoI {
    
    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.server.login.LoginDaoI#login(java.lang.String, java.lang.String)
     */
    @Override
    public boolean login(String name, String password) {
        PersistenceManager pm = DaoUtil.getPersistentManager();
        Query query = pm.newQuery(GamerInfoModel.class);
        query.setFilter("name==\' "+ name + "\'&& password==\'"+password+"\'");
        return query.execute() != null;
    }
}
