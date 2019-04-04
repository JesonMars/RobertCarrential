package com.mc.services;

import com.mc.contract.bo.DemoModel;
import com.mc.iservices.IDemoService;
import com.mc.mapper.demo.IReader.IDemoReader;
import com.mc.mapper.demo.IWriter.IDemoWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DemoService implements IDemoService {
    @Autowired
    IDemoWriter demoWriter;

    @Autowired
    IDemoReader demoReader;

    @Transactional
    @Override
    public Integer add(DemoModel model) {

        //转化为po的DemoModel
        com.mc.contract.po.DemoModel demoModel1=convertBoToPo(model);
        demoWriter.insert(demoModel1);

        com.mc.contract.po.DemoModel demoModel=new com.mc.contract.po.DemoModel();
        demoModel.setId(1);
        demoModel.setIsEnable(1232131);
        demoModel.setUtime(new Date());
        demoModel.setStore(123);
        demoModel.setName("test");
        demoModel.setSex("M");
        return demoWriter.insert(demoModel);
    }

    @Transactional
    @Override
    public Integer add1(DemoModel model) {

        //转化为po的DemoModel
        com.mc.contract.po.DemoModel demoModel1=convertBoToPo(model);
        return demoWriter.insert(demoModel1);

    }

    @Override
    public DemoModel getByKey(DemoModel model) {

        com.mc.contract.po.DemoModel po=new com.mc.contract.po.DemoModel();
        po.setId(model.getId());
        //转化为po的DemoModel
        com.mc.contract.po.DemoModel demoModel=demoReader.selectByPrimaryKey(po.getId());
        return convertPoToBo(demoModel);
    }

    @Override
    public List<DemoModel> getAllData() {
        List<com.mc.contract.po.DemoModel>  demoModelList= demoReader.selectAll();
        return convertListPoToBo(demoModelList);
    }

    @Transactional
    @Override
    public Integer del(DemoModel demoModel) throws SQLException {
        Integer integer= demoWriter.deleteByPrimaryKey(demoModel.getId());
        throw new SQLException();
    }

    @Transactional
    @Override
    public Integer del1(DemoModel demoModel) {
        Integer integer=demoWriter.deleteByPrimaryKey(demoModel.getId());
        return integer;
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
