/**
 * 
 */
package kr.inamatrix.danguscore.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Title: Constants.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 13.
 * @modified 2012. 1. 13.
 */
public class Constants {
    public static final String NULL = "NULL";
    
    private static Properties PROPS = new Properties();
    private static final String DEFAULT_PROPS_PATH = "/war/resources/constants.properties";
    
    private Constants() {
        initailze();
    }
    
    
    /**
     * 
     */
    private void initailze() {
        String propsPath = System.getProperty("PROPERTY_PATH");
        if (StringUtil.isEmptyString(propsPath)) {
            propsPath = DEFAULT_PROPS_PATH;
        }
        FileInputStream fis;
        try {
            fis = new FileInputStream(new File(propsPath));
            PROPS.load(fis);
        } catch ( FileNotFoundException e ) {
            e.printStackTrace();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
    
    public static final String get(String key) {
        return PROPS.getProperty(key, NULL).toString();
    }
}
