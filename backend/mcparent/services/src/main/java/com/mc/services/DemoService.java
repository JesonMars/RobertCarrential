package com.mc.services;

import com.mc.contract.bo.DemoModel;
import com.mc.iservices.IDemoService;
import com.mc.mapper.demo.IReader.IDemoReader;
import com.mc.mapper.demo.IWriter.IDemoWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DemoService implements IDemoService {
    @Autowired
    IDemoWriter demoWriter;

    @Autowired
    IDemoReader demoReader;

    @Override
    public Integer add(DemoModel model) {

        //转化为po的DemoModel
        com.mc.contract.po.DemoModel demoModel=convertBoToPo(model);
        return demoWriter.insert(demoModel);
    }

    @Override
    public List<DemoModel> getAllData() {
        List<com.mc.contract.po.DemoModel>  demoModelList= demoReader.selectAll();
        return convertListPoToBo(demoModelList);
    }

    /**
     * 将bo的DemoModel对象转化为po的DemoModel对象
     * @param model
     * @return
     */
    private com.mc.contract.po.DemoModel convertBoToPo(DemoModel model){
        com.mc.contract.po.DemoModel demoModel=new com.mc.contract.po.DemoModel();

        demoModel.setCtime(model.getCtime());
        demoModel.setId(model.getId());
        demoModel.setIsEnable(model.getIsEnable());
        demoModel.setName(model.getName());
        demoModel.setSex(model.getSex());
        demoModel.setStore(model.getStore());
        demoModel.setUtime(model.getUtime());
        return demoModel;
    }
    /**
     * 将po的DemoModel对象转化为bo的DemoModel对象
     * @param model
     * @return
     */
    private DemoModel convertPoToBo(com.mc.contract.po.DemoModel model){
        DemoModel demoModel=new DemoModel();

        demoModel.setCtime(model.getCtime());
        demoModel.setId(model.getId());
        demoModel.setIsEnable(model.getIsEnable());
        demoModel.setName(model.getName());
        demoModel.setSex(model.getSex());
        demoModel.setStore(model.getStore());
        demoModel.setUtime(model.getUtime());
        return demoModel;
    }

    /**
     * 将po的DemoModelList对象转化为bo的DemoModelList对象
     * @param demoModelList
     * @return
     */
    private List<DemoModel> convertListPoToBo(List<com.mc.contract.po.DemoModel> demoModelList){
        List<DemoModel> list=new ArrayList<>();
        for (com.mc.contract.po.DemoModel de:demoModelList) {
            list.add(convertPoToBo(de));
        }

        return list;
    }
}
