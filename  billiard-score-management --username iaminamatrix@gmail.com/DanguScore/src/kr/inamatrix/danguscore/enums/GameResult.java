
/**
 * 
 */
package kr.inamatrix.danguscore.enums;

/**
 * Title: Result.java<br>
 * Description: 게임 결과 저장용 enum 클래스<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public enum GameResult {
    WIN, LOSE, TIMEOUT;
    
    int playTime;

    /**
     * @return the time
     */
    public int getPlayTime() {
        return playTime;
    }

    /**
     * @param time the time to set
     */
    public void setPlayTime(int time) {
        this.playTime = time;
    }
}
