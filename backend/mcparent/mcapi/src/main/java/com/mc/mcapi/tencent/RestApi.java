package com.mc.mcapi.tencent;

import com.mc.contract.request.DemoRequest;
import com.mc.contract.response.DemoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("rest")
public class RestApi {



    @GetMapping
    @RequestMapping("demo")
    public DemoResponse getIndex(DemoRequest request){
        DemoResponse demoResponse=new DemoResponse();
        demoResponse.setResult("result");
        demoResponse.setCode(1);
        demoResponse.setRequestIp("127.0.0.1");
        return demoResponse;
    }
}
