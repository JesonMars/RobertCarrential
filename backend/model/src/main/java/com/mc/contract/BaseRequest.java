package com.mc.contract;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.util.Date;

@Serialization
@Data
public class BaseRequest {
    private int code;
    private String requestIp;
    private String result;
    private Date ctime;
}
