package com.mc.contract.response;

import com.mc.contract.BaseResponse;
import com.mc.contract.bo.DemoModel;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(callSuper = true)
public class DemoResponse extends BaseResponse {

    private DemoModel demoModel;
}

