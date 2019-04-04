package com.mc.iservices;

import com.mc.contract.bo.DemoModel;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public interface IDemoService {
    Integer add(DemoModel model);
    Integer add1(DemoModel model);
    List<DemoModel> getAllData();

    Integer del(DemoModel demoModel) throws SQLException;
    Integer del1(DemoModel demoModel);
    DemoModel getByKey(DemoModel model) ;

}
