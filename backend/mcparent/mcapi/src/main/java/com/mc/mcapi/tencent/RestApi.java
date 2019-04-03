package com.mc.mcapi.tencent;

import com.mc.contract.bo.DemoModel;
import com.mc.contract.request.DemoRequest;
import com.mc.contract.response.DemoResponse;
import com.mc.iservices.IDemoService;
import com.mc.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("rest")
public class RestApi {

    @Resource
    IDemoService demoService;

    @GetMapping
    @RequestMapping("demo")
    @ResponseBody
    public DemoResponse getIndex(DemoRequest request){
        DemoResponse demoResponse=new DemoResponse();
        List<DemoModel> list=demoService.getAllData();
        demoResponse.setDemoModelList(list);
        demoResponse.setResult("result");
        demoResponse.setCode(1);
        demoResponse.setRequestIp("127.0.0.1");
        return demoResponse;
    }

    @GetMapping
    @RequestMapping("del")
    @ResponseBody
    public DemoResponse del(DemoRequest request){
        DemoModel demoModel=new DemoModel();
        demoModel.setId(request.getId());
        try {
            demoService.del(demoModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        demoService.del1(demoModel);
        return new DemoResponse();
    }
    @GetMapping
    @RequestMapping("del1")
    @ResponseBody
    public DemoResponse del1(DemoRequest request){
        DemoModel demoModel=new DemoModel();
        demoModel.setId(request.getId());
        try {
            demoService.del1(demoModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DemoResponse();
    }

    @GetMapping
    @RequestMapping("get")
    @ResponseBody
    public DemoResponse get(DemoRequest request){
        DemoModel demoModel=new DemoModel();
        demoModel.setId(request.getId());
        demoModel= demoService.getByKey(demoModel);


        DemoResponse response= new DemoResponse();
        List<DemoModel> demoModels=new ArrayList<>();
        demoModels.add(demoModel);
        response.setDemoModelList(demoModels);
        return response;
    }
}
