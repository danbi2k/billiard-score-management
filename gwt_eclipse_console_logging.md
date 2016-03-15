#eclipse console logging in GWT

# Eclipse console에 log를 출력하는 방법 #

Module 별 log 출력 방법에 대해 고민한다.


### 모듈별 gwt.xml 수정방법 ###
다음과 같은 내용을 모듈에 추가한다.



&lt;inherits name="com.google.gwt.logging.Logging"/&gt;




&lt;set-property name="gwt.logging.logLevel" value="INFO"/&gt;




&lt;set-property name="gwt.logging.enabled" value="TRUE"/&gt;




&lt;set-property name="gwt.logging.consoleHandler" value="DISABLED"/&gt;




&lt;set-property name="gwt.logging.developmentModeHandler" alue="DISABLED" /&gt;




&lt;set-property name="gwt.logging.popupHandler" value="DISABLED" /&gt;




&lt;set-property name="gwt.logging.systemHandler" value="ENABLED" /&gt;




&lt;set-property name="gwt.logging.firebugHandler" value="DISABLED" /&gt;




&lt;set-property name="gwt.logging.simpleRemoteHandler" value="DISABLED" /&gt;



logLevel은 java.util.logging.Logger에 지정하는 logger level이다. logging을 enable하고, systemHandler를 ENABLED 처리를 하면 log를 Eclipse console에서 확인할 수 있다.

기타 다른 handler에서는 어떻게 출력하는지 모르겠다. 일단 정말 절실히 필요한 eclipse log를 출력할 수 있도록 해당 부분만 사용한다.