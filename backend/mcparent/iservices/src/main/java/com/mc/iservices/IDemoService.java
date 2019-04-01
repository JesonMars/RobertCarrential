package com.mc.iservices;

import com.mc.contract.bo.DemoModel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IDemoService {
    Integer add(DemoModel model);

    List<DemoModel> getAllData();
}
