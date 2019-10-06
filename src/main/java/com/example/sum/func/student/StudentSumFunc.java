package com.example.sum.func.student;

import com.example.sum.func.outter.facade.StudentSumFuncFacade;
import com.example.sum.func.outter.invoke.StudentInv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StudentSumFunc implements StudentSumFuncFacade {
    @Autowired
    private StudentInv studentInv;

    public int getScoreSum(){
        List<Integer> scoreList=studentInv.getStudentAllScore();
        int sum=0;
        for (int i:scoreList) {
            sum+=i;
        }
        return sum;
    }
}
