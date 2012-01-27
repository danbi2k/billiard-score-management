/**
 * 
 */
package kr.inamatrix.danguscore.models;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Title: GamerModel.java<br>
 * Description: 게이머 정보 모델<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class GamerInfoModel implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 5098585061350512614L;
    
    @PrimaryKey
    @Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
    private Long _id;
    
    @Persistent
    private String _name;
    
    @Persistent
    private String _password;
    
    @Persistent
    private int _score;
    
    @Persistent
    private String _email;

    @Persistent
    private long _registDate;
    
    @Persistent
    private VsPlayerModel _vsPlayerTableModel;
    
    /**
     * @param builder
     */
    private GamerInfoModel(Builder builder) {
        _name = builder._name;
        _password = builder._password;
        _score = builder._score;
        _email = builder._email;
        _registDate = builder._registDate;
        _vsPlayerTableModel = builder._vsPlayerTableModel;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return _id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return _name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return _score;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @return the registDate
     */
    public long getRegistDate() {
        return _registDate;
    }

    /**
     * @return the vsPlayerTableModel
     */
    public VsPlayerModel getVsPlayerTableModel() {
        return _vsPlayerTableModel;
    }

    public static final class Builder {
        private String _name;
        private String _password;
        private int _score;
        private String _email;
        private long _registDate;
        private VsPlayerModel _vsPlayerTableModel;
        public Builder(String name, String password) {
            _name = name;
            _password = password;
        }
        
        public Builder setScore(int score) {
            _score = score;
            return this;
        }
        
        public Builder setEmail(String email) {
            _email = email;
            return this;
        }
        
        public Builder setRegistDate(long registDate) {
            _registDate = registDate;
            return this;
        }
        
        public Builder setVsPlayerTableModel(VsPlayerModel vsPlayerTableModel) {
            _vsPlayerTableModel = vsPlayerTableModel;
            return this;
        }
        
        public GamerInfoModel build() {
            return new GamerInfoModel(this);
        }
    }
}
