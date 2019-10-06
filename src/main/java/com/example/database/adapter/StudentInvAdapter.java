package com.example.database.adapter;

import com.example.database.func.outter.facade.StudentScoreListFacade;
import com.example.sum.func.outter.invoke.StudentInv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentInvAdapter implements StudentInv {
//    @Autowired
//    private StudentMapper studentMapper;

    @Autowired
    private StudentScoreListFacade studentScoreListFacade;

    @Override
    public List<Integer> getStudentAllScore() {
//        return studentMapper.getAllScore();
        return studentScoreListFacade.getScoreList();
    }
}
