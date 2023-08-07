/**
 * Created by tendaimupezeni for SpringBatch
 * User: tendaimupezeni
 * Date: 8/7/23
 * Time: 8:30 PM
 */

package com.denyaar.springbatch.Repository;

import com.denyaar.springbatch.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
