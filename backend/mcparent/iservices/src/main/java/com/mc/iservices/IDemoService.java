package com.mc.iservices;

import com.mc.contract.bo.DemoModel;

import java.util.List;

public interface IDemoService {
    Integer add(DemoModel model);

    List<DemoModel> getAllData();
}
