package com.mc.contract.response;

import com.mc.contract.BaseResponse;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(callSuper = true)
public class DemoResponse extends BaseResponse {
    private String param1;
    private String param2;
    private String param3;

    private Date param4;
}

