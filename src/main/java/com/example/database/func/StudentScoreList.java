package com.example.database.func;

import com.example.database.func.outter.facade.StudentScoreListFacade;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentScoreList implements StudentScoreListFacade {
    public List<Integer> getScoreList(){
        List<Integer> list=new ArrayList<>();
        list.add(59);
        list.add(47);
        list.add(90);
        list.add(45);
        list.add(74);
        return list;
    }
}
