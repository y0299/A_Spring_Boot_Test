package com.didispace.Business.Service;

import com.didispace.Business.Module.CalcScore;
import com.didispace.Business.interfaces.CheckAop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by anson on 2017/10/17.
 */
@Slf4j
public class CalcScoreImpl implements CalcScore{
    @Override
    @CheckAop
    public void calcScore(int score) {
        log.info("the score is :{}", score/2);
        return;
    }
}
