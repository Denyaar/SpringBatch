/**
 * Created by tendaimupezeni for SpringBatch
 * User: tendaimupezeni
 * Date: 8/7/23
 * Time: 10:52 PM
 */

package com.denyaar.springbatch.Batch;

import com.denyaar.springbatch.Model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User,User> {
    private  static final Map<String,String> DEPT_NAMES = new HashMap<>();
    public Processor(){
        DEPT_NAMES.put("001","IS-TESCH");
        DEPT_NAMES.put("002","OPERATIONS");
        DEPT_NAMES.put("003","ACCOUNTS");
    }

    @Override
    public User process(User user) throws Exception {
        String deptCode  =  user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        user.setTime(new Date());
        System.out.printf(String.format("Converted from [%s]  to [%s]"));
        return null;
    }

}
