package com.example.web.func.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.web.func.model.SumModel;
import com.example.web.func.outter.invoke.ScoreSumInv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreSumController {
    @Autowired
    private ScoreSumInv scoreSumInv;

    @GetMapping("/sum")
    public String getSum(){
        SumModel sumModel=new SumModel();
        sumModel.setSum(scoreSumInv.getSum());
        JSONObject json=new JSONObject();
        json.put("code",0);
        json.put("data",sumModel);
        json.put("status",true);
        json.put("operation","get students scores sum");
        return json.toJSONString();
    };
}
