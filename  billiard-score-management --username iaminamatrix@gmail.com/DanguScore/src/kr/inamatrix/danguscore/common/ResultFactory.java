/**
 * 
 */
package kr.inamatrix.danguscore.common;

import kr.inamatrix.danguscore.enums.Result;

/**
 * Title: ResultFactory.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 30.
 * @modified 2012. 1. 30.
 */
public class ResultFactory {
    public static final ResultI createSucessResult(String result) {
        RetrieveResultC resultObject = new RetrieveResultC();
        resultObject.setResult(Result.SUCESS, result);
        return resultObject;
    }
    
    public static final ResultI createFailureResult(String  result) {
        RetrieveResultC resultObject = new RetrieveResultC();
        resultObject.setResult(Result.FAILURE, result);
        return resultObject;
    }
}
