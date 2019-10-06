package com.example.sum.adapter;

import com.example.sum.func.outter.facade.StudentSumFuncFacade;
import com.example.web.func.outter.invoke.ScoreSumInv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScoreSumAdapter implements ScoreSumInv {
    @Autowired
    private StudentSumFuncFacade studentSumFuncFacade;

    @Override
    public int getSum() {
        return studentSumFuncFacade.getScoreSum();
    }
}
