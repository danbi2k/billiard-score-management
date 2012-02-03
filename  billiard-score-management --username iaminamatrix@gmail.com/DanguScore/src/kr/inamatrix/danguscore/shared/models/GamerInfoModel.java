/**
 * 
 */
package kr.inamatrix.danguscore.shared.models;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import kr.inamatrix.danguscore.shared.common.StringUtil;
import kr.inamatrix.danguscore.shared.exceptions.PasswordDoesNotConfirmException;

/**
 * Title: GamerInfoModel.java<br>
 * Description: 선수 정보를 저장하는 모델 class<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 2. 3.
 * @modified 2012. 2. 3.
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
    private String passwordConfirm;

    @Persistent
    private int _score;
    
    @Persistent
    private String _email;

    @Persistent
    private long _registDate;
    
    @Persistent
    private VsPlayerModel _vsPlayerTableModel;
    
    public GamerInfoModel() {
        
    }
    
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
     * @return the passwordConfirm
     */
    public String getPasswordConfirm() {
        return passwordConfirm;
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
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("_id").append("=").append(_id).append("\n");
        builder.append("_name").append("=").append(_name).append("\n");
        builder.append("_password").append("=").append(_password).append("\n");
        builder.append("_score").append("=").append(_score).append("\n");
        builder.append("_email").append("=").append(_email).append("\n");
        builder.append("_registDate").append("=").append(_registDate).append("\n");
        return builder.toString();
    }

    public static final class Builder {
        private String _name;
        private String _password;
        private String _passwordConfirm;
        private int _score;
        private String _email;
        private long _registDate;
        private VsPlayerModel _vsPlayerTableModel;
        public Builder(String name, String password) {
            _name = name;
            _password = password;
        }
        
        public Builder setPasswordConfirm(String passwordConfirm) {
            _passwordConfirm = passwordConfirm;
            return this;
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
        
        public GamerInfoModel build() throws PasswordDoesNotConfirmException {
            if (!StringUtil.isEquals(_password, _passwordConfirm) || (_password == null && _passwordConfirm == null)) {
                throw new PasswordDoesNotConfirmException();
            }
            return new GamerInfoModel(this);
        }
    }
}
