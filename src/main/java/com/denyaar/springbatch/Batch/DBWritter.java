/**
 * Created by tendaimupezeni for SpringBatch
 * User: tendaimupezeni
 * Date: 8/7/23
 * Time: 11:08 PM
 */

package com.denyaar.springbatch.Batch;


import com.denyaar.springbatch.Model.User;
import com.denyaar.springbatch.Repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWritter implements ItemWriter<User>{


    UserRepository userRepository;

    @Autowired
    public DBWritter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void write(List <? extends User> users) throws Exception {
        System.out.println("Data Saved For Users : "  + users);
        userRepository.saveAll(users);
    }

}
