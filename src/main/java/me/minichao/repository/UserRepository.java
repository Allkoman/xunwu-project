package me.minichao.repository;

import me.minichao.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * user repository
 *
 * @author zhangchao
 * @date 2018/15/09
 */

public interface UserRepository extends CrudRepository<User, Long> {

}
