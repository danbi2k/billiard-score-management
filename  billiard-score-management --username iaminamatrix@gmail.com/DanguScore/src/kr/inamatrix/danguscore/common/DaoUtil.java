/**
 * 
 */
package kr.inamatrix.danguscore.common;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

/**
 * Title: DaoUtil.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public class DaoUtil {
    private DaoUtil() {
        
    }
    
    private static final PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("transactions-optional");
    public static final PersistenceManager getPersistentManager() {
        return pmfInstance.getPersistenceManager();
    }
}
