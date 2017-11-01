package com.didispace.Business.Service;

import com.didispace.Business.Module.CalcScore;
import com.didispace.Business.interfaces.CheckAop;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by anson on 2017/10/18.
 */
@Slf4j
public class CalcScoreSecondImpl implements CalcScore{
    @Override
    @CheckAop
    public void calcScore(int score) {
        log.info("CalcScoreSecondImpl ---> the score is :{}", score/10);
        return;
    }
}
