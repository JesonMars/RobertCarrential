package com.mc.mcapi.tencent;

import com.mc.contract.bo.DemoModel;
import com.mc.contract.request.DemoRequest;
import com.mc.contract.response.DemoResponse;
import com.mc.iservices.IDemoService;
import com.mc.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
}
