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

import kr.inamatrix.danguscore.shared.enums.GameResult;
import kr.inamatrix.danguscore.shared.exceptions.ValueIsOutOfRangeException;

/**
 * Title: VsPlayerTableModel.java<br>
 * Description: 게이며 게임 정보 모델<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class VsPlayerModel implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 2106986454092370366L;
    
    @PrimaryKey
    @Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
    private Long _id;
    
    @Persistent
    private Long _vsPlayer;

    @Persistent
    private int _myCurrentScore;
    
    @Persistent
    private int _vsPlayerScore;
    
    @Persistent
    private GameResult _result;
    
    @Persistent
    private int _fine;
    
    @Persistent
    private long _playDate;
    
    public VsPlayerModel() {
        
    }
    
    private VsPlayerModel(Builder builder) {
        _vsPlayer = builder._vsPlayer;
        _myCurrentScore = builder._myCurrentScore;
        _vsPlayerScore = builder._vsPlayerScore;
        _result = builder._result;
        _playDate = builder._playDate;
        _fine = builder._fine;
    }
    
    
    /**
     * @return the id
     */
    public Long getId() {
        return _id;
    }


    /**
     * @return the vsPlayer
     */
    public Long getVsPlayer() {
        return _vsPlayer;
    }


    /**
     * @return the myCurrentScore
     */
    public int getMyCurrentScore() {
        return _myCurrentScore;
    }


    /**
     * @return the vsPlayerScore
     */
    public int getVsPlayerScore() {
        return _vsPlayerScore;
    }


    /**
     * @return the result
     */
    public GameResult getResult() {
        return _result;
    }
    
    /**
     * @return the fine
     */
    public int getFine() {
        return _fine;
    }
    
    /**
     * @return the gameDate
     */
    public long getPlayDate() {
        return _playDate;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("_id").append("=").append(_id).append("\n");
        builder.append("_vsPlayer").append("=").append(_vsPlayer).append("\n");
        builder.append("_myCurrentScore").append("=").append(_myCurrentScore).append("\n");
        builder.append("_vsPlayerScore").append("=").append(_vsPlayerScore).append("\n");
        builder.append("_result").append("=").append(_result).append("\n");
        builder.append("_fine").append("=").append(_fine).append("\n");
        return builder.toString();
    }

    public static final class Builder {
        private Long _vsPlayer;
        private int _myCurrentScore;
        private int _vsPlayerScore;
        private int _fine;
        private GameResult _result;
        private long _playDate;
        
        public Builder(Long vsPlayer, int myCurrentScore, int vsPlayerScore) {
            _vsPlayer = vsPlayer;
            _myCurrentScore = myCurrentScore;
            _vsPlayerScore = vsPlayerScore; 
        }
        
        public Builder setResult(GameResult result) {
            _result = result;
            return this;
        }
        
        public Builder setGameDate(long playDate) {
            _playDate = playDate;
            return this;
        }
        
        public Builder setFine(int fine) {
            _fine = fine;
            return this;
        }
        
        public VsPlayerModel build() throws ValueIsOutOfRangeException {
            if (_result == GameResult.WIN || _result == GameResult.LOSE) {
                if (_result.getPlayTime() <= 0 || _result.getPlayTime() > 25) {
                    throw new ValueIsOutOfRangeException(0, 25);
                }
            }
            return new VsPlayerModel(this);
        }
    }
}
