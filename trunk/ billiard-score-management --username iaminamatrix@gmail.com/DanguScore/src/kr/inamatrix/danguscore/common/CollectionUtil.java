/**
 * 
 */
package kr.inamatrix.danguscore.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/**
 * Title: CollectionUtil.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 13.
 * @modified 2012. 1. 13.
 */
public class CollectionUtil {
    private CollectionUtil() {
        
    }
    
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }
    
    public static <K, V> Hashtable<K, V> newHashtable() {
        return new Hashtable<K, V>();
    }
    
    public static <K, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<K, V>();
    }
    
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<E>();
    }
    
    public static <E> Vector<E> newVector() {
        return new Vector<E>();
    }
    
    public static final boolean isEmptyCollection(Collection<?> col) {
        if ( col == null || col.isEmpty() ) {
            return true;
        }
        
        return false;
    }
    
    public static final boolean isEmptyMap(Map<?, ?> map) {
        if ( map == null || map.isEmpty() ) {
            return true;
        }
        
        return false;
    }
}
