/**
 * 
 */
package kr.inamatrix.danguscore.client.main;

import kr.inamatrix.danguscore.shared.exceptions.NoSessionFoundException;
import kr.inamatrix.danguscore.shared.models.GamerInfoModel;

/**
 * Title: MainSession.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 2. 6.
 * @modified 2012. 2. 6.
 */
public class SessionInfo {
    private static SessionInfo instance;
    
    private GamerInfoModel _session;
    
    public SessionInfo() {
        
    }
    
    public static final SessionInfo newInstance(GamerInfoModel session) {
        if (instance == null) {
            instance = new SessionInfo();
        }
        instance.setSession(session);
        return instance;
    }
    
    
    public static final SessionInfo getInstance() throws NoSessionFoundException {
        if (instance == null) {
            throw new NoSessionFoundException();
        }
        return instance;
    }
    
    public boolean isAdmin() {
        return _session.isAdmin();
    }

    /**
     * @return the session
     */
    public GamerInfoModel getSession() {
        return _session;
    }

    /**
     * @param session the session to set
     */
    private void setSession(GamerInfoModel session) {
        this._session = session;
    }
}
