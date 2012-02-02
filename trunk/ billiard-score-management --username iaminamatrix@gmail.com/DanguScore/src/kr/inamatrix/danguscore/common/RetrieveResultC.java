/**
 * 
 */
package kr.inamatrix.danguscore.common;

import kr.inamatrix.danguscore.enums.Result;

/**
 * Title: RetrieveResult.java<br>
 * Description: 조회 결과를 반환하는 결과 class.<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 30.
 * @modified 2012. 1. 30.
 */
public class RetrieveResultC implements ResultI {
    /**
     * 
     */
    private static final long serialVersionUID = -7630839365371609057L;
    
    private String _resultMessage;
    private Result _result;
    
    public final boolean status() {
        return _result.status();
    }
    
    public final String getResult() {
        return _resultMessage;
    }
    
    public void setResult(Result result, String message) {
        _resultMessage = StringUtil.isEmptyString(message)? result.name() : message;
        _result = result;
    }
}
